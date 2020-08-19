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
    // InternalAndroidGeneratorParser.g:57:1: entryRuleAndroidAppProject returns [EObject current=null] : iv_ruleAndroidAppProject= ruleAndroidAppProject EOF ;
    public final EObject entryRuleAndroidAppProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndroidAppProject = null;


        try {
            // InternalAndroidGeneratorParser.g:57:58: (iv_ruleAndroidAppProject= ruleAndroidAppProject EOF )
            // InternalAndroidGeneratorParser.g:58:2: iv_ruleAndroidAppProject= ruleAndroidAppProject EOF
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
    // InternalAndroidGeneratorParser.g:64:1: ruleAndroidAppProject returns [EObject current=null] : ( (lv_applications_0_0= ruleApplication ) )* ;
    public final EObject ruleAndroidAppProject() throws RecognitionException {
        EObject current = null;

        EObject lv_applications_0_0 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:70:2: ( ( (lv_applications_0_0= ruleApplication ) )* )
            // InternalAndroidGeneratorParser.g:71:2: ( (lv_applications_0_0= ruleApplication ) )*
            {
            // InternalAndroidGeneratorParser.g:71:2: ( (lv_applications_0_0= ruleApplication ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==App) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAndroidGeneratorParser.g:72:3: (lv_applications_0_0= ruleApplication )
            	    {
            	    // InternalAndroidGeneratorParser.g:72:3: (lv_applications_0_0= ruleApplication )
            	    // InternalAndroidGeneratorParser.g:73:4: lv_applications_0_0= ruleApplication
            	    {

            	    				newCompositeNode(grammarAccess.getAndroidAppProjectAccess().getApplicationsApplicationParserRuleCall_0());
            	    			
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
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // InternalAndroidGeneratorParser.g:93:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // InternalAndroidGeneratorParser.g:93:52: (iv_ruleApplication= ruleApplication EOF )
            // InternalAndroidGeneratorParser.g:94:2: iv_ruleApplication= ruleApplication EOF
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
    // InternalAndroidGeneratorParser.g:100:1: ruleApplication returns [EObject current=null] : (otherlv_0= App otherlv_1= Colon ( (lv_name_2_0= RULE_ID ) ) ( (lv_attributes_3_0= ruleApplicationAttribute ) )* ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:106:2: ( (otherlv_0= App otherlv_1= Colon ( (lv_name_2_0= RULE_ID ) ) ( (lv_attributes_3_0= ruleApplicationAttribute ) )* ) )
            // InternalAndroidGeneratorParser.g:107:2: (otherlv_0= App otherlv_1= Colon ( (lv_name_2_0= RULE_ID ) ) ( (lv_attributes_3_0= ruleApplicationAttribute ) )* )
            {
            // InternalAndroidGeneratorParser.g:107:2: (otherlv_0= App otherlv_1= Colon ( (lv_name_2_0= RULE_ID ) ) ( (lv_attributes_3_0= ruleApplicationAttribute ) )* )
            // InternalAndroidGeneratorParser.g:108:3: otherlv_0= App otherlv_1= Colon ( (lv_name_2_0= RULE_ID ) ) ( (lv_attributes_3_0= ruleApplicationAttribute ) )*
            {
            otherlv_0=(Token)match(input,App,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getAppKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getApplicationAccess().getColonKeyword_1());
            		
            // InternalAndroidGeneratorParser.g:116:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAndroidGeneratorParser.g:117:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAndroidGeneratorParser.g:117:4: (lv_name_2_0= RULE_ID )
            // InternalAndroidGeneratorParser.g:118:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getApplicationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAndroidGeneratorParser.g:134:3: ( (lv_attributes_3_0= ruleApplicationAttribute ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Permissions||LA2_0==Elements||LA2_0==RULE_BEGIN) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAndroidGeneratorParser.g:135:4: (lv_attributes_3_0= ruleApplicationAttribute )
            	    {
            	    // InternalAndroidGeneratorParser.g:135:4: (lv_attributes_3_0= ruleApplicationAttribute )
            	    // InternalAndroidGeneratorParser.g:136:5: lv_attributes_3_0= ruleApplicationAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getApplicationAccess().getAttributesApplicationAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_attributes_3_0=ruleApplicationAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getApplicationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_3_0,
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
    // InternalAndroidGeneratorParser.g:157:1: entryRuleApplicationAttribute returns [EObject current=null] : iv_ruleApplicationAttribute= ruleApplicationAttribute EOF ;
    public final EObject entryRuleApplicationAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationAttribute = null;


        try {
            // InternalAndroidGeneratorParser.g:157:61: (iv_ruleApplicationAttribute= ruleApplicationAttribute EOF )
            // InternalAndroidGeneratorParser.g:158:2: iv_ruleApplicationAttribute= ruleApplicationAttribute EOF
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
    // InternalAndroidGeneratorParser.g:164:1: ruleApplicationAttribute returns [EObject current=null] : (this_ApplicationVersion_0= ruleApplicationVersion | this_ApplicationPermissionList_1= ruleApplicationPermissionList | this_ApplicationElementList_2= ruleApplicationElementList ) ;
    public final EObject ruleApplicationAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_ApplicationVersion_0 = null;

        EObject this_ApplicationPermissionList_1 = null;

        EObject this_ApplicationElementList_2 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:170:2: ( (this_ApplicationVersion_0= ruleApplicationVersion | this_ApplicationPermissionList_1= ruleApplicationPermissionList | this_ApplicationElementList_2= ruleApplicationElementList ) )
            // InternalAndroidGeneratorParser.g:171:2: (this_ApplicationVersion_0= ruleApplicationVersion | this_ApplicationPermissionList_1= ruleApplicationPermissionList | this_ApplicationElementList_2= ruleApplicationElementList )
            {
            // InternalAndroidGeneratorParser.g:171:2: (this_ApplicationVersion_0= ruleApplicationVersion | this_ApplicationPermissionList_1= ruleApplicationPermissionList | this_ApplicationElementList_2= ruleApplicationElementList )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_BEGIN:
                {
                alt3=1;
                }
                break;
            case Permissions:
                {
                alt3=2;
                }
                break;
            case Elements:
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
                    // InternalAndroidGeneratorParser.g:172:3: this_ApplicationVersion_0= ruleApplicationVersion
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
                    // InternalAndroidGeneratorParser.g:181:3: this_ApplicationPermissionList_1= ruleApplicationPermissionList
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
                    // InternalAndroidGeneratorParser.g:190:3: this_ApplicationElementList_2= ruleApplicationElementList
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
    // InternalAndroidGeneratorParser.g:202:1: entryRuleApplicationVersion returns [EObject current=null] : iv_ruleApplicationVersion= ruleApplicationVersion EOF ;
    public final EObject entryRuleApplicationVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationVersion = null;


        try {
            // InternalAndroidGeneratorParser.g:202:59: (iv_ruleApplicationVersion= ruleApplicationVersion EOF )
            // InternalAndroidGeneratorParser.g:203:2: iv_ruleApplicationVersion= ruleApplicationVersion EOF
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
    // InternalAndroidGeneratorParser.g:209:1: ruleApplicationVersion returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN otherlv_2= AndroidSDK otherlv_3= Colon ( (lv_result_4_0= ruleNumber ) ) ( (lv_targetsdk_5_0= ruleTargetSDK ) )? this_END_6= RULE_END ) ;
    public final EObject ruleApplicationVersion() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_END_6=null;
        EObject lv_result_4_0 = null;

        EObject lv_targetsdk_5_0 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:215:2: ( ( () this_BEGIN_1= RULE_BEGIN otherlv_2= AndroidSDK otherlv_3= Colon ( (lv_result_4_0= ruleNumber ) ) ( (lv_targetsdk_5_0= ruleTargetSDK ) )? this_END_6= RULE_END ) )
            // InternalAndroidGeneratorParser.g:216:2: ( () this_BEGIN_1= RULE_BEGIN otherlv_2= AndroidSDK otherlv_3= Colon ( (lv_result_4_0= ruleNumber ) ) ( (lv_targetsdk_5_0= ruleTargetSDK ) )? this_END_6= RULE_END )
            {
            // InternalAndroidGeneratorParser.g:216:2: ( () this_BEGIN_1= RULE_BEGIN otherlv_2= AndroidSDK otherlv_3= Colon ( (lv_result_4_0= ruleNumber ) ) ( (lv_targetsdk_5_0= ruleTargetSDK ) )? this_END_6= RULE_END )
            // InternalAndroidGeneratorParser.g:217:3: () this_BEGIN_1= RULE_BEGIN otherlv_2= AndroidSDK otherlv_3= Colon ( (lv_result_4_0= ruleNumber ) ) ( (lv_targetsdk_5_0= ruleTargetSDK ) )? this_END_6= RULE_END
            {
            // InternalAndroidGeneratorParser.g:217:3: ()
            // InternalAndroidGeneratorParser.g:218:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getApplicationVersionAccess().getApplicationVersionAction_0(),
            					current);
            			

            }

            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_7); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getApplicationVersionAccess().getBEGINTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,AndroidSDK,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getApplicationVersionAccess().getAndroidSDKKeyword_2());
            		
            otherlv_3=(Token)match(input,Colon,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getApplicationVersionAccess().getColonKeyword_3());
            		
            // InternalAndroidGeneratorParser.g:236:3: ( (lv_result_4_0= ruleNumber ) )
            // InternalAndroidGeneratorParser.g:237:4: (lv_result_4_0= ruleNumber )
            {
            // InternalAndroidGeneratorParser.g:237:4: (lv_result_4_0= ruleNumber )
            // InternalAndroidGeneratorParser.g:238:5: lv_result_4_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getApplicationVersionAccess().getResultNumberParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_result_4_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplicationVersionRule());
            					}
            					set(
            						current,
            						"result",
            						lv_result_4_0,
            						"org.xtext.example.mdsd.AndroidGenerator.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAndroidGeneratorParser.g:255:3: ( (lv_targetsdk_5_0= ruleTargetSDK ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==TargetSDK) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:256:4: (lv_targetsdk_5_0= ruleTargetSDK )
                    {
                    // InternalAndroidGeneratorParser.g:256:4: (lv_targetsdk_5_0= ruleTargetSDK )
                    // InternalAndroidGeneratorParser.g:257:5: lv_targetsdk_5_0= ruleTargetSDK
                    {

                    					newCompositeNode(grammarAccess.getApplicationVersionAccess().getTargetsdkTargetSDKParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_targetsdk_5_0=ruleTargetSDK();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getApplicationVersionRule());
                    					}
                    					set(
                    						current,
                    						"targetsdk",
                    						lv_targetsdk_5_0,
                    						"org.xtext.example.mdsd.AndroidGenerator.TargetSDK");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_6, grammarAccess.getApplicationVersionAccess().getENDTerminalRuleCall_6());
            		

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
    // InternalAndroidGeneratorParser.g:282:1: entryRuleTargetSDK returns [EObject current=null] : iv_ruleTargetSDK= ruleTargetSDK EOF ;
    public final EObject entryRuleTargetSDK() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetSDK = null;


        try {
            // InternalAndroidGeneratorParser.g:282:50: (iv_ruleTargetSDK= ruleTargetSDK EOF )
            // InternalAndroidGeneratorParser.g:283:2: iv_ruleTargetSDK= ruleTargetSDK EOF
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
    // InternalAndroidGeneratorParser.g:289:1: ruleTargetSDK returns [EObject current=null] : ( () otherlv_1= TargetSDK otherlv_2= Colon ( (lv_result_3_0= ruleNumber ) ) ( (lv_minsdk_4_0= ruleMinSDK ) )? ) ;
    public final EObject ruleTargetSDK() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_result_3_0 = null;

        EObject lv_minsdk_4_0 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:295:2: ( ( () otherlv_1= TargetSDK otherlv_2= Colon ( (lv_result_3_0= ruleNumber ) ) ( (lv_minsdk_4_0= ruleMinSDK ) )? ) )
            // InternalAndroidGeneratorParser.g:296:2: ( () otherlv_1= TargetSDK otherlv_2= Colon ( (lv_result_3_0= ruleNumber ) ) ( (lv_minsdk_4_0= ruleMinSDK ) )? )
            {
            // InternalAndroidGeneratorParser.g:296:2: ( () otherlv_1= TargetSDK otherlv_2= Colon ( (lv_result_3_0= ruleNumber ) ) ( (lv_minsdk_4_0= ruleMinSDK ) )? )
            // InternalAndroidGeneratorParser.g:297:3: () otherlv_1= TargetSDK otherlv_2= Colon ( (lv_result_3_0= ruleNumber ) ) ( (lv_minsdk_4_0= ruleMinSDK ) )?
            {
            // InternalAndroidGeneratorParser.g:297:3: ()
            // InternalAndroidGeneratorParser.g:298:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTargetSDKAccess().getTargetSDKAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,TargetSDK,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTargetSDKAccess().getTargetSDKKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getTargetSDKAccess().getColonKeyword_2());
            		
            // InternalAndroidGeneratorParser.g:312:3: ( (lv_result_3_0= ruleNumber ) )
            // InternalAndroidGeneratorParser.g:313:4: (lv_result_3_0= ruleNumber )
            {
            // InternalAndroidGeneratorParser.g:313:4: (lv_result_3_0= ruleNumber )
            // InternalAndroidGeneratorParser.g:314:5: lv_result_3_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getTargetSDKAccess().getResultNumberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalAndroidGeneratorParser.g:331:3: ( (lv_minsdk_4_0= ruleMinSDK ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==MinSDK) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:332:4: (lv_minsdk_4_0= ruleMinSDK )
                    {
                    // InternalAndroidGeneratorParser.g:332:4: (lv_minsdk_4_0= ruleMinSDK )
                    // InternalAndroidGeneratorParser.g:333:5: lv_minsdk_4_0= ruleMinSDK
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
    // InternalAndroidGeneratorParser.g:354:1: entryRuleMinSDK returns [EObject current=null] : iv_ruleMinSDK= ruleMinSDK EOF ;
    public final EObject entryRuleMinSDK() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinSDK = null;


        try {
            // InternalAndroidGeneratorParser.g:354:47: (iv_ruleMinSDK= ruleMinSDK EOF )
            // InternalAndroidGeneratorParser.g:355:2: iv_ruleMinSDK= ruleMinSDK EOF
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
    // InternalAndroidGeneratorParser.g:361:1: ruleMinSDK returns [EObject current=null] : ( () otherlv_1= MinSDK otherlv_2= Colon ( (lv_result_3_0= ruleNumber ) ) ) ;
    public final EObject ruleMinSDK() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_result_3_0 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:367:2: ( ( () otherlv_1= MinSDK otherlv_2= Colon ( (lv_result_3_0= ruleNumber ) ) ) )
            // InternalAndroidGeneratorParser.g:368:2: ( () otherlv_1= MinSDK otherlv_2= Colon ( (lv_result_3_0= ruleNumber ) ) )
            {
            // InternalAndroidGeneratorParser.g:368:2: ( () otherlv_1= MinSDK otherlv_2= Colon ( (lv_result_3_0= ruleNumber ) ) )
            // InternalAndroidGeneratorParser.g:369:3: () otherlv_1= MinSDK otherlv_2= Colon ( (lv_result_3_0= ruleNumber ) )
            {
            // InternalAndroidGeneratorParser.g:369:3: ()
            // InternalAndroidGeneratorParser.g:370:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMinSDKAccess().getMinSDKAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,MinSDK,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMinSDKAccess().getMinSDKKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getMinSDKAccess().getColonKeyword_2());
            		
            // InternalAndroidGeneratorParser.g:384:3: ( (lv_result_3_0= ruleNumber ) )
            // InternalAndroidGeneratorParser.g:385:4: (lv_result_3_0= ruleNumber )
            {
            // InternalAndroidGeneratorParser.g:385:4: (lv_result_3_0= ruleNumber )
            // InternalAndroidGeneratorParser.g:386:5: lv_result_3_0= ruleNumber
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
    // InternalAndroidGeneratorParser.g:407:1: entryRuleApplicationPermissionList returns [EObject current=null] : iv_ruleApplicationPermissionList= ruleApplicationPermissionList EOF ;
    public final EObject entryRuleApplicationPermissionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationPermissionList = null;


        try {
            // InternalAndroidGeneratorParser.g:407:66: (iv_ruleApplicationPermissionList= ruleApplicationPermissionList EOF )
            // InternalAndroidGeneratorParser.g:408:2: iv_ruleApplicationPermissionList= ruleApplicationPermissionList EOF
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
    // InternalAndroidGeneratorParser.g:414:1: ruleApplicationPermissionList returns [EObject current=null] : (otherlv_0= Permissions otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_permissions_3_0= rulePermission ) ) (otherlv_4= Comma ( (lv_permissions_5_0= rulePermission ) ) )* this_END_6= RULE_END ) ;
    public final EObject ruleApplicationPermissionList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token otherlv_4=null;
        Token this_END_6=null;
        EObject lv_permissions_3_0 = null;

        EObject lv_permissions_5_0 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:420:2: ( (otherlv_0= Permissions otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_permissions_3_0= rulePermission ) ) (otherlv_4= Comma ( (lv_permissions_5_0= rulePermission ) ) )* this_END_6= RULE_END ) )
            // InternalAndroidGeneratorParser.g:421:2: (otherlv_0= Permissions otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_permissions_3_0= rulePermission ) ) (otherlv_4= Comma ( (lv_permissions_5_0= rulePermission ) ) )* this_END_6= RULE_END )
            {
            // InternalAndroidGeneratorParser.g:421:2: (otherlv_0= Permissions otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_permissions_3_0= rulePermission ) ) (otherlv_4= Comma ( (lv_permissions_5_0= rulePermission ) ) )* this_END_6= RULE_END )
            // InternalAndroidGeneratorParser.g:422:3: otherlv_0= Permissions otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_permissions_3_0= rulePermission ) ) (otherlv_4= Comma ( (lv_permissions_5_0= rulePermission ) ) )* this_END_6= RULE_END
            {
            otherlv_0=(Token)match(input,Permissions,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationPermissionListAccess().getPermissionsKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getApplicationPermissionListAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_13); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getApplicationPermissionListAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalAndroidGeneratorParser.g:434:3: ( (lv_permissions_3_0= rulePermission ) )
            // InternalAndroidGeneratorParser.g:435:4: (lv_permissions_3_0= rulePermission )
            {
            // InternalAndroidGeneratorParser.g:435:4: (lv_permissions_3_0= rulePermission )
            // InternalAndroidGeneratorParser.g:436:5: lv_permissions_3_0= rulePermission
            {

            					newCompositeNode(grammarAccess.getApplicationPermissionListAccess().getPermissionsPermissionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalAndroidGeneratorParser.g:453:3: (otherlv_4= Comma ( (lv_permissions_5_0= rulePermission ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==Comma) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAndroidGeneratorParser.g:454:4: otherlv_4= Comma ( (lv_permissions_5_0= rulePermission ) )
            	    {
            	    otherlv_4=(Token)match(input,Comma,FOLLOW_13); 

            	    				newLeafNode(otherlv_4, grammarAccess.getApplicationPermissionListAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalAndroidGeneratorParser.g:458:4: ( (lv_permissions_5_0= rulePermission ) )
            	    // InternalAndroidGeneratorParser.g:459:5: (lv_permissions_5_0= rulePermission )
            	    {
            	    // InternalAndroidGeneratorParser.g:459:5: (lv_permissions_5_0= rulePermission )
            	    // InternalAndroidGeneratorParser.g:460:6: lv_permissions_5_0= rulePermission
            	    {

            	    						newCompositeNode(grammarAccess.getApplicationPermissionListAccess().getPermissionsPermissionParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_permissions_5_0=rulePermission();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getApplicationPermissionListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"permissions",
            	    							lv_permissions_5_0,
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

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_6, grammarAccess.getApplicationPermissionListAccess().getENDTerminalRuleCall_5());
            		

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
    // InternalAndroidGeneratorParser.g:486:1: entryRulePermission returns [EObject current=null] : iv_rulePermission= rulePermission EOF ;
    public final EObject entryRulePermission() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermission = null;


        try {
            // InternalAndroidGeneratorParser.g:486:51: (iv_rulePermission= rulePermission EOF )
            // InternalAndroidGeneratorParser.g:487:2: iv_rulePermission= rulePermission EOF
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
    // InternalAndroidGeneratorParser.g:493:1: rulePermission returns [EObject current=null] : ( (lv_name_0_0= RULE_PACKAGE_NAME ) ) ;
    public final EObject rulePermission() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:499:2: ( ( (lv_name_0_0= RULE_PACKAGE_NAME ) ) )
            // InternalAndroidGeneratorParser.g:500:2: ( (lv_name_0_0= RULE_PACKAGE_NAME ) )
            {
            // InternalAndroidGeneratorParser.g:500:2: ( (lv_name_0_0= RULE_PACKAGE_NAME ) )
            // InternalAndroidGeneratorParser.g:501:3: (lv_name_0_0= RULE_PACKAGE_NAME )
            {
            // InternalAndroidGeneratorParser.g:501:3: (lv_name_0_0= RULE_PACKAGE_NAME )
            // InternalAndroidGeneratorParser.g:502:4: lv_name_0_0= RULE_PACKAGE_NAME
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
    // InternalAndroidGeneratorParser.g:521:1: entryRuleApplicationElementList returns [EObject current=null] : iv_ruleApplicationElementList= ruleApplicationElementList EOF ;
    public final EObject entryRuleApplicationElementList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationElementList = null;


        try {
            // InternalAndroidGeneratorParser.g:521:63: (iv_ruleApplicationElementList= ruleApplicationElementList EOF )
            // InternalAndroidGeneratorParser.g:522:2: iv_ruleApplicationElementList= ruleApplicationElementList EOF
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
    // InternalAndroidGeneratorParser.g:528:1: ruleApplicationElementList returns [EObject current=null] : ( () otherlv_1= Elements otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_elements_4_0= ruleApplicationElement ) )* this_END_5= RULE_END ) ;
    public final EObject ruleApplicationElementList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:534:2: ( ( () otherlv_1= Elements otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_elements_4_0= ruleApplicationElement ) )* this_END_5= RULE_END ) )
            // InternalAndroidGeneratorParser.g:535:2: ( () otherlv_1= Elements otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_elements_4_0= ruleApplicationElement ) )* this_END_5= RULE_END )
            {
            // InternalAndroidGeneratorParser.g:535:2: ( () otherlv_1= Elements otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_elements_4_0= ruleApplicationElement ) )* this_END_5= RULE_END )
            // InternalAndroidGeneratorParser.g:536:3: () otherlv_1= Elements otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_elements_4_0= ruleApplicationElement ) )* this_END_5= RULE_END
            {
            // InternalAndroidGeneratorParser.g:536:3: ()
            // InternalAndroidGeneratorParser.g:537:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getApplicationElementListAccess().getApplicationElementListAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Elements,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getApplicationElementListAccess().getElementsKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getApplicationElementListAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getApplicationElementListAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalAndroidGeneratorParser.g:555:3: ( (lv_elements_4_0= ruleApplicationElement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Fragment||LA7_0==Model) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAndroidGeneratorParser.g:556:4: (lv_elements_4_0= ruleApplicationElement )
            	    {
            	    // InternalAndroidGeneratorParser.g:556:4: (lv_elements_4_0= ruleApplicationElement )
            	    // InternalAndroidGeneratorParser.g:557:5: lv_elements_4_0= ruleApplicationElement
            	    {

            	    					newCompositeNode(grammarAccess.getApplicationElementListAccess().getElementsApplicationElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_elements_4_0=ruleApplicationElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getApplicationElementListRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_4_0,
            	    						"org.xtext.example.mdsd.AndroidGenerator.ApplicationElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_5, grammarAccess.getApplicationElementListAccess().getENDTerminalRuleCall_5());
            		

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
    // InternalAndroidGeneratorParser.g:582:1: entryRuleApplicationElement returns [EObject current=null] : iv_ruleApplicationElement= ruleApplicationElement EOF ;
    public final EObject entryRuleApplicationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationElement = null;


        try {
            // InternalAndroidGeneratorParser.g:582:59: (iv_ruleApplicationElement= ruleApplicationElement EOF )
            // InternalAndroidGeneratorParser.g:583:2: iv_ruleApplicationElement= ruleApplicationElement EOF
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
    // InternalAndroidGeneratorParser.g:589:1: ruleApplicationElement returns [EObject current=null] : (this_Fragment_0= ruleFragment | this_Model_1= ruleModel ) ;
    public final EObject ruleApplicationElement() throws RecognitionException {
        EObject current = null;

        EObject this_Fragment_0 = null;

        EObject this_Model_1 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:595:2: ( (this_Fragment_0= ruleFragment | this_Model_1= ruleModel ) )
            // InternalAndroidGeneratorParser.g:596:2: (this_Fragment_0= ruleFragment | this_Model_1= ruleModel )
            {
            // InternalAndroidGeneratorParser.g:596:2: (this_Fragment_0= ruleFragment | this_Model_1= ruleModel )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Fragment) ) {
                alt8=1;
            }
            else if ( (LA8_0==Model) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:597:3: this_Fragment_0= ruleFragment
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
                    // InternalAndroidGeneratorParser.g:606:3: this_Model_1= ruleModel
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
    // InternalAndroidGeneratorParser.g:618:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalAndroidGeneratorParser.g:618:46: (iv_ruleModel= ruleModel EOF )
            // InternalAndroidGeneratorParser.g:619:2: iv_ruleModel= ruleModel EOF
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
    // InternalAndroidGeneratorParser.g:625:1: ruleModel returns [EObject current=null] : (otherlv_0= Model otherlv_1= Colon ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:631:2: ( (otherlv_0= Model otherlv_1= Colon ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalAndroidGeneratorParser.g:632:2: (otherlv_0= Model otherlv_1= Colon ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalAndroidGeneratorParser.g:632:2: (otherlv_0= Model otherlv_1= Colon ( (lv_name_2_0= RULE_ID ) ) )
            // InternalAndroidGeneratorParser.g:633:3: otherlv_0= Model otherlv_1= Colon ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Model,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getColonKeyword_1());
            		
            // InternalAndroidGeneratorParser.g:641:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAndroidGeneratorParser.g:642:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAndroidGeneratorParser.g:642:4: (lv_name_2_0= RULE_ID )
            // InternalAndroidGeneratorParser.g:643:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFragment"
    // InternalAndroidGeneratorParser.g:663:1: entryRuleFragment returns [EObject current=null] : iv_ruleFragment= ruleFragment EOF ;
    public final EObject entryRuleFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFragment = null;


        try {
            // InternalAndroidGeneratorParser.g:663:49: (iv_ruleFragment= ruleFragment EOF )
            // InternalAndroidGeneratorParser.g:664:2: iv_ruleFragment= ruleFragment EOF
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
    // InternalAndroidGeneratorParser.g:670:1: ruleFragment returns [EObject current=null] : (otherlv_0= Fragment otherlv_1= Colon ( (lv_name_2_0= RULE_ID ) ) ( (lv_fragmentAttributes_3_0= ruleFragmentLayoutAttributes ) )? ) ;
    public final EObject ruleFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_fragmentAttributes_3_0 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:676:2: ( (otherlv_0= Fragment otherlv_1= Colon ( (lv_name_2_0= RULE_ID ) ) ( (lv_fragmentAttributes_3_0= ruleFragmentLayoutAttributes ) )? ) )
            // InternalAndroidGeneratorParser.g:677:2: (otherlv_0= Fragment otherlv_1= Colon ( (lv_name_2_0= RULE_ID ) ) ( (lv_fragmentAttributes_3_0= ruleFragmentLayoutAttributes ) )? )
            {
            // InternalAndroidGeneratorParser.g:677:2: (otherlv_0= Fragment otherlv_1= Colon ( (lv_name_2_0= RULE_ID ) ) ( (lv_fragmentAttributes_3_0= ruleFragmentLayoutAttributes ) )? )
            // InternalAndroidGeneratorParser.g:678:3: otherlv_0= Fragment otherlv_1= Colon ( (lv_name_2_0= RULE_ID ) ) ( (lv_fragmentAttributes_3_0= ruleFragmentLayoutAttributes ) )?
            {
            otherlv_0=(Token)match(input,Fragment,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFragmentAccess().getFragmentKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFragmentAccess().getColonKeyword_1());
            		
            // InternalAndroidGeneratorParser.g:686:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAndroidGeneratorParser.g:687:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAndroidGeneratorParser.g:687:4: (lv_name_2_0= RULE_ID )
            // InternalAndroidGeneratorParser.g:688:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            // InternalAndroidGeneratorParser.g:704:3: ( (lv_fragmentAttributes_3_0= ruleFragmentLayoutAttributes ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_BEGIN) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:705:4: (lv_fragmentAttributes_3_0= ruleFragmentLayoutAttributes )
                    {
                    // InternalAndroidGeneratorParser.g:705:4: (lv_fragmentAttributes_3_0= ruleFragmentLayoutAttributes )
                    // InternalAndroidGeneratorParser.g:706:5: lv_fragmentAttributes_3_0= ruleFragmentLayoutAttributes
                    {

                    					newCompositeNode(grammarAccess.getFragmentAccess().getFragmentAttributesFragmentLayoutAttributesParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_fragmentAttributes_3_0=ruleFragmentLayoutAttributes();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFragmentRule());
                    					}
                    					add(
                    						current,
                    						"fragmentAttributes",
                    						lv_fragmentAttributes_3_0,
                    						"org.xtext.example.mdsd.AndroidGenerator.FragmentLayoutAttributes");
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


    // $ANTLR start "entryRuleFragmentLayoutAttributes"
    // InternalAndroidGeneratorParser.g:727:1: entryRuleFragmentLayoutAttributes returns [EObject current=null] : iv_ruleFragmentLayoutAttributes= ruleFragmentLayoutAttributes EOF ;
    public final EObject entryRuleFragmentLayoutAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFragmentLayoutAttributes = null;


        try {
            // InternalAndroidGeneratorParser.g:727:65: (iv_ruleFragmentLayoutAttributes= ruleFragmentLayoutAttributes EOF )
            // InternalAndroidGeneratorParser.g:728:2: iv_ruleFragmentLayoutAttributes= ruleFragmentLayoutAttributes EOF
            {
             newCompositeNode(grammarAccess.getFragmentLayoutAttributesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFragmentLayoutAttributes=ruleFragmentLayoutAttributes();

            state._fsp--;

             current =iv_ruleFragmentLayoutAttributes; 
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
    // $ANTLR end "entryRuleFragmentLayoutAttributes"


    // $ANTLR start "ruleFragmentLayoutAttributes"
    // InternalAndroidGeneratorParser.g:734:1: ruleFragmentLayoutAttributes returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN ( (lv_layoutElements_1_0= ruleLayoutElement ) ) (otherlv_2= Comma ( (lv_layoutElements_3_0= ruleLayoutElement ) ) )* this_END_4= RULE_END ) ;
    public final EObject ruleFragmentLayoutAttributes() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_0=null;
        Token otherlv_2=null;
        Token this_END_4=null;
        EObject lv_layoutElements_1_0 = null;

        EObject lv_layoutElements_3_0 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:740:2: ( (this_BEGIN_0= RULE_BEGIN ( (lv_layoutElements_1_0= ruleLayoutElement ) ) (otherlv_2= Comma ( (lv_layoutElements_3_0= ruleLayoutElement ) ) )* this_END_4= RULE_END ) )
            // InternalAndroidGeneratorParser.g:741:2: (this_BEGIN_0= RULE_BEGIN ( (lv_layoutElements_1_0= ruleLayoutElement ) ) (otherlv_2= Comma ( (lv_layoutElements_3_0= ruleLayoutElement ) ) )* this_END_4= RULE_END )
            {
            // InternalAndroidGeneratorParser.g:741:2: (this_BEGIN_0= RULE_BEGIN ( (lv_layoutElements_1_0= ruleLayoutElement ) ) (otherlv_2= Comma ( (lv_layoutElements_3_0= ruleLayoutElement ) ) )* this_END_4= RULE_END )
            // InternalAndroidGeneratorParser.g:742:3: this_BEGIN_0= RULE_BEGIN ( (lv_layoutElements_1_0= ruleLayoutElement ) ) (otherlv_2= Comma ( (lv_layoutElements_3_0= ruleLayoutElement ) ) )* this_END_4= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_17); 

            			newLeafNode(this_BEGIN_0, grammarAccess.getFragmentLayoutAttributesAccess().getBEGINTerminalRuleCall_0());
            		
            // InternalAndroidGeneratorParser.g:746:3: ( (lv_layoutElements_1_0= ruleLayoutElement ) )
            // InternalAndroidGeneratorParser.g:747:4: (lv_layoutElements_1_0= ruleLayoutElement )
            {
            // InternalAndroidGeneratorParser.g:747:4: (lv_layoutElements_1_0= ruleLayoutElement )
            // InternalAndroidGeneratorParser.g:748:5: lv_layoutElements_1_0= ruleLayoutElement
            {

            					newCompositeNode(grammarAccess.getFragmentLayoutAttributesAccess().getLayoutElementsLayoutElementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_layoutElements_1_0=ruleLayoutElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFragmentLayoutAttributesRule());
            					}
            					add(
            						current,
            						"layoutElements",
            						lv_layoutElements_1_0,
            						"org.xtext.example.mdsd.AndroidGenerator.LayoutElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAndroidGeneratorParser.g:765:3: (otherlv_2= Comma ( (lv_layoutElements_3_0= ruleLayoutElement ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Comma) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAndroidGeneratorParser.g:766:4: otherlv_2= Comma ( (lv_layoutElements_3_0= ruleLayoutElement ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FOLLOW_17); 

            	    				newLeafNode(otherlv_2, grammarAccess.getFragmentLayoutAttributesAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalAndroidGeneratorParser.g:770:4: ( (lv_layoutElements_3_0= ruleLayoutElement ) )
            	    // InternalAndroidGeneratorParser.g:771:5: (lv_layoutElements_3_0= ruleLayoutElement )
            	    {
            	    // InternalAndroidGeneratorParser.g:771:5: (lv_layoutElements_3_0= ruleLayoutElement )
            	    // InternalAndroidGeneratorParser.g:772:6: lv_layoutElements_3_0= ruleLayoutElement
            	    {

            	    						newCompositeNode(grammarAccess.getFragmentLayoutAttributesAccess().getLayoutElementsLayoutElementParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_layoutElements_3_0=ruleLayoutElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFragmentLayoutAttributesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"layoutElements",
            	    							lv_layoutElements_3_0,
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

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getFragmentLayoutAttributesAccess().getENDTerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleFragmentLayoutAttributes"


    // $ANTLR start "entryRuleLayoutElement"
    // InternalAndroidGeneratorParser.g:798:1: entryRuleLayoutElement returns [EObject current=null] : iv_ruleLayoutElement= ruleLayoutElement EOF ;
    public final EObject entryRuleLayoutElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayoutElement = null;


        try {
            // InternalAndroidGeneratorParser.g:798:54: (iv_ruleLayoutElement= ruleLayoutElement EOF )
            // InternalAndroidGeneratorParser.g:799:2: iv_ruleLayoutElement= ruleLayoutElement EOF
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
    // InternalAndroidGeneratorParser.g:805:1: ruleLayoutElement returns [EObject current=null] : (this_Button_0= ruleButton | this_Dataholders_1= ruleDataholders | this_TypeMap_2= ruleTypeMap | this_TypeSetting_3= ruleTypeSetting ) ;
    public final EObject ruleLayoutElement() throws RecognitionException {
        EObject current = null;

        EObject this_Button_0 = null;

        EObject this_Dataholders_1 = null;

        EObject this_TypeMap_2 = null;

        EObject this_TypeSetting_3 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:811:2: ( (this_Button_0= ruleButton | this_Dataholders_1= ruleDataholders | this_TypeMap_2= ruleTypeMap | this_TypeSetting_3= ruleTypeSetting ) )
            // InternalAndroidGeneratorParser.g:812:2: (this_Button_0= ruleButton | this_Dataholders_1= ruleDataholders | this_TypeMap_2= ruleTypeMap | this_TypeSetting_3= ruleTypeSetting )
            {
            // InternalAndroidGeneratorParser.g:812:2: (this_Button_0= ruleButton | this_Dataholders_1= ruleDataholders | this_TypeMap_2= ruleTypeMap | this_TypeSetting_3= ruleTypeSetting )
            int alt11=4;
            switch ( input.LA(1) ) {
            case Button:
                {
                alt11=1;
                }
                break;
            case EditText:
            case Textview:
            case Spinner:
                {
                alt11=2;
                }
                break;
            case Map:
                {
                alt11=3;
                }
                break;
            case Settings:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:813:3: this_Button_0= ruleButton
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
                    // InternalAndroidGeneratorParser.g:822:3: this_Dataholders_1= ruleDataholders
                    {

                    			newCompositeNode(grammarAccess.getLayoutElementAccess().getDataholdersParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Dataholders_1=ruleDataholders();

                    state._fsp--;


                    			current = this_Dataholders_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAndroidGeneratorParser.g:831:3: this_TypeMap_2= ruleTypeMap
                    {

                    			newCompositeNode(grammarAccess.getLayoutElementAccess().getTypeMapParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeMap_2=ruleTypeMap();

                    state._fsp--;


                    			current = this_TypeMap_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAndroidGeneratorParser.g:840:3: this_TypeSetting_3= ruleTypeSetting
                    {

                    			newCompositeNode(grammarAccess.getLayoutElementAccess().getTypeSettingParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeSetting_3=ruleTypeSetting();

                    state._fsp--;


                    			current = this_TypeSetting_3;
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


    // $ANTLR start "entryRuleDataholders"
    // InternalAndroidGeneratorParser.g:852:1: entryRuleDataholders returns [EObject current=null] : iv_ruleDataholders= ruleDataholders EOF ;
    public final EObject entryRuleDataholders() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataholders = null;


        try {
            // InternalAndroidGeneratorParser.g:852:52: (iv_ruleDataholders= ruleDataholders EOF )
            // InternalAndroidGeneratorParser.g:853:2: iv_ruleDataholders= ruleDataholders EOF
            {
             newCompositeNode(grammarAccess.getDataholdersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataholders=ruleDataholders();

            state._fsp--;

             current =iv_ruleDataholders; 
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
    // $ANTLR end "entryRuleDataholders"


    // $ANTLR start "ruleDataholders"
    // InternalAndroidGeneratorParser.g:859:1: ruleDataholders returns [EObject current=null] : (this_EditText_0= ruleEditText | this_Spinner_1= ruleSpinner | this_TextView_2= ruleTextView ) ;
    public final EObject ruleDataholders() throws RecognitionException {
        EObject current = null;

        EObject this_EditText_0 = null;

        EObject this_Spinner_1 = null;

        EObject this_TextView_2 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:865:2: ( (this_EditText_0= ruleEditText | this_Spinner_1= ruleSpinner | this_TextView_2= ruleTextView ) )
            // InternalAndroidGeneratorParser.g:866:2: (this_EditText_0= ruleEditText | this_Spinner_1= ruleSpinner | this_TextView_2= ruleTextView )
            {
            // InternalAndroidGeneratorParser.g:866:2: (this_EditText_0= ruleEditText | this_Spinner_1= ruleSpinner | this_TextView_2= ruleTextView )
            int alt12=3;
            switch ( input.LA(1) ) {
            case EditText:
                {
                alt12=1;
                }
                break;
            case Spinner:
                {
                alt12=2;
                }
                break;
            case Textview:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:867:3: this_EditText_0= ruleEditText
                    {

                    			newCompositeNode(grammarAccess.getDataholdersAccess().getEditTextParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EditText_0=ruleEditText();

                    state._fsp--;


                    			current = this_EditText_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAndroidGeneratorParser.g:876:3: this_Spinner_1= ruleSpinner
                    {

                    			newCompositeNode(grammarAccess.getDataholdersAccess().getSpinnerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Spinner_1=ruleSpinner();

                    state._fsp--;


                    			current = this_Spinner_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAndroidGeneratorParser.g:885:3: this_TextView_2= ruleTextView
                    {

                    			newCompositeNode(grammarAccess.getDataholdersAccess().getTextViewParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextView_2=ruleTextView();

                    state._fsp--;


                    			current = this_TextView_2;
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
    // $ANTLR end "ruleDataholders"


    // $ANTLR start "entryRuleTypeMap"
    // InternalAndroidGeneratorParser.g:897:1: entryRuleTypeMap returns [EObject current=null] : iv_ruleTypeMap= ruleTypeMap EOF ;
    public final EObject entryRuleTypeMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeMap = null;


        try {
            // InternalAndroidGeneratorParser.g:897:48: (iv_ruleTypeMap= ruleTypeMap EOF )
            // InternalAndroidGeneratorParser.g:898:2: iv_ruleTypeMap= ruleTypeMap EOF
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
    // InternalAndroidGeneratorParser.g:904:1: ruleTypeMap returns [EObject current=null] : ( () otherlv_1= Map otherlv_2= Colon (this_BEGIN_3= RULE_BEGIN ( (lv_fragmenttypeattribute_4_0= ruleFragmentTypeAttributes ) ) this_END_5= RULE_END )? ) ;
    public final EObject ruleTypeMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        EObject lv_fragmenttypeattribute_4_0 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:910:2: ( ( () otherlv_1= Map otherlv_2= Colon (this_BEGIN_3= RULE_BEGIN ( (lv_fragmenttypeattribute_4_0= ruleFragmentTypeAttributes ) ) this_END_5= RULE_END )? ) )
            // InternalAndroidGeneratorParser.g:911:2: ( () otherlv_1= Map otherlv_2= Colon (this_BEGIN_3= RULE_BEGIN ( (lv_fragmenttypeattribute_4_0= ruleFragmentTypeAttributes ) ) this_END_5= RULE_END )? )
            {
            // InternalAndroidGeneratorParser.g:911:2: ( () otherlv_1= Map otherlv_2= Colon (this_BEGIN_3= RULE_BEGIN ( (lv_fragmenttypeattribute_4_0= ruleFragmentTypeAttributes ) ) this_END_5= RULE_END )? )
            // InternalAndroidGeneratorParser.g:912:3: () otherlv_1= Map otherlv_2= Colon (this_BEGIN_3= RULE_BEGIN ( (lv_fragmenttypeattribute_4_0= ruleFragmentTypeAttributes ) ) this_END_5= RULE_END )?
            {
            // InternalAndroidGeneratorParser.g:912:3: ()
            // InternalAndroidGeneratorParser.g:913:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTypeMapAccess().getTypeMapAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Map,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTypeMapAccess().getMapKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getTypeMapAccess().getColonKeyword_2());
            		
            // InternalAndroidGeneratorParser.g:927:3: (this_BEGIN_3= RULE_BEGIN ( (lv_fragmenttypeattribute_4_0= ruleFragmentTypeAttributes ) ) this_END_5= RULE_END )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_BEGIN) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:928:4: this_BEGIN_3= RULE_BEGIN ( (lv_fragmenttypeattribute_4_0= ruleFragmentTypeAttributes ) ) this_END_5= RULE_END
                    {
                    this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_18); 

                    				newLeafNode(this_BEGIN_3, grammarAccess.getTypeMapAccess().getBEGINTerminalRuleCall_3_0());
                    			
                    // InternalAndroidGeneratorParser.g:932:4: ( (lv_fragmenttypeattribute_4_0= ruleFragmentTypeAttributes ) )
                    // InternalAndroidGeneratorParser.g:933:5: (lv_fragmenttypeattribute_4_0= ruleFragmentTypeAttributes )
                    {
                    // InternalAndroidGeneratorParser.g:933:5: (lv_fragmenttypeattribute_4_0= ruleFragmentTypeAttributes )
                    // InternalAndroidGeneratorParser.g:934:6: lv_fragmenttypeattribute_4_0= ruleFragmentTypeAttributes
                    {

                    						newCompositeNode(grammarAccess.getTypeMapAccess().getFragmenttypeattributeFragmentTypeAttributesParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_fragmenttypeattribute_4_0=ruleFragmentTypeAttributes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypeMapRule());
                    						}
                    						set(
                    							current,
                    							"fragmenttypeattribute",
                    							lv_fragmenttypeattribute_4_0,
                    							"org.xtext.example.mdsd.AndroidGenerator.FragmentTypeAttributes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_5, grammarAccess.getTypeMapAccess().getENDTerminalRuleCall_3_2());
                    			

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
    // InternalAndroidGeneratorParser.g:960:1: entryRuleTypeSetting returns [EObject current=null] : iv_ruleTypeSetting= ruleTypeSetting EOF ;
    public final EObject entryRuleTypeSetting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSetting = null;


        try {
            // InternalAndroidGeneratorParser.g:960:52: (iv_ruleTypeSetting= ruleTypeSetting EOF )
            // InternalAndroidGeneratorParser.g:961:2: iv_ruleTypeSetting= ruleTypeSetting EOF
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
    // InternalAndroidGeneratorParser.g:967:1: ruleTypeSetting returns [EObject current=null] : ( () otherlv_1= Settings ) ;
    public final EObject ruleTypeSetting() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:973:2: ( ( () otherlv_1= Settings ) )
            // InternalAndroidGeneratorParser.g:974:2: ( () otherlv_1= Settings )
            {
            // InternalAndroidGeneratorParser.g:974:2: ( () otherlv_1= Settings )
            // InternalAndroidGeneratorParser.g:975:3: () otherlv_1= Settings
            {
            // InternalAndroidGeneratorParser.g:975:3: ()
            // InternalAndroidGeneratorParser.g:976:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTypeSettingAccess().getTypeSettingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Settings,FOLLOW_2); 

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


    // $ANTLR start "entryRuleFragmentTypeAttributes"
    // InternalAndroidGeneratorParser.g:990:1: entryRuleFragmentTypeAttributes returns [EObject current=null] : iv_ruleFragmentTypeAttributes= ruleFragmentTypeAttributes EOF ;
    public final EObject entryRuleFragmentTypeAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFragmentTypeAttributes = null;


        try {
            // InternalAndroidGeneratorParser.g:990:63: (iv_ruleFragmentTypeAttributes= ruleFragmentTypeAttributes EOF )
            // InternalAndroidGeneratorParser.g:991:2: iv_ruleFragmentTypeAttributes= ruleFragmentTypeAttributes EOF
            {
             newCompositeNode(grammarAccess.getFragmentTypeAttributesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFragmentTypeAttributes=ruleFragmentTypeAttributes();

            state._fsp--;

             current =iv_ruleFragmentTypeAttributes; 
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
    // $ANTLR end "entryRuleFragmentTypeAttributes"


    // $ANTLR start "ruleFragmentTypeAttributes"
    // InternalAndroidGeneratorParser.g:997:1: ruleFragmentTypeAttributes returns [EObject current=null] : ( (lv_filter_0_0= ruleFilterQuery ) ) ;
    public final EObject ruleFragmentTypeAttributes() throws RecognitionException {
        EObject current = null;

        EObject lv_filter_0_0 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:1003:2: ( ( (lv_filter_0_0= ruleFilterQuery ) ) )
            // InternalAndroidGeneratorParser.g:1004:2: ( (lv_filter_0_0= ruleFilterQuery ) )
            {
            // InternalAndroidGeneratorParser.g:1004:2: ( (lv_filter_0_0= ruleFilterQuery ) )
            // InternalAndroidGeneratorParser.g:1005:3: (lv_filter_0_0= ruleFilterQuery )
            {
            // InternalAndroidGeneratorParser.g:1005:3: (lv_filter_0_0= ruleFilterQuery )
            // InternalAndroidGeneratorParser.g:1006:4: lv_filter_0_0= ruleFilterQuery
            {

            				newCompositeNode(grammarAccess.getFragmentTypeAttributesAccess().getFilterFilterQueryParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_filter_0_0=ruleFilterQuery();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getFragmentTypeAttributesRule());
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
    // $ANTLR end "ruleFragmentTypeAttributes"


    // $ANTLR start "entryRuleEditText"
    // InternalAndroidGeneratorParser.g:1026:1: entryRuleEditText returns [EObject current=null] : iv_ruleEditText= ruleEditText EOF ;
    public final EObject entryRuleEditText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEditText = null;


        try {
            // InternalAndroidGeneratorParser.g:1026:49: (iv_ruleEditText= ruleEditText EOF )
            // InternalAndroidGeneratorParser.g:1027:2: iv_ruleEditText= ruleEditText EOF
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
    // InternalAndroidGeneratorParser.g:1033:1: ruleEditText returns [EObject current=null] : (otherlv_0= EditText otherlv_1= Colon ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleEditText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:1039:2: ( (otherlv_0= EditText otherlv_1= Colon ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalAndroidGeneratorParser.g:1040:2: (otherlv_0= EditText otherlv_1= Colon ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalAndroidGeneratorParser.g:1040:2: (otherlv_0= EditText otherlv_1= Colon ( (lv_name_2_0= RULE_ID ) ) )
            // InternalAndroidGeneratorParser.g:1041:3: otherlv_0= EditText otherlv_1= Colon ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,EditText,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEditTextAccess().getEditTextKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getEditTextAccess().getColonKeyword_1());
            		
            // InternalAndroidGeneratorParser.g:1049:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAndroidGeneratorParser.g:1050:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAndroidGeneratorParser.g:1050:4: (lv_name_2_0= RULE_ID )
            // InternalAndroidGeneratorParser.g:1051:5: lv_name_2_0= RULE_ID
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
    // InternalAndroidGeneratorParser.g:1071:1: entryRuleSpinner returns [EObject current=null] : iv_ruleSpinner= ruleSpinner EOF ;
    public final EObject entryRuleSpinner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpinner = null;


        try {
            // InternalAndroidGeneratorParser.g:1071:48: (iv_ruleSpinner= ruleSpinner EOF )
            // InternalAndroidGeneratorParser.g:1072:2: iv_ruleSpinner= ruleSpinner EOF
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
    // InternalAndroidGeneratorParser.g:1078:1: ruleSpinner returns [EObject current=null] : (otherlv_0= Spinner otherlv_1= Colon ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Content otherlv_4= Colon ( (lv_spinnercon_5_0= ruleSpinnerCon ) ) (otherlv_6= Comma ( (lv_spinnercon_7_0= ruleSpinnerCon ) ) )* )? ) ;
    public final EObject ruleSpinner() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_spinnercon_5_0 = null;

        EObject lv_spinnercon_7_0 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:1084:2: ( (otherlv_0= Spinner otherlv_1= Colon ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Content otherlv_4= Colon ( (lv_spinnercon_5_0= ruleSpinnerCon ) ) (otherlv_6= Comma ( (lv_spinnercon_7_0= ruleSpinnerCon ) ) )* )? ) )
            // InternalAndroidGeneratorParser.g:1085:2: (otherlv_0= Spinner otherlv_1= Colon ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Content otherlv_4= Colon ( (lv_spinnercon_5_0= ruleSpinnerCon ) ) (otherlv_6= Comma ( (lv_spinnercon_7_0= ruleSpinnerCon ) ) )* )? )
            {
            // InternalAndroidGeneratorParser.g:1085:2: (otherlv_0= Spinner otherlv_1= Colon ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Content otherlv_4= Colon ( (lv_spinnercon_5_0= ruleSpinnerCon ) ) (otherlv_6= Comma ( (lv_spinnercon_7_0= ruleSpinnerCon ) ) )* )? )
            // InternalAndroidGeneratorParser.g:1086:3: otherlv_0= Spinner otherlv_1= Colon ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Content otherlv_4= Colon ( (lv_spinnercon_5_0= ruleSpinnerCon ) ) (otherlv_6= Comma ( (lv_spinnercon_7_0= ruleSpinnerCon ) ) )* )?
            {
            otherlv_0=(Token)match(input,Spinner,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSpinnerAccess().getSpinnerKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSpinnerAccess().getColonKeyword_1());
            		
            // InternalAndroidGeneratorParser.g:1094:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAndroidGeneratorParser.g:1095:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAndroidGeneratorParser.g:1095:4: (lv_name_2_0= RULE_ID )
            // InternalAndroidGeneratorParser.g:1096:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            // InternalAndroidGeneratorParser.g:1112:3: (otherlv_3= Content otherlv_4= Colon ( (lv_spinnercon_5_0= ruleSpinnerCon ) ) (otherlv_6= Comma ( (lv_spinnercon_7_0= ruleSpinnerCon ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Content) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:1113:4: otherlv_3= Content otherlv_4= Colon ( (lv_spinnercon_5_0= ruleSpinnerCon ) ) (otherlv_6= Comma ( (lv_spinnercon_7_0= ruleSpinnerCon ) ) )*
                    {
                    otherlv_3=(Token)match(input,Content,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getSpinnerAccess().getContentKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,Colon,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getSpinnerAccess().getColonKeyword_3_1());
                    			
                    // InternalAndroidGeneratorParser.g:1121:4: ( (lv_spinnercon_5_0= ruleSpinnerCon ) )
                    // InternalAndroidGeneratorParser.g:1122:5: (lv_spinnercon_5_0= ruleSpinnerCon )
                    {
                    // InternalAndroidGeneratorParser.g:1122:5: (lv_spinnercon_5_0= ruleSpinnerCon )
                    // InternalAndroidGeneratorParser.g:1123:6: lv_spinnercon_5_0= ruleSpinnerCon
                    {

                    						newCompositeNode(grammarAccess.getSpinnerAccess().getSpinnerconSpinnerConParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_spinnercon_5_0=ruleSpinnerCon();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSpinnerRule());
                    						}
                    						add(
                    							current,
                    							"spinnercon",
                    							lv_spinnercon_5_0,
                    							"org.xtext.example.mdsd.AndroidGenerator.SpinnerCon");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAndroidGeneratorParser.g:1140:4: (otherlv_6= Comma ( (lv_spinnercon_7_0= ruleSpinnerCon ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==Comma) ) {
                            int LA14_1 = input.LA(2);

                            if ( (LA14_1==RULE_STRING) ) {
                                alt14=1;
                            }


                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalAndroidGeneratorParser.g:1141:5: otherlv_6= Comma ( (lv_spinnercon_7_0= ruleSpinnerCon ) )
                    	    {
                    	    otherlv_6=(Token)match(input,Comma,FOLLOW_20); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getSpinnerAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalAndroidGeneratorParser.g:1145:5: ( (lv_spinnercon_7_0= ruleSpinnerCon ) )
                    	    // InternalAndroidGeneratorParser.g:1146:6: (lv_spinnercon_7_0= ruleSpinnerCon )
                    	    {
                    	    // InternalAndroidGeneratorParser.g:1146:6: (lv_spinnercon_7_0= ruleSpinnerCon )
                    	    // InternalAndroidGeneratorParser.g:1147:7: lv_spinnercon_7_0= ruleSpinnerCon
                    	    {

                    	    							newCompositeNode(grammarAccess.getSpinnerAccess().getSpinnerconSpinnerConParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    lv_spinnercon_7_0=ruleSpinnerCon();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSpinnerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"spinnercon",
                    	    								lv_spinnercon_7_0,
                    	    								"org.xtext.example.mdsd.AndroidGenerator.SpinnerCon");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


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


    // $ANTLR start "entryRuleSpinnerCon"
    // InternalAndroidGeneratorParser.g:1170:1: entryRuleSpinnerCon returns [EObject current=null] : iv_ruleSpinnerCon= ruleSpinnerCon EOF ;
    public final EObject entryRuleSpinnerCon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpinnerCon = null;


        try {
            // InternalAndroidGeneratorParser.g:1170:51: (iv_ruleSpinnerCon= ruleSpinnerCon EOF )
            // InternalAndroidGeneratorParser.g:1171:2: iv_ruleSpinnerCon= ruleSpinnerCon EOF
            {
             newCompositeNode(grammarAccess.getSpinnerConRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpinnerCon=ruleSpinnerCon();

            state._fsp--;

             current =iv_ruleSpinnerCon; 
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
    // $ANTLR end "entryRuleSpinnerCon"


    // $ANTLR start "ruleSpinnerCon"
    // InternalAndroidGeneratorParser.g:1177:1: ruleSpinnerCon returns [EObject current=null] : ( (lv_text_0_0= RULE_STRING ) ) ;
    public final EObject ruleSpinnerCon() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;


        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:1183:2: ( ( (lv_text_0_0= RULE_STRING ) ) )
            // InternalAndroidGeneratorParser.g:1184:2: ( (lv_text_0_0= RULE_STRING ) )
            {
            // InternalAndroidGeneratorParser.g:1184:2: ( (lv_text_0_0= RULE_STRING ) )
            // InternalAndroidGeneratorParser.g:1185:3: (lv_text_0_0= RULE_STRING )
            {
            // InternalAndroidGeneratorParser.g:1185:3: (lv_text_0_0= RULE_STRING )
            // InternalAndroidGeneratorParser.g:1186:4: lv_text_0_0= RULE_STRING
            {
            lv_text_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_text_0_0, grammarAccess.getSpinnerConAccess().getTextSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSpinnerConRule());
            				}
            				setWithLastConsumed(
            					current,
            					"text",
            					lv_text_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleSpinnerCon"


    // $ANTLR start "entryRuleTextView"
    // InternalAndroidGeneratorParser.g:1205:1: entryRuleTextView returns [EObject current=null] : iv_ruleTextView= ruleTextView EOF ;
    public final EObject entryRuleTextView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextView = null;


        try {
            // InternalAndroidGeneratorParser.g:1205:49: (iv_ruleTextView= ruleTextView EOF )
            // InternalAndroidGeneratorParser.g:1206:2: iv_ruleTextView= ruleTextView EOF
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
    // InternalAndroidGeneratorParser.g:1212:1: ruleTextView returns [EObject current=null] : (otherlv_0= Textview otherlv_1= Colon ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Content otherlv_4= Colon ( (lv_text_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleTextView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_text_5_0=null;


        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:1218:2: ( (otherlv_0= Textview otherlv_1= Colon ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Content otherlv_4= Colon ( (lv_text_5_0= RULE_STRING ) ) ) )
            // InternalAndroidGeneratorParser.g:1219:2: (otherlv_0= Textview otherlv_1= Colon ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Content otherlv_4= Colon ( (lv_text_5_0= RULE_STRING ) ) )
            {
            // InternalAndroidGeneratorParser.g:1219:2: (otherlv_0= Textview otherlv_1= Colon ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Content otherlv_4= Colon ( (lv_text_5_0= RULE_STRING ) ) )
            // InternalAndroidGeneratorParser.g:1220:3: otherlv_0= Textview otherlv_1= Colon ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Content otherlv_4= Colon ( (lv_text_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Textview,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTextViewAccess().getTextviewKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTextViewAccess().getColonKeyword_1());
            		
            // InternalAndroidGeneratorParser.g:1228:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAndroidGeneratorParser.g:1229:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAndroidGeneratorParser.g:1229:4: (lv_name_2_0= RULE_ID )
            // InternalAndroidGeneratorParser.g:1230:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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

            otherlv_3=(Token)match(input,Content,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getTextViewAccess().getContentKeyword_3());
            		
            otherlv_4=(Token)match(input,Colon,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getTextViewAccess().getColonKeyword_4());
            		
            // InternalAndroidGeneratorParser.g:1254:3: ( (lv_text_5_0= RULE_STRING ) )
            // InternalAndroidGeneratorParser.g:1255:4: (lv_text_5_0= RULE_STRING )
            {
            // InternalAndroidGeneratorParser.g:1255:4: (lv_text_5_0= RULE_STRING )
            // InternalAndroidGeneratorParser.g:1256:5: lv_text_5_0= RULE_STRING
            {
            lv_text_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_text_5_0, grammarAccess.getTextViewAccess().getTextSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextViewRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_5_0,
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
    // $ANTLR end "ruleTextView"


    // $ANTLR start "entryRuleButton"
    // InternalAndroidGeneratorParser.g:1276:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalAndroidGeneratorParser.g:1276:47: (iv_ruleButton= ruleButton EOF )
            // InternalAndroidGeneratorParser.g:1277:2: iv_ruleButton= ruleButton EOF
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
    // InternalAndroidGeneratorParser.g:1283:1: ruleButton returns [EObject current=null] : ( () otherlv_1= Button otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) this_BEGIN_4= RULE_BEGIN ( ( (lv_actions_5_0= ruleButtonActions ) ) (otherlv_6= Comma ( (lv_actions_7_0= ruleButtonActions ) ) )* )? this_END_8= RULE_END ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token this_BEGIN_4=null;
        Token otherlv_6=null;
        Token this_END_8=null;
        EObject lv_actions_5_0 = null;

        EObject lv_actions_7_0 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:1289:2: ( ( () otherlv_1= Button otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) this_BEGIN_4= RULE_BEGIN ( ( (lv_actions_5_0= ruleButtonActions ) ) (otherlv_6= Comma ( (lv_actions_7_0= ruleButtonActions ) ) )* )? this_END_8= RULE_END ) )
            // InternalAndroidGeneratorParser.g:1290:2: ( () otherlv_1= Button otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) this_BEGIN_4= RULE_BEGIN ( ( (lv_actions_5_0= ruleButtonActions ) ) (otherlv_6= Comma ( (lv_actions_7_0= ruleButtonActions ) ) )* )? this_END_8= RULE_END )
            {
            // InternalAndroidGeneratorParser.g:1290:2: ( () otherlv_1= Button otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) this_BEGIN_4= RULE_BEGIN ( ( (lv_actions_5_0= ruleButtonActions ) ) (otherlv_6= Comma ( (lv_actions_7_0= ruleButtonActions ) ) )* )? this_END_8= RULE_END )
            // InternalAndroidGeneratorParser.g:1291:3: () otherlv_1= Button otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) this_BEGIN_4= RULE_BEGIN ( ( (lv_actions_5_0= ruleButtonActions ) ) (otherlv_6= Comma ( (lv_actions_7_0= ruleButtonActions ) ) )* )? this_END_8= RULE_END
            {
            // InternalAndroidGeneratorParser.g:1291:3: ()
            // InternalAndroidGeneratorParser.g:1292:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getButtonAccess().getButtonAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Button,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getButtonAccess().getButtonKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getButtonAccess().getColonKeyword_2());
            		
            // InternalAndroidGeneratorParser.g:1306:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalAndroidGeneratorParser.g:1307:4: (lv_name_3_0= RULE_ID )
            {
            // InternalAndroidGeneratorParser.g:1307:4: (lv_name_3_0= RULE_ID )
            // InternalAndroidGeneratorParser.g:1308:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_3_0, grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getButtonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_23); 

            			newLeafNode(this_BEGIN_4, grammarAccess.getButtonAccess().getBEGINTerminalRuleCall_4());
            		
            // InternalAndroidGeneratorParser.g:1328:3: ( ( (lv_actions_5_0= ruleButtonActions ) ) (otherlv_6= Comma ( (lv_actions_7_0= ruleButtonActions ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Bundle||LA17_0==Toast) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:1329:4: ( (lv_actions_5_0= ruleButtonActions ) ) (otherlv_6= Comma ( (lv_actions_7_0= ruleButtonActions ) ) )*
                    {
                    // InternalAndroidGeneratorParser.g:1329:4: ( (lv_actions_5_0= ruleButtonActions ) )
                    // InternalAndroidGeneratorParser.g:1330:5: (lv_actions_5_0= ruleButtonActions )
                    {
                    // InternalAndroidGeneratorParser.g:1330:5: (lv_actions_5_0= ruleButtonActions )
                    // InternalAndroidGeneratorParser.g:1331:6: lv_actions_5_0= ruleButtonActions
                    {

                    						newCompositeNode(grammarAccess.getButtonAccess().getActionsButtonActionsParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    // InternalAndroidGeneratorParser.g:1348:4: (otherlv_6= Comma ( (lv_actions_7_0= ruleButtonActions ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==Comma) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalAndroidGeneratorParser.g:1349:5: otherlv_6= Comma ( (lv_actions_7_0= ruleButtonActions ) )
                    	    {
                    	    otherlv_6=(Token)match(input,Comma,FOLLOW_24); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getButtonAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalAndroidGeneratorParser.g:1353:5: ( (lv_actions_7_0= ruleButtonActions ) )
                    	    // InternalAndroidGeneratorParser.g:1354:6: (lv_actions_7_0= ruleButtonActions )
                    	    {
                    	    // InternalAndroidGeneratorParser.g:1354:6: (lv_actions_7_0= ruleButtonActions )
                    	    // InternalAndroidGeneratorParser.g:1355:7: lv_actions_7_0= ruleButtonActions
                    	    {

                    	    							newCompositeNode(grammarAccess.getButtonAccess().getActionsButtonActionsParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_actions_7_0=ruleButtonActions();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getButtonRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_7_0,
                    	    								"org.xtext.example.mdsd.AndroidGenerator.ButtonActions");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_8, grammarAccess.getButtonAccess().getENDTerminalRuleCall_6());
            		

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
    // InternalAndroidGeneratorParser.g:1382:1: entryRuleButtonActions returns [EObject current=null] : iv_ruleButtonActions= ruleButtonActions EOF ;
    public final EObject entryRuleButtonActions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonActions = null;


        try {
            // InternalAndroidGeneratorParser.g:1382:54: (iv_ruleButtonActions= ruleButtonActions EOF )
            // InternalAndroidGeneratorParser.g:1383:2: iv_ruleButtonActions= ruleButtonActions EOF
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
    // InternalAndroidGeneratorParser.g:1389:1: ruleButtonActions returns [EObject current=null] : (this_Toast_0= ruleToast | this_Bundle_1= ruleBundle ) ;
    public final EObject ruleButtonActions() throws RecognitionException {
        EObject current = null;

        EObject this_Toast_0 = null;

        EObject this_Bundle_1 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:1395:2: ( (this_Toast_0= ruleToast | this_Bundle_1= ruleBundle ) )
            // InternalAndroidGeneratorParser.g:1396:2: (this_Toast_0= ruleToast | this_Bundle_1= ruleBundle )
            {
            // InternalAndroidGeneratorParser.g:1396:2: (this_Toast_0= ruleToast | this_Bundle_1= ruleBundle )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Toast) ) {
                alt18=1;
            }
            else if ( (LA18_0==Bundle) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:1397:3: this_Toast_0= ruleToast
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
                    // InternalAndroidGeneratorParser.g:1406:3: this_Bundle_1= ruleBundle
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
    // InternalAndroidGeneratorParser.g:1418:1: entryRuleToast returns [EObject current=null] : iv_ruleToast= ruleToast EOF ;
    public final EObject entryRuleToast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToast = null;


        try {
            // InternalAndroidGeneratorParser.g:1418:46: (iv_ruleToast= ruleToast EOF )
            // InternalAndroidGeneratorParser.g:1419:2: iv_ruleToast= ruleToast EOF
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
    // InternalAndroidGeneratorParser.g:1425:1: ruleToast returns [EObject current=null] : (otherlv_0= Toast otherlv_1= Colon ( (lv_text_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleToast() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_text_2_0=null;


        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:1431:2: ( (otherlv_0= Toast otherlv_1= Colon ( (lv_text_2_0= RULE_STRING ) ) ) )
            // InternalAndroidGeneratorParser.g:1432:2: (otherlv_0= Toast otherlv_1= Colon ( (lv_text_2_0= RULE_STRING ) ) )
            {
            // InternalAndroidGeneratorParser.g:1432:2: (otherlv_0= Toast otherlv_1= Colon ( (lv_text_2_0= RULE_STRING ) ) )
            // InternalAndroidGeneratorParser.g:1433:3: otherlv_0= Toast otherlv_1= Colon ( (lv_text_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Toast,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getToastAccess().getToastKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getToastAccess().getColonKeyword_1());
            		
            // InternalAndroidGeneratorParser.g:1441:3: ( (lv_text_2_0= RULE_STRING ) )
            // InternalAndroidGeneratorParser.g:1442:4: (lv_text_2_0= RULE_STRING )
            {
            // InternalAndroidGeneratorParser.g:1442:4: (lv_text_2_0= RULE_STRING )
            // InternalAndroidGeneratorParser.g:1443:5: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_text_2_0, grammarAccess.getToastAccess().getTextSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getToastRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_2_0,
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
    // InternalAndroidGeneratorParser.g:1463:1: entryRuleBundle returns [EObject current=null] : iv_ruleBundle= ruleBundle EOF ;
    public final EObject entryRuleBundle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundle = null;


        try {
            // InternalAndroidGeneratorParser.g:1463:47: (iv_ruleBundle= ruleBundle EOF )
            // InternalAndroidGeneratorParser.g:1464:2: iv_ruleBundle= ruleBundle EOF
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
    // InternalAndroidGeneratorParser.g:1470:1: ruleBundle returns [EObject current=null] : (otherlv_0= Bundle otherlv_1= Colon ( (otherlv_2= RULE_ID ) ) ( (lv_holder_3_0= ruleHolder ) )? ) ;
    public final EObject ruleBundle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_holder_3_0 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:1476:2: ( (otherlv_0= Bundle otherlv_1= Colon ( (otherlv_2= RULE_ID ) ) ( (lv_holder_3_0= ruleHolder ) )? ) )
            // InternalAndroidGeneratorParser.g:1477:2: (otherlv_0= Bundle otherlv_1= Colon ( (otherlv_2= RULE_ID ) ) ( (lv_holder_3_0= ruleHolder ) )? )
            {
            // InternalAndroidGeneratorParser.g:1477:2: (otherlv_0= Bundle otherlv_1= Colon ( (otherlv_2= RULE_ID ) ) ( (lv_holder_3_0= ruleHolder ) )? )
            // InternalAndroidGeneratorParser.g:1478:3: otherlv_0= Bundle otherlv_1= Colon ( (otherlv_2= RULE_ID ) ) ( (lv_holder_3_0= ruleHolder ) )?
            {
            otherlv_0=(Token)match(input,Bundle,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBundleAccess().getBundleKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getBundleAccess().getColonKeyword_1());
            		
            // InternalAndroidGeneratorParser.g:1486:3: ( (otherlv_2= RULE_ID ) )
            // InternalAndroidGeneratorParser.g:1487:4: (otherlv_2= RULE_ID )
            {
            // InternalAndroidGeneratorParser.g:1487:4: (otherlv_2= RULE_ID )
            // InternalAndroidGeneratorParser.g:1488:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBundleRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_2, grammarAccess.getBundleAccess().getBundleRecipientFragmentCrossReference_2_0());
            				

            }


            }

            // InternalAndroidGeneratorParser.g:1499:3: ( (lv_holder_3_0= ruleHolder ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Holder) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:1500:4: (lv_holder_3_0= ruleHolder )
                    {
                    // InternalAndroidGeneratorParser.g:1500:4: (lv_holder_3_0= ruleHolder )
                    // InternalAndroidGeneratorParser.g:1501:5: lv_holder_3_0= ruleHolder
                    {

                    					newCompositeNode(grammarAccess.getBundleAccess().getHolderHolderParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_holder_3_0=ruleHolder();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBundleRule());
                    					}
                    					set(
                    						current,
                    						"holder",
                    						lv_holder_3_0,
                    						"org.xtext.example.mdsd.AndroidGenerator.Holder");
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
    // $ANTLR end "ruleBundle"


    // $ANTLR start "entryRuleHolder"
    // InternalAndroidGeneratorParser.g:1522:1: entryRuleHolder returns [EObject current=null] : iv_ruleHolder= ruleHolder EOF ;
    public final EObject entryRuleHolder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHolder = null;


        try {
            // InternalAndroidGeneratorParser.g:1522:47: (iv_ruleHolder= ruleHolder EOF )
            // InternalAndroidGeneratorParser.g:1523:2: iv_ruleHolder= ruleHolder EOF
            {
             newCompositeNode(grammarAccess.getHolderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHolder=ruleHolder();

            state._fsp--;

             current =iv_ruleHolder; 
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
    // $ANTLR end "entryRuleHolder"


    // $ANTLR start "ruleHolder"
    // InternalAndroidGeneratorParser.g:1529:1: ruleHolder returns [EObject current=null] : (otherlv_0= Holder otherlv_1= Colon ( (otherlv_2= RULE_ID ) ) (otherlv_3= Comma ( (otherlv_4= RULE_ID ) ) )* ) ;
    public final EObject ruleHolder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:1535:2: ( (otherlv_0= Holder otherlv_1= Colon ( (otherlv_2= RULE_ID ) ) (otherlv_3= Comma ( (otherlv_4= RULE_ID ) ) )* ) )
            // InternalAndroidGeneratorParser.g:1536:2: (otherlv_0= Holder otherlv_1= Colon ( (otherlv_2= RULE_ID ) ) (otherlv_3= Comma ( (otherlv_4= RULE_ID ) ) )* )
            {
            // InternalAndroidGeneratorParser.g:1536:2: (otherlv_0= Holder otherlv_1= Colon ( (otherlv_2= RULE_ID ) ) (otherlv_3= Comma ( (otherlv_4= RULE_ID ) ) )* )
            // InternalAndroidGeneratorParser.g:1537:3: otherlv_0= Holder otherlv_1= Colon ( (otherlv_2= RULE_ID ) ) (otherlv_3= Comma ( (otherlv_4= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,Holder,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getHolderAccess().getHolderKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getHolderAccess().getColonKeyword_1());
            		
            // InternalAndroidGeneratorParser.g:1545:3: ( (otherlv_2= RULE_ID ) )
            // InternalAndroidGeneratorParser.g:1546:4: (otherlv_2= RULE_ID )
            {
            // InternalAndroidGeneratorParser.g:1546:4: (otherlv_2= RULE_ID )
            // InternalAndroidGeneratorParser.g:1547:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHolderRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_2, grammarAccess.getHolderAccess().getHolDataholdersCrossReference_2_0());
            				

            }


            }

            // InternalAndroidGeneratorParser.g:1558:3: (otherlv_3= Comma ( (otherlv_4= RULE_ID ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==Comma) ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1==RULE_ID) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // InternalAndroidGeneratorParser.g:1559:4: otherlv_3= Comma ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_5); 

            	    				newLeafNode(otherlv_3, grammarAccess.getHolderAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalAndroidGeneratorParser.g:1563:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalAndroidGeneratorParser.g:1564:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalAndroidGeneratorParser.g:1564:5: (otherlv_4= RULE_ID )
            	    // InternalAndroidGeneratorParser.g:1565:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getHolderRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    						newLeafNode(otherlv_4, grammarAccess.getHolderAccess().getHolDataholdersCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // $ANTLR end "ruleHolder"


    // $ANTLR start "entryRuleFilterQuery"
    // InternalAndroidGeneratorParser.g:1581:1: entryRuleFilterQuery returns [EObject current=null] : iv_ruleFilterQuery= ruleFilterQuery EOF ;
    public final EObject entryRuleFilterQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterQuery = null;


        try {
            // InternalAndroidGeneratorParser.g:1581:52: (iv_ruleFilterQuery= ruleFilterQuery EOF )
            // InternalAndroidGeneratorParser.g:1582:2: iv_ruleFilterQuery= ruleFilterQuery EOF
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
    // InternalAndroidGeneratorParser.g:1588:1: ruleFilterQuery returns [EObject current=null] : ( () otherlv_1= FilterQuery otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) ( (lv_filterAttributes_4_0= ruleFilterAttributes ) ) ) ;
    public final EObject ruleFilterQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        EObject lv_filterAttributes_4_0 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:1594:2: ( ( () otherlv_1= FilterQuery otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) ( (lv_filterAttributes_4_0= ruleFilterAttributes ) ) ) )
            // InternalAndroidGeneratorParser.g:1595:2: ( () otherlv_1= FilterQuery otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) ( (lv_filterAttributes_4_0= ruleFilterAttributes ) ) )
            {
            // InternalAndroidGeneratorParser.g:1595:2: ( () otherlv_1= FilterQuery otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) ( (lv_filterAttributes_4_0= ruleFilterAttributes ) ) )
            // InternalAndroidGeneratorParser.g:1596:3: () otherlv_1= FilterQuery otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) ( (lv_filterAttributes_4_0= ruleFilterAttributes ) )
            {
            // InternalAndroidGeneratorParser.g:1596:3: ()
            // InternalAndroidGeneratorParser.g:1597:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFilterQueryAccess().getFilterQueryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,FilterQuery,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFilterQueryAccess().getFilterQueryKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getFilterQueryAccess().getColonKeyword_2());
            		
            // InternalAndroidGeneratorParser.g:1611:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalAndroidGeneratorParser.g:1612:4: (lv_name_3_0= RULE_ID )
            {
            // InternalAndroidGeneratorParser.g:1612:4: (lv_name_3_0= RULE_ID )
            // InternalAndroidGeneratorParser.g:1613:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_3_0, grammarAccess.getFilterQueryAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFilterQueryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAndroidGeneratorParser.g:1629:3: ( (lv_filterAttributes_4_0= ruleFilterAttributes ) )
            // InternalAndroidGeneratorParser.g:1630:4: (lv_filterAttributes_4_0= ruleFilterAttributes )
            {
            // InternalAndroidGeneratorParser.g:1630:4: (lv_filterAttributes_4_0= ruleFilterAttributes )
            // InternalAndroidGeneratorParser.g:1631:5: lv_filterAttributes_4_0= ruleFilterAttributes
            {

            					newCompositeNode(grammarAccess.getFilterQueryAccess().getFilterAttributesFilterAttributesParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_filterAttributes_4_0=ruleFilterAttributes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilterQueryRule());
            					}
            					set(
            						current,
            						"filterAttributes",
            						lv_filterAttributes_4_0,
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
    // InternalAndroidGeneratorParser.g:1652:1: entryRuleFilterAttributes returns [EObject current=null] : iv_ruleFilterAttributes= ruleFilterAttributes EOF ;
    public final EObject entryRuleFilterAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterAttributes = null;


        try {
            // InternalAndroidGeneratorParser.g:1652:57: (iv_ruleFilterAttributes= ruleFilterAttributes EOF )
            // InternalAndroidGeneratorParser.g:1653:2: iv_ruleFilterAttributes= ruleFilterAttributes EOF
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
    // InternalAndroidGeneratorParser.g:1659:1: ruleFilterAttributes returns [EObject current=null] : ( (lv_distance_0_0= ruleDistance ) ) ;
    public final EObject ruleFilterAttributes() throws RecognitionException {
        EObject current = null;

        EObject lv_distance_0_0 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:1665:2: ( ( (lv_distance_0_0= ruleDistance ) ) )
            // InternalAndroidGeneratorParser.g:1666:2: ( (lv_distance_0_0= ruleDistance ) )
            {
            // InternalAndroidGeneratorParser.g:1666:2: ( (lv_distance_0_0= ruleDistance ) )
            // InternalAndroidGeneratorParser.g:1667:3: (lv_distance_0_0= ruleDistance )
            {
            // InternalAndroidGeneratorParser.g:1667:3: (lv_distance_0_0= ruleDistance )
            // InternalAndroidGeneratorParser.g:1668:4: lv_distance_0_0= ruleDistance
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
    // InternalAndroidGeneratorParser.g:1688:1: entryRuleDistance returns [EObject current=null] : iv_ruleDistance= ruleDistance EOF ;
    public final EObject entryRuleDistance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistance = null;


        try {
            // InternalAndroidGeneratorParser.g:1688:49: (iv_ruleDistance= ruleDistance EOF )
            // InternalAndroidGeneratorParser.g:1689:2: iv_ruleDistance= ruleDistance EOF
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
    // InternalAndroidGeneratorParser.g:1695:1: ruleDistance returns [EObject current=null] : (otherlv_0= Dist otherlv_1= Colon ( (lv_unit_2_0= ruleUnit ) ) ( (lv_operator_3_0= ruleOperator ) ) ( (lv_results_4_0= ruleNumber ) ) ) ;
    public final EObject ruleDistance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_unit_2_0 = null;

        EObject lv_operator_3_0 = null;

        EObject lv_results_4_0 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:1701:2: ( (otherlv_0= Dist otherlv_1= Colon ( (lv_unit_2_0= ruleUnit ) ) ( (lv_operator_3_0= ruleOperator ) ) ( (lv_results_4_0= ruleNumber ) ) ) )
            // InternalAndroidGeneratorParser.g:1702:2: (otherlv_0= Dist otherlv_1= Colon ( (lv_unit_2_0= ruleUnit ) ) ( (lv_operator_3_0= ruleOperator ) ) ( (lv_results_4_0= ruleNumber ) ) )
            {
            // InternalAndroidGeneratorParser.g:1702:2: (otherlv_0= Dist otherlv_1= Colon ( (lv_unit_2_0= ruleUnit ) ) ( (lv_operator_3_0= ruleOperator ) ) ( (lv_results_4_0= ruleNumber ) ) )
            // InternalAndroidGeneratorParser.g:1703:3: otherlv_0= Dist otherlv_1= Colon ( (lv_unit_2_0= ruleUnit ) ) ( (lv_operator_3_0= ruleOperator ) ) ( (lv_results_4_0= ruleNumber ) )
            {
            otherlv_0=(Token)match(input,Dist,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDistanceAccess().getDistKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getDistanceAccess().getColonKeyword_1());
            		
            // InternalAndroidGeneratorParser.g:1711:3: ( (lv_unit_2_0= ruleUnit ) )
            // InternalAndroidGeneratorParser.g:1712:4: (lv_unit_2_0= ruleUnit )
            {
            // InternalAndroidGeneratorParser.g:1712:4: (lv_unit_2_0= ruleUnit )
            // InternalAndroidGeneratorParser.g:1713:5: lv_unit_2_0= ruleUnit
            {

            					newCompositeNode(grammarAccess.getDistanceAccess().getUnitUnitParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_28);
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

            // InternalAndroidGeneratorParser.g:1730:3: ( (lv_operator_3_0= ruleOperator ) )
            // InternalAndroidGeneratorParser.g:1731:4: (lv_operator_3_0= ruleOperator )
            {
            // InternalAndroidGeneratorParser.g:1731:4: (lv_operator_3_0= ruleOperator )
            // InternalAndroidGeneratorParser.g:1732:5: lv_operator_3_0= ruleOperator
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

            // InternalAndroidGeneratorParser.g:1749:3: ( (lv_results_4_0= ruleNumber ) )
            // InternalAndroidGeneratorParser.g:1750:4: (lv_results_4_0= ruleNumber )
            {
            // InternalAndroidGeneratorParser.g:1750:4: (lv_results_4_0= ruleNumber )
            // InternalAndroidGeneratorParser.g:1751:5: lv_results_4_0= ruleNumber
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
    // InternalAndroidGeneratorParser.g:1772:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalAndroidGeneratorParser.g:1772:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalAndroidGeneratorParser.g:1773:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalAndroidGeneratorParser.g:1779:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:1785:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalAndroidGeneratorParser.g:1786:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalAndroidGeneratorParser.g:1786:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalAndroidGeneratorParser.g:1787:3: (lv_value_0_0= RULE_INT )
            {
            // InternalAndroidGeneratorParser.g:1787:3: (lv_value_0_0= RULE_INT )
            // InternalAndroidGeneratorParser.g:1788:4: lv_value_0_0= RULE_INT
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
    // InternalAndroidGeneratorParser.g:1807:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // InternalAndroidGeneratorParser.g:1807:49: (iv_ruleOperator= ruleOperator EOF )
            // InternalAndroidGeneratorParser.g:1808:2: iv_ruleOperator= ruleOperator EOF
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
    // InternalAndroidGeneratorParser.g:1814:1: ruleOperator returns [EObject current=null] : ( ( () otherlv_1= GreaterThanSign ) | ( () otherlv_3= LessThanSign ) | ( () otherlv_5= EqualsSign ) ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:1820:2: ( ( ( () otherlv_1= GreaterThanSign ) | ( () otherlv_3= LessThanSign ) | ( () otherlv_5= EqualsSign ) ) )
            // InternalAndroidGeneratorParser.g:1821:2: ( ( () otherlv_1= GreaterThanSign ) | ( () otherlv_3= LessThanSign ) | ( () otherlv_5= EqualsSign ) )
            {
            // InternalAndroidGeneratorParser.g:1821:2: ( ( () otherlv_1= GreaterThanSign ) | ( () otherlv_3= LessThanSign ) | ( () otherlv_5= EqualsSign ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case GreaterThanSign:
                {
                alt21=1;
                }
                break;
            case LessThanSign:
                {
                alt21=2;
                }
                break;
            case EqualsSign:
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
                    // InternalAndroidGeneratorParser.g:1822:3: ( () otherlv_1= GreaterThanSign )
                    {
                    // InternalAndroidGeneratorParser.g:1822:3: ( () otherlv_1= GreaterThanSign )
                    // InternalAndroidGeneratorParser.g:1823:4: () otherlv_1= GreaterThanSign
                    {
                    // InternalAndroidGeneratorParser.g:1823:4: ()
                    // InternalAndroidGeneratorParser.g:1824:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOperatorAccess().getLessAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,GreaterThanSign,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAndroidGeneratorParser.g:1836:3: ( () otherlv_3= LessThanSign )
                    {
                    // InternalAndroidGeneratorParser.g:1836:3: ( () otherlv_3= LessThanSign )
                    // InternalAndroidGeneratorParser.g:1837:4: () otherlv_3= LessThanSign
                    {
                    // InternalAndroidGeneratorParser.g:1837:4: ()
                    // InternalAndroidGeneratorParser.g:1838:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOperatorAccess().getMoreAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,LessThanSign,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getOperatorAccess().getLessThanSignKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAndroidGeneratorParser.g:1850:3: ( () otherlv_5= EqualsSign )
                    {
                    // InternalAndroidGeneratorParser.g:1850:3: ( () otherlv_5= EqualsSign )
                    // InternalAndroidGeneratorParser.g:1851:4: () otherlv_5= EqualsSign
                    {
                    // InternalAndroidGeneratorParser.g:1851:4: ()
                    // InternalAndroidGeneratorParser.g:1852:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOperatorAccess().getEqualAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,EqualsSign,FOLLOW_2); 

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
    // InternalAndroidGeneratorParser.g:1867:1: entryRuleUnit returns [EObject current=null] : iv_ruleUnit= ruleUnit EOF ;
    public final EObject entryRuleUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnit = null;


        try {
            // InternalAndroidGeneratorParser.g:1867:45: (iv_ruleUnit= ruleUnit EOF )
            // InternalAndroidGeneratorParser.g:1868:2: iv_ruleUnit= ruleUnit EOF
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
    // InternalAndroidGeneratorParser.g:1874:1: ruleUnit returns [EObject current=null] : ( ( () otherlv_1= M ) | ( () otherlv_3= F ) ) ;
    public final EObject ruleUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:1880:2: ( ( ( () otherlv_1= M ) | ( () otherlv_3= F ) ) )
            // InternalAndroidGeneratorParser.g:1881:2: ( ( () otherlv_1= M ) | ( () otherlv_3= F ) )
            {
            // InternalAndroidGeneratorParser.g:1881:2: ( ( () otherlv_1= M ) | ( () otherlv_3= F ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==M) ) {
                alt22=1;
            }
            else if ( (LA22_0==F) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:1882:3: ( () otherlv_1= M )
                    {
                    // InternalAndroidGeneratorParser.g:1882:3: ( () otherlv_1= M )
                    // InternalAndroidGeneratorParser.g:1883:4: () otherlv_1= M
                    {
                    // InternalAndroidGeneratorParser.g:1883:4: ()
                    // InternalAndroidGeneratorParser.g:1884:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnitAccess().getMetersAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,M,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getUnitAccess().getMKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAndroidGeneratorParser.g:1896:3: ( () otherlv_3= F )
                    {
                    // InternalAndroidGeneratorParser.g:1896:3: ( () otherlv_3= F )
                    // InternalAndroidGeneratorParser.g:1897:4: () otherlv_3= F
                    {
                    // InternalAndroidGeneratorParser.g:1897:4: ()
                    // InternalAndroidGeneratorParser.g:1898:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnitAccess().getImperialAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,F,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000080000242L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000100000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100080400L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000829900L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100110000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000001C000000L});

}