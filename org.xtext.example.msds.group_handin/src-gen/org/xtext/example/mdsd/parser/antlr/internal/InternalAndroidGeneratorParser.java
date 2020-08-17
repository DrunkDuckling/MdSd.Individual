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
    // InternalAndroidGeneratorParser.g:100:1: ruleApplication returns [EObject current=null] : (otherlv_0= App ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleApplicationAttribute ) )* ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_attributes_2_0 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:106:2: ( (otherlv_0= App ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleApplicationAttribute ) )* ) )
            // InternalAndroidGeneratorParser.g:107:2: (otherlv_0= App ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleApplicationAttribute ) )* )
            {
            // InternalAndroidGeneratorParser.g:107:2: (otherlv_0= App ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleApplicationAttribute ) )* )
            // InternalAndroidGeneratorParser.g:108:3: otherlv_0= App ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleApplicationAttribute ) )*
            {
            otherlv_0=(Token)match(input,App,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getAppKeyword_0());
            		
            // InternalAndroidGeneratorParser.g:112:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAndroidGeneratorParser.g:113:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAndroidGeneratorParser.g:113:4: (lv_name_1_0= RULE_ID )
            // InternalAndroidGeneratorParser.g:114:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            // InternalAndroidGeneratorParser.g:130:3: ( (lv_attributes_2_0= ruleApplicationAttribute ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Permissions||LA2_0==Elements||LA2_0==RULE_BEGIN) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAndroidGeneratorParser.g:131:4: (lv_attributes_2_0= ruleApplicationAttribute )
            	    {
            	    // InternalAndroidGeneratorParser.g:131:4: (lv_attributes_2_0= ruleApplicationAttribute )
            	    // InternalAndroidGeneratorParser.g:132:5: lv_attributes_2_0= ruleApplicationAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getApplicationAccess().getAttributesApplicationAttributeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
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
    // InternalAndroidGeneratorParser.g:153:1: entryRuleApplicationAttribute returns [EObject current=null] : iv_ruleApplicationAttribute= ruleApplicationAttribute EOF ;
    public final EObject entryRuleApplicationAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationAttribute = null;


        try {
            // InternalAndroidGeneratorParser.g:153:61: (iv_ruleApplicationAttribute= ruleApplicationAttribute EOF )
            // InternalAndroidGeneratorParser.g:154:2: iv_ruleApplicationAttribute= ruleApplicationAttribute EOF
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
    // InternalAndroidGeneratorParser.g:160:1: ruleApplicationAttribute returns [EObject current=null] : (this_ApplicationVersion_0= ruleApplicationVersion | this_ApplicationPermissionList_1= ruleApplicationPermissionList | this_ApplicationElementList_2= ruleApplicationElementList ) ;
    public final EObject ruleApplicationAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_ApplicationVersion_0 = null;

        EObject this_ApplicationPermissionList_1 = null;

        EObject this_ApplicationElementList_2 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:166:2: ( (this_ApplicationVersion_0= ruleApplicationVersion | this_ApplicationPermissionList_1= ruleApplicationPermissionList | this_ApplicationElementList_2= ruleApplicationElementList ) )
            // InternalAndroidGeneratorParser.g:167:2: (this_ApplicationVersion_0= ruleApplicationVersion | this_ApplicationPermissionList_1= ruleApplicationPermissionList | this_ApplicationElementList_2= ruleApplicationElementList )
            {
            // InternalAndroidGeneratorParser.g:167:2: (this_ApplicationVersion_0= ruleApplicationVersion | this_ApplicationPermissionList_1= ruleApplicationPermissionList | this_ApplicationElementList_2= ruleApplicationElementList )
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
                    // InternalAndroidGeneratorParser.g:168:3: this_ApplicationVersion_0= ruleApplicationVersion
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
                    // InternalAndroidGeneratorParser.g:177:3: this_ApplicationPermissionList_1= ruleApplicationPermissionList
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
                    // InternalAndroidGeneratorParser.g:186:3: this_ApplicationElementList_2= ruleApplicationElementList
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
    // InternalAndroidGeneratorParser.g:198:1: entryRuleApplicationVersion returns [EObject current=null] : iv_ruleApplicationVersion= ruleApplicationVersion EOF ;
    public final EObject entryRuleApplicationVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationVersion = null;


        try {
            // InternalAndroidGeneratorParser.g:198:59: (iv_ruleApplicationVersion= ruleApplicationVersion EOF )
            // InternalAndroidGeneratorParser.g:199:2: iv_ruleApplicationVersion= ruleApplicationVersion EOF
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
    // InternalAndroidGeneratorParser.g:205:1: ruleApplicationVersion returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN otherlv_2= AndroidSDK otherlv_3= Colon ( (lv_result_4_0= ruleNumber ) ) ( (lv_targetsdk_5_0= ruleTargetSDK ) )? this_END_6= RULE_END ) ;
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
            // InternalAndroidGeneratorParser.g:211:2: ( ( () this_BEGIN_1= RULE_BEGIN otherlv_2= AndroidSDK otherlv_3= Colon ( (lv_result_4_0= ruleNumber ) ) ( (lv_targetsdk_5_0= ruleTargetSDK ) )? this_END_6= RULE_END ) )
            // InternalAndroidGeneratorParser.g:212:2: ( () this_BEGIN_1= RULE_BEGIN otherlv_2= AndroidSDK otherlv_3= Colon ( (lv_result_4_0= ruleNumber ) ) ( (lv_targetsdk_5_0= ruleTargetSDK ) )? this_END_6= RULE_END )
            {
            // InternalAndroidGeneratorParser.g:212:2: ( () this_BEGIN_1= RULE_BEGIN otherlv_2= AndroidSDK otherlv_3= Colon ( (lv_result_4_0= ruleNumber ) ) ( (lv_targetsdk_5_0= ruleTargetSDK ) )? this_END_6= RULE_END )
            // InternalAndroidGeneratorParser.g:213:3: () this_BEGIN_1= RULE_BEGIN otherlv_2= AndroidSDK otherlv_3= Colon ( (lv_result_4_0= ruleNumber ) ) ( (lv_targetsdk_5_0= ruleTargetSDK ) )? this_END_6= RULE_END
            {
            // InternalAndroidGeneratorParser.g:213:3: ()
            // InternalAndroidGeneratorParser.g:214:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getApplicationVersionAccess().getApplicationVersionAction_0(),
            					current);
            			

            }

            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_6); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getApplicationVersionAccess().getBEGINTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,AndroidSDK,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getApplicationVersionAccess().getAndroidSDKKeyword_2());
            		
            otherlv_3=(Token)match(input,Colon,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getApplicationVersionAccess().getColonKeyword_3());
            		
            // InternalAndroidGeneratorParser.g:232:3: ( (lv_result_4_0= ruleNumber ) )
            // InternalAndroidGeneratorParser.g:233:4: (lv_result_4_0= ruleNumber )
            {
            // InternalAndroidGeneratorParser.g:233:4: (lv_result_4_0= ruleNumber )
            // InternalAndroidGeneratorParser.g:234:5: lv_result_4_0= ruleNumber
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

            // InternalAndroidGeneratorParser.g:251:3: ( (lv_targetsdk_5_0= ruleTargetSDK ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==TargetSDK) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:252:4: (lv_targetsdk_5_0= ruleTargetSDK )
                    {
                    // InternalAndroidGeneratorParser.g:252:4: (lv_targetsdk_5_0= ruleTargetSDK )
                    // InternalAndroidGeneratorParser.g:253:5: lv_targetsdk_5_0= ruleTargetSDK
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
    // InternalAndroidGeneratorParser.g:278:1: entryRuleTargetSDK returns [EObject current=null] : iv_ruleTargetSDK= ruleTargetSDK EOF ;
    public final EObject entryRuleTargetSDK() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetSDK = null;


        try {
            // InternalAndroidGeneratorParser.g:278:50: (iv_ruleTargetSDK= ruleTargetSDK EOF )
            // InternalAndroidGeneratorParser.g:279:2: iv_ruleTargetSDK= ruleTargetSDK EOF
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
    // InternalAndroidGeneratorParser.g:285:1: ruleTargetSDK returns [EObject current=null] : ( () otherlv_1= TargetSDK otherlv_2= Colon ( (lv_result_3_0= ruleNumber ) ) ( (lv_minsdk_4_0= ruleMinSDK ) )? ) ;
    public final EObject ruleTargetSDK() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_result_3_0 = null;

        EObject lv_minsdk_4_0 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:291:2: ( ( () otherlv_1= TargetSDK otherlv_2= Colon ( (lv_result_3_0= ruleNumber ) ) ( (lv_minsdk_4_0= ruleMinSDK ) )? ) )
            // InternalAndroidGeneratorParser.g:292:2: ( () otherlv_1= TargetSDK otherlv_2= Colon ( (lv_result_3_0= ruleNumber ) ) ( (lv_minsdk_4_0= ruleMinSDK ) )? )
            {
            // InternalAndroidGeneratorParser.g:292:2: ( () otherlv_1= TargetSDK otherlv_2= Colon ( (lv_result_3_0= ruleNumber ) ) ( (lv_minsdk_4_0= ruleMinSDK ) )? )
            // InternalAndroidGeneratorParser.g:293:3: () otherlv_1= TargetSDK otherlv_2= Colon ( (lv_result_3_0= ruleNumber ) ) ( (lv_minsdk_4_0= ruleMinSDK ) )?
            {
            // InternalAndroidGeneratorParser.g:293:3: ()
            // InternalAndroidGeneratorParser.g:294:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTargetSDKAccess().getTargetSDKAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,TargetSDK,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getTargetSDKAccess().getTargetSDKKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getTargetSDKAccess().getColonKeyword_2());
            		
            // InternalAndroidGeneratorParser.g:308:3: ( (lv_result_3_0= ruleNumber ) )
            // InternalAndroidGeneratorParser.g:309:4: (lv_result_3_0= ruleNumber )
            {
            // InternalAndroidGeneratorParser.g:309:4: (lv_result_3_0= ruleNumber )
            // InternalAndroidGeneratorParser.g:310:5: lv_result_3_0= ruleNumber
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

            // InternalAndroidGeneratorParser.g:327:3: ( (lv_minsdk_4_0= ruleMinSDK ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==MinimumSDK) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:328:4: (lv_minsdk_4_0= ruleMinSDK )
                    {
                    // InternalAndroidGeneratorParser.g:328:4: (lv_minsdk_4_0= ruleMinSDK )
                    // InternalAndroidGeneratorParser.g:329:5: lv_minsdk_4_0= ruleMinSDK
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
    // InternalAndroidGeneratorParser.g:350:1: entryRuleMinSDK returns [EObject current=null] : iv_ruleMinSDK= ruleMinSDK EOF ;
    public final EObject entryRuleMinSDK() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinSDK = null;


        try {
            // InternalAndroidGeneratorParser.g:350:47: (iv_ruleMinSDK= ruleMinSDK EOF )
            // InternalAndroidGeneratorParser.g:351:2: iv_ruleMinSDK= ruleMinSDK EOF
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
    // InternalAndroidGeneratorParser.g:357:1: ruleMinSDK returns [EObject current=null] : ( () otherlv_1= MinimumSDK otherlv_2= Colon ( (lv_result_3_0= ruleNumber ) ) ) ;
    public final EObject ruleMinSDK() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_result_3_0 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:363:2: ( ( () otherlv_1= MinimumSDK otherlv_2= Colon ( (lv_result_3_0= ruleNumber ) ) ) )
            // InternalAndroidGeneratorParser.g:364:2: ( () otherlv_1= MinimumSDK otherlv_2= Colon ( (lv_result_3_0= ruleNumber ) ) )
            {
            // InternalAndroidGeneratorParser.g:364:2: ( () otherlv_1= MinimumSDK otherlv_2= Colon ( (lv_result_3_0= ruleNumber ) ) )
            // InternalAndroidGeneratorParser.g:365:3: () otherlv_1= MinimumSDK otherlv_2= Colon ( (lv_result_3_0= ruleNumber ) )
            {
            // InternalAndroidGeneratorParser.g:365:3: ()
            // InternalAndroidGeneratorParser.g:366:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMinSDKAccess().getMinSDKAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,MinimumSDK,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getMinSDKAccess().getMinimumSDKKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getMinSDKAccess().getColonKeyword_2());
            		
            // InternalAndroidGeneratorParser.g:380:3: ( (lv_result_3_0= ruleNumber ) )
            // InternalAndroidGeneratorParser.g:381:4: (lv_result_3_0= ruleNumber )
            {
            // InternalAndroidGeneratorParser.g:381:4: (lv_result_3_0= ruleNumber )
            // InternalAndroidGeneratorParser.g:382:5: lv_result_3_0= ruleNumber
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
    // InternalAndroidGeneratorParser.g:403:1: entryRuleApplicationPermissionList returns [EObject current=null] : iv_ruleApplicationPermissionList= ruleApplicationPermissionList EOF ;
    public final EObject entryRuleApplicationPermissionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationPermissionList = null;


        try {
            // InternalAndroidGeneratorParser.g:403:66: (iv_ruleApplicationPermissionList= ruleApplicationPermissionList EOF )
            // InternalAndroidGeneratorParser.g:404:2: iv_ruleApplicationPermissionList= ruleApplicationPermissionList EOF
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
    // InternalAndroidGeneratorParser.g:410:1: ruleApplicationPermissionList returns [EObject current=null] : (otherlv_0= Permissions ( (lv_permissions_1_0= rulePermission ) ) (otherlv_2= Comma ( (lv_permissions_3_0= rulePermission ) ) )* ) ;
    public final EObject ruleApplicationPermissionList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_permissions_1_0 = null;

        EObject lv_permissions_3_0 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:416:2: ( (otherlv_0= Permissions ( (lv_permissions_1_0= rulePermission ) ) (otherlv_2= Comma ( (lv_permissions_3_0= rulePermission ) ) )* ) )
            // InternalAndroidGeneratorParser.g:417:2: (otherlv_0= Permissions ( (lv_permissions_1_0= rulePermission ) ) (otherlv_2= Comma ( (lv_permissions_3_0= rulePermission ) ) )* )
            {
            // InternalAndroidGeneratorParser.g:417:2: (otherlv_0= Permissions ( (lv_permissions_1_0= rulePermission ) ) (otherlv_2= Comma ( (lv_permissions_3_0= rulePermission ) ) )* )
            // InternalAndroidGeneratorParser.g:418:3: otherlv_0= Permissions ( (lv_permissions_1_0= rulePermission ) ) (otherlv_2= Comma ( (lv_permissions_3_0= rulePermission ) ) )*
            {
            otherlv_0=(Token)match(input,Permissions,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationPermissionListAccess().getPermissionsKeyword_0());
            		
            // InternalAndroidGeneratorParser.g:422:3: ( (lv_permissions_1_0= rulePermission ) )
            // InternalAndroidGeneratorParser.g:423:4: (lv_permissions_1_0= rulePermission )
            {
            // InternalAndroidGeneratorParser.g:423:4: (lv_permissions_1_0= rulePermission )
            // InternalAndroidGeneratorParser.g:424:5: lv_permissions_1_0= rulePermission
            {

            					newCompositeNode(grammarAccess.getApplicationPermissionListAccess().getPermissionsPermissionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalAndroidGeneratorParser.g:441:3: (otherlv_2= Comma ( (lv_permissions_3_0= rulePermission ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==Comma) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAndroidGeneratorParser.g:442:4: otherlv_2= Comma ( (lv_permissions_3_0= rulePermission ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FOLLOW_12); 

            	    				newLeafNode(otherlv_2, grammarAccess.getApplicationPermissionListAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalAndroidGeneratorParser.g:446:4: ( (lv_permissions_3_0= rulePermission ) )
            	    // InternalAndroidGeneratorParser.g:447:5: (lv_permissions_3_0= rulePermission )
            	    {
            	    // InternalAndroidGeneratorParser.g:447:5: (lv_permissions_3_0= rulePermission )
            	    // InternalAndroidGeneratorParser.g:448:6: lv_permissions_3_0= rulePermission
            	    {

            	    						newCompositeNode(grammarAccess.getApplicationPermissionListAccess().getPermissionsPermissionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
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
    // InternalAndroidGeneratorParser.g:470:1: entryRulePermission returns [EObject current=null] : iv_rulePermission= rulePermission EOF ;
    public final EObject entryRulePermission() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermission = null;


        try {
            // InternalAndroidGeneratorParser.g:470:51: (iv_rulePermission= rulePermission EOF )
            // InternalAndroidGeneratorParser.g:471:2: iv_rulePermission= rulePermission EOF
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
    // InternalAndroidGeneratorParser.g:477:1: rulePermission returns [EObject current=null] : ( (lv_name_0_0= RULE_PACKAGE_NAME ) ) ;
    public final EObject rulePermission() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:483:2: ( ( (lv_name_0_0= RULE_PACKAGE_NAME ) ) )
            // InternalAndroidGeneratorParser.g:484:2: ( (lv_name_0_0= RULE_PACKAGE_NAME ) )
            {
            // InternalAndroidGeneratorParser.g:484:2: ( (lv_name_0_0= RULE_PACKAGE_NAME ) )
            // InternalAndroidGeneratorParser.g:485:3: (lv_name_0_0= RULE_PACKAGE_NAME )
            {
            // InternalAndroidGeneratorParser.g:485:3: (lv_name_0_0= RULE_PACKAGE_NAME )
            // InternalAndroidGeneratorParser.g:486:4: lv_name_0_0= RULE_PACKAGE_NAME
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
    // InternalAndroidGeneratorParser.g:505:1: entryRuleApplicationElementList returns [EObject current=null] : iv_ruleApplicationElementList= ruleApplicationElementList EOF ;
    public final EObject entryRuleApplicationElementList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationElementList = null;


        try {
            // InternalAndroidGeneratorParser.g:505:63: (iv_ruleApplicationElementList= ruleApplicationElementList EOF )
            // InternalAndroidGeneratorParser.g:506:2: iv_ruleApplicationElementList= ruleApplicationElementList EOF
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
    // InternalAndroidGeneratorParser.g:512:1: ruleApplicationElementList returns [EObject current=null] : ( () otherlv_1= Elements this_BEGIN_2= RULE_BEGIN ( (lv_elements_3_0= ruleApplicationElement ) )* this_END_4= RULE_END ) ;
    public final EObject ruleApplicationElementList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:518:2: ( ( () otherlv_1= Elements this_BEGIN_2= RULE_BEGIN ( (lv_elements_3_0= ruleApplicationElement ) )* this_END_4= RULE_END ) )
            // InternalAndroidGeneratorParser.g:519:2: ( () otherlv_1= Elements this_BEGIN_2= RULE_BEGIN ( (lv_elements_3_0= ruleApplicationElement ) )* this_END_4= RULE_END )
            {
            // InternalAndroidGeneratorParser.g:519:2: ( () otherlv_1= Elements this_BEGIN_2= RULE_BEGIN ( (lv_elements_3_0= ruleApplicationElement ) )* this_END_4= RULE_END )
            // InternalAndroidGeneratorParser.g:520:3: () otherlv_1= Elements this_BEGIN_2= RULE_BEGIN ( (lv_elements_3_0= ruleApplicationElement ) )* this_END_4= RULE_END
            {
            // InternalAndroidGeneratorParser.g:520:3: ()
            // InternalAndroidGeneratorParser.g:521:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getApplicationElementListAccess().getApplicationElementListAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Elements,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getApplicationElementListAccess().getElementsKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getApplicationElementListAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalAndroidGeneratorParser.g:535:3: ( (lv_elements_3_0= ruleApplicationElement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Fragment||LA7_0==Model) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAndroidGeneratorParser.g:536:4: (lv_elements_3_0= ruleApplicationElement )
            	    {
            	    // InternalAndroidGeneratorParser.g:536:4: (lv_elements_3_0= ruleApplicationElement )
            	    // InternalAndroidGeneratorParser.g:537:5: lv_elements_3_0= ruleApplicationElement
            	    {

            	    					newCompositeNode(grammarAccess.getApplicationElementListAccess().getElementsApplicationElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_elements_3_0=ruleApplicationElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getApplicationElementListRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"org.xtext.example.mdsd.AndroidGenerator.ApplicationElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getApplicationElementListAccess().getENDTerminalRuleCall_4());
            		

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
    // InternalAndroidGeneratorParser.g:562:1: entryRuleApplicationElement returns [EObject current=null] : iv_ruleApplicationElement= ruleApplicationElement EOF ;
    public final EObject entryRuleApplicationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationElement = null;


        try {
            // InternalAndroidGeneratorParser.g:562:59: (iv_ruleApplicationElement= ruleApplicationElement EOF )
            // InternalAndroidGeneratorParser.g:563:2: iv_ruleApplicationElement= ruleApplicationElement EOF
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
    // InternalAndroidGeneratorParser.g:569:1: ruleApplicationElement returns [EObject current=null] : (this_Fragment_0= ruleFragment | this_Model_1= ruleModel ) ;
    public final EObject ruleApplicationElement() throws RecognitionException {
        EObject current = null;

        EObject this_Fragment_0 = null;

        EObject this_Model_1 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:575:2: ( (this_Fragment_0= ruleFragment | this_Model_1= ruleModel ) )
            // InternalAndroidGeneratorParser.g:576:2: (this_Fragment_0= ruleFragment | this_Model_1= ruleModel )
            {
            // InternalAndroidGeneratorParser.g:576:2: (this_Fragment_0= ruleFragment | this_Model_1= ruleModel )
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
                    // InternalAndroidGeneratorParser.g:577:3: this_Fragment_0= ruleFragment
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
                    // InternalAndroidGeneratorParser.g:586:3: this_Model_1= ruleModel
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
    // InternalAndroidGeneratorParser.g:598:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalAndroidGeneratorParser.g:598:46: (iv_ruleModel= ruleModel EOF )
            // InternalAndroidGeneratorParser.g:599:2: iv_ruleModel= ruleModel EOF
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
    // InternalAndroidGeneratorParser.g:605:1: ruleModel returns [EObject current=null] : (otherlv_0= Model ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:611:2: ( (otherlv_0= Model ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAndroidGeneratorParser.g:612:2: (otherlv_0= Model ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAndroidGeneratorParser.g:612:2: (otherlv_0= Model ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAndroidGeneratorParser.g:613:3: otherlv_0= Model ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Model,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
            		
            // InternalAndroidGeneratorParser.g:617:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAndroidGeneratorParser.g:618:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAndroidGeneratorParser.g:618:4: (lv_name_1_0= RULE_ID )
            // InternalAndroidGeneratorParser.g:619:5: lv_name_1_0= RULE_ID
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
    // InternalAndroidGeneratorParser.g:639:1: entryRuleFragment returns [EObject current=null] : iv_ruleFragment= ruleFragment EOF ;
    public final EObject entryRuleFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFragment = null;


        try {
            // InternalAndroidGeneratorParser.g:639:49: (iv_ruleFragment= ruleFragment EOF )
            // InternalAndroidGeneratorParser.g:640:2: iv_ruleFragment= ruleFragment EOF
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
    // InternalAndroidGeneratorParser.g:646:1: ruleFragment returns [EObject current=null] : ( () otherlv_1= Fragment ( (lv_name_2_0= RULE_ID ) ) ( (lv_activityAttributes_3_0= ruleActivityLayoutAttributes ) )? ) ;
    public final EObject ruleFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_activityAttributes_3_0 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:652:2: ( ( () otherlv_1= Fragment ( (lv_name_2_0= RULE_ID ) ) ( (lv_activityAttributes_3_0= ruleActivityLayoutAttributes ) )? ) )
            // InternalAndroidGeneratorParser.g:653:2: ( () otherlv_1= Fragment ( (lv_name_2_0= RULE_ID ) ) ( (lv_activityAttributes_3_0= ruleActivityLayoutAttributes ) )? )
            {
            // InternalAndroidGeneratorParser.g:653:2: ( () otherlv_1= Fragment ( (lv_name_2_0= RULE_ID ) ) ( (lv_activityAttributes_3_0= ruleActivityLayoutAttributes ) )? )
            // InternalAndroidGeneratorParser.g:654:3: () otherlv_1= Fragment ( (lv_name_2_0= RULE_ID ) ) ( (lv_activityAttributes_3_0= ruleActivityLayoutAttributes ) )?
            {
            // InternalAndroidGeneratorParser.g:654:3: ()
            // InternalAndroidGeneratorParser.g:655:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFragmentAccess().getFragmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Fragment,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFragmentAccess().getFragmentKeyword_1());
            		
            // InternalAndroidGeneratorParser.g:665:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAndroidGeneratorParser.g:666:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAndroidGeneratorParser.g:666:4: (lv_name_2_0= RULE_ID )
            // InternalAndroidGeneratorParser.g:667:5: lv_name_2_0= RULE_ID
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

            // InternalAndroidGeneratorParser.g:683:3: ( (lv_activityAttributes_3_0= ruleActivityLayoutAttributes ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_BEGIN) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:684:4: (lv_activityAttributes_3_0= ruleActivityLayoutAttributes )
                    {
                    // InternalAndroidGeneratorParser.g:684:4: (lv_activityAttributes_3_0= ruleActivityLayoutAttributes )
                    // InternalAndroidGeneratorParser.g:685:5: lv_activityAttributes_3_0= ruleActivityLayoutAttributes
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
    // InternalAndroidGeneratorParser.g:706:1: entryRuleActivityLayoutAttributes returns [EObject current=null] : iv_ruleActivityLayoutAttributes= ruleActivityLayoutAttributes EOF ;
    public final EObject entryRuleActivityLayoutAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityLayoutAttributes = null;


        try {
            // InternalAndroidGeneratorParser.g:706:65: (iv_ruleActivityLayoutAttributes= ruleActivityLayoutAttributes EOF )
            // InternalAndroidGeneratorParser.g:707:2: iv_ruleActivityLayoutAttributes= ruleActivityLayoutAttributes EOF
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
    // InternalAndroidGeneratorParser.g:713:1: ruleActivityLayoutAttributes returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN ( (lv_layoutElements_1_0= ruleLayoutElement ) ) (otherlv_2= Comma ( (lv_layoutElements_3_0= ruleLayoutElement ) ) )* this_END_4= RULE_END ) ;
    public final EObject ruleActivityLayoutAttributes() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_0=null;
        Token otherlv_2=null;
        Token this_END_4=null;
        EObject lv_layoutElements_1_0 = null;

        EObject lv_layoutElements_3_0 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:719:2: ( (this_BEGIN_0= RULE_BEGIN ( (lv_layoutElements_1_0= ruleLayoutElement ) ) (otherlv_2= Comma ( (lv_layoutElements_3_0= ruleLayoutElement ) ) )* this_END_4= RULE_END ) )
            // InternalAndroidGeneratorParser.g:720:2: (this_BEGIN_0= RULE_BEGIN ( (lv_layoutElements_1_0= ruleLayoutElement ) ) (otherlv_2= Comma ( (lv_layoutElements_3_0= ruleLayoutElement ) ) )* this_END_4= RULE_END )
            {
            // InternalAndroidGeneratorParser.g:720:2: (this_BEGIN_0= RULE_BEGIN ( (lv_layoutElements_1_0= ruleLayoutElement ) ) (otherlv_2= Comma ( (lv_layoutElements_3_0= ruleLayoutElement ) ) )* this_END_4= RULE_END )
            // InternalAndroidGeneratorParser.g:721:3: this_BEGIN_0= RULE_BEGIN ( (lv_layoutElements_1_0= ruleLayoutElement ) ) (otherlv_2= Comma ( (lv_layoutElements_3_0= ruleLayoutElement ) ) )* this_END_4= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_17); 

            			newLeafNode(this_BEGIN_0, grammarAccess.getActivityLayoutAttributesAccess().getBEGINTerminalRuleCall_0());
            		
            // InternalAndroidGeneratorParser.g:725:3: ( (lv_layoutElements_1_0= ruleLayoutElement ) )
            // InternalAndroidGeneratorParser.g:726:4: (lv_layoutElements_1_0= ruleLayoutElement )
            {
            // InternalAndroidGeneratorParser.g:726:4: (lv_layoutElements_1_0= ruleLayoutElement )
            // InternalAndroidGeneratorParser.g:727:5: lv_layoutElements_1_0= ruleLayoutElement
            {

            					newCompositeNode(grammarAccess.getActivityLayoutAttributesAccess().getLayoutElementsLayoutElementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_layoutElements_1_0=ruleLayoutElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActivityLayoutAttributesRule());
            					}
            					add(
            						current,
            						"layoutElements",
            						lv_layoutElements_1_0,
            						"org.xtext.example.mdsd.AndroidGenerator.LayoutElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAndroidGeneratorParser.g:744:3: (otherlv_2= Comma ( (lv_layoutElements_3_0= ruleLayoutElement ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Comma) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAndroidGeneratorParser.g:745:4: otherlv_2= Comma ( (lv_layoutElements_3_0= ruleLayoutElement ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FOLLOW_17); 

            	    				newLeafNode(otherlv_2, grammarAccess.getActivityLayoutAttributesAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalAndroidGeneratorParser.g:749:4: ( (lv_layoutElements_3_0= ruleLayoutElement ) )
            	    // InternalAndroidGeneratorParser.g:750:5: (lv_layoutElements_3_0= ruleLayoutElement )
            	    {
            	    // InternalAndroidGeneratorParser.g:750:5: (lv_layoutElements_3_0= ruleLayoutElement )
            	    // InternalAndroidGeneratorParser.g:751:6: lv_layoutElements_3_0= ruleLayoutElement
            	    {

            	    						newCompositeNode(grammarAccess.getActivityLayoutAttributesAccess().getLayoutElementsLayoutElementParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_layoutElements_3_0=ruleLayoutElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getActivityLayoutAttributesRule());
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

            			newLeafNode(this_END_4, grammarAccess.getActivityLayoutAttributesAccess().getENDTerminalRuleCall_3());
            		

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
    // InternalAndroidGeneratorParser.g:777:1: entryRuleLayoutElement returns [EObject current=null] : iv_ruleLayoutElement= ruleLayoutElement EOF ;
    public final EObject entryRuleLayoutElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayoutElement = null;


        try {
            // InternalAndroidGeneratorParser.g:777:54: (iv_ruleLayoutElement= ruleLayoutElement EOF )
            // InternalAndroidGeneratorParser.g:778:2: iv_ruleLayoutElement= ruleLayoutElement EOF
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
    // InternalAndroidGeneratorParser.g:784:1: ruleLayoutElement returns [EObject current=null] : (this_Button_0= ruleButton | this_Dataholders_1= ruleDataholders | this_TypeMap_2= ruleTypeMap | this_TypeSetting_3= ruleTypeSetting ) ;
    public final EObject ruleLayoutElement() throws RecognitionException {
        EObject current = null;

        EObject this_Button_0 = null;

        EObject this_Dataholders_1 = null;

        EObject this_TypeMap_2 = null;

        EObject this_TypeSetting_3 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:790:2: ( (this_Button_0= ruleButton | this_Dataholders_1= ruleDataholders | this_TypeMap_2= ruleTypeMap | this_TypeSetting_3= ruleTypeSetting ) )
            // InternalAndroidGeneratorParser.g:791:2: (this_Button_0= ruleButton | this_Dataholders_1= ruleDataholders | this_TypeMap_2= ruleTypeMap | this_TypeSetting_3= ruleTypeSetting )
            {
            // InternalAndroidGeneratorParser.g:791:2: (this_Button_0= ruleButton | this_Dataholders_1= ruleDataholders | this_TypeMap_2= ruleTypeMap | this_TypeSetting_3= ruleTypeSetting )
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
                    // InternalAndroidGeneratorParser.g:792:3: this_Button_0= ruleButton
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
                    // InternalAndroidGeneratorParser.g:801:3: this_Dataholders_1= ruleDataholders
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
                    // InternalAndroidGeneratorParser.g:810:3: this_TypeMap_2= ruleTypeMap
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
                    // InternalAndroidGeneratorParser.g:819:3: this_TypeSetting_3= ruleTypeSetting
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
    // InternalAndroidGeneratorParser.g:831:1: entryRuleDataholders returns [EObject current=null] : iv_ruleDataholders= ruleDataholders EOF ;
    public final EObject entryRuleDataholders() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataholders = null;


        try {
            // InternalAndroidGeneratorParser.g:831:52: (iv_ruleDataholders= ruleDataholders EOF )
            // InternalAndroidGeneratorParser.g:832:2: iv_ruleDataholders= ruleDataholders EOF
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
    // InternalAndroidGeneratorParser.g:838:1: ruleDataholders returns [EObject current=null] : (this_EditText_0= ruleEditText | this_Spinner_1= ruleSpinner | this_TextView_2= ruleTextView ) ;
    public final EObject ruleDataholders() throws RecognitionException {
        EObject current = null;

        EObject this_EditText_0 = null;

        EObject this_Spinner_1 = null;

        EObject this_TextView_2 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:844:2: ( (this_EditText_0= ruleEditText | this_Spinner_1= ruleSpinner | this_TextView_2= ruleTextView ) )
            // InternalAndroidGeneratorParser.g:845:2: (this_EditText_0= ruleEditText | this_Spinner_1= ruleSpinner | this_TextView_2= ruleTextView )
            {
            // InternalAndroidGeneratorParser.g:845:2: (this_EditText_0= ruleEditText | this_Spinner_1= ruleSpinner | this_TextView_2= ruleTextView )
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
                    // InternalAndroidGeneratorParser.g:846:3: this_EditText_0= ruleEditText
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
                    // InternalAndroidGeneratorParser.g:855:3: this_Spinner_1= ruleSpinner
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
                    // InternalAndroidGeneratorParser.g:864:3: this_TextView_2= ruleTextView
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
    // InternalAndroidGeneratorParser.g:876:1: entryRuleTypeMap returns [EObject current=null] : iv_ruleTypeMap= ruleTypeMap EOF ;
    public final EObject entryRuleTypeMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeMap = null;


        try {
            // InternalAndroidGeneratorParser.g:876:48: (iv_ruleTypeMap= ruleTypeMap EOF )
            // InternalAndroidGeneratorParser.g:877:2: iv_ruleTypeMap= ruleTypeMap EOF
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
    // InternalAndroidGeneratorParser.g:883:1: ruleTypeMap returns [EObject current=null] : ( () otherlv_1= Map ( (lv_activitytypeattribute_2_0= ruleActivityTypeAttributes ) )? ) ;
    public final EObject ruleTypeMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_activitytypeattribute_2_0 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:889:2: ( ( () otherlv_1= Map ( (lv_activitytypeattribute_2_0= ruleActivityTypeAttributes ) )? ) )
            // InternalAndroidGeneratorParser.g:890:2: ( () otherlv_1= Map ( (lv_activitytypeattribute_2_0= ruleActivityTypeAttributes ) )? )
            {
            // InternalAndroidGeneratorParser.g:890:2: ( () otherlv_1= Map ( (lv_activitytypeattribute_2_0= ruleActivityTypeAttributes ) )? )
            // InternalAndroidGeneratorParser.g:891:3: () otherlv_1= Map ( (lv_activitytypeattribute_2_0= ruleActivityTypeAttributes ) )?
            {
            // InternalAndroidGeneratorParser.g:891:3: ()
            // InternalAndroidGeneratorParser.g:892:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTypeMapAccess().getTypeMapAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Map,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getTypeMapAccess().getMapKeyword_1());
            		
            // InternalAndroidGeneratorParser.g:902:3: ( (lv_activitytypeattribute_2_0= ruleActivityTypeAttributes ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==FilterQuery) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:903:4: (lv_activitytypeattribute_2_0= ruleActivityTypeAttributes )
                    {
                    // InternalAndroidGeneratorParser.g:903:4: (lv_activitytypeattribute_2_0= ruleActivityTypeAttributes )
                    // InternalAndroidGeneratorParser.g:904:5: lv_activitytypeattribute_2_0= ruleActivityTypeAttributes
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
    // InternalAndroidGeneratorParser.g:925:1: entryRuleTypeSetting returns [EObject current=null] : iv_ruleTypeSetting= ruleTypeSetting EOF ;
    public final EObject entryRuleTypeSetting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSetting = null;


        try {
            // InternalAndroidGeneratorParser.g:925:52: (iv_ruleTypeSetting= ruleTypeSetting EOF )
            // InternalAndroidGeneratorParser.g:926:2: iv_ruleTypeSetting= ruleTypeSetting EOF
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
    // InternalAndroidGeneratorParser.g:932:1: ruleTypeSetting returns [EObject current=null] : ( () otherlv_1= Settings ) ;
    public final EObject ruleTypeSetting() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:938:2: ( ( () otherlv_1= Settings ) )
            // InternalAndroidGeneratorParser.g:939:2: ( () otherlv_1= Settings )
            {
            // InternalAndroidGeneratorParser.g:939:2: ( () otherlv_1= Settings )
            // InternalAndroidGeneratorParser.g:940:3: () otherlv_1= Settings
            {
            // InternalAndroidGeneratorParser.g:940:3: ()
            // InternalAndroidGeneratorParser.g:941:4: 
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


    // $ANTLR start "entryRuleActivityTypeAttributes"
    // InternalAndroidGeneratorParser.g:955:1: entryRuleActivityTypeAttributes returns [EObject current=null] : iv_ruleActivityTypeAttributes= ruleActivityTypeAttributes EOF ;
    public final EObject entryRuleActivityTypeAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityTypeAttributes = null;


        try {
            // InternalAndroidGeneratorParser.g:955:63: (iv_ruleActivityTypeAttributes= ruleActivityTypeAttributes EOF )
            // InternalAndroidGeneratorParser.g:956:2: iv_ruleActivityTypeAttributes= ruleActivityTypeAttributes EOF
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
    // InternalAndroidGeneratorParser.g:962:1: ruleActivityTypeAttributes returns [EObject current=null] : ( (lv_filter_0_0= ruleFilterQuery ) ) ;
    public final EObject ruleActivityTypeAttributes() throws RecognitionException {
        EObject current = null;

        EObject lv_filter_0_0 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:968:2: ( ( (lv_filter_0_0= ruleFilterQuery ) ) )
            // InternalAndroidGeneratorParser.g:969:2: ( (lv_filter_0_0= ruleFilterQuery ) )
            {
            // InternalAndroidGeneratorParser.g:969:2: ( (lv_filter_0_0= ruleFilterQuery ) )
            // InternalAndroidGeneratorParser.g:970:3: (lv_filter_0_0= ruleFilterQuery )
            {
            // InternalAndroidGeneratorParser.g:970:3: (lv_filter_0_0= ruleFilterQuery )
            // InternalAndroidGeneratorParser.g:971:4: lv_filter_0_0= ruleFilterQuery
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
    // InternalAndroidGeneratorParser.g:991:1: entryRuleEditText returns [EObject current=null] : iv_ruleEditText= ruleEditText EOF ;
    public final EObject entryRuleEditText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEditText = null;


        try {
            // InternalAndroidGeneratorParser.g:991:49: (iv_ruleEditText= ruleEditText EOF )
            // InternalAndroidGeneratorParser.g:992:2: iv_ruleEditText= ruleEditText EOF
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
    // InternalAndroidGeneratorParser.g:998:1: ruleEditText returns [EObject current=null] : (otherlv_0= EditText ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEditText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:1004:2: ( (otherlv_0= EditText ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAndroidGeneratorParser.g:1005:2: (otherlv_0= EditText ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAndroidGeneratorParser.g:1005:2: (otherlv_0= EditText ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAndroidGeneratorParser.g:1006:3: otherlv_0= EditText ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,EditText,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEditTextAccess().getEditTextKeyword_0());
            		
            // InternalAndroidGeneratorParser.g:1010:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAndroidGeneratorParser.g:1011:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAndroidGeneratorParser.g:1011:4: (lv_name_1_0= RULE_ID )
            // InternalAndroidGeneratorParser.g:1012:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEditTextAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEditTextRule());
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
    // $ANTLR end "ruleEditText"


    // $ANTLR start "entryRuleSpinner"
    // InternalAndroidGeneratorParser.g:1032:1: entryRuleSpinner returns [EObject current=null] : iv_ruleSpinner= ruleSpinner EOF ;
    public final EObject entryRuleSpinner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpinner = null;


        try {
            // InternalAndroidGeneratorParser.g:1032:48: (iv_ruleSpinner= ruleSpinner EOF )
            // InternalAndroidGeneratorParser.g:1033:2: iv_ruleSpinner= ruleSpinner EOF
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
    // InternalAndroidGeneratorParser.g:1039:1: ruleSpinner returns [EObject current=null] : (otherlv_0= Spinner ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Content otherlv_3= Colon ( (lv_spinnercon_4_0= ruleSpinnerCon ) ) (otherlv_5= Comma ( (lv_spinnercon_6_0= ruleSpinnerCon ) ) )* )? ) ;
    public final EObject ruleSpinner() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_spinnercon_4_0 = null;

        EObject lv_spinnercon_6_0 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:1045:2: ( (otherlv_0= Spinner ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Content otherlv_3= Colon ( (lv_spinnercon_4_0= ruleSpinnerCon ) ) (otherlv_5= Comma ( (lv_spinnercon_6_0= ruleSpinnerCon ) ) )* )? ) )
            // InternalAndroidGeneratorParser.g:1046:2: (otherlv_0= Spinner ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Content otherlv_3= Colon ( (lv_spinnercon_4_0= ruleSpinnerCon ) ) (otherlv_5= Comma ( (lv_spinnercon_6_0= ruleSpinnerCon ) ) )* )? )
            {
            // InternalAndroidGeneratorParser.g:1046:2: (otherlv_0= Spinner ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Content otherlv_3= Colon ( (lv_spinnercon_4_0= ruleSpinnerCon ) ) (otherlv_5= Comma ( (lv_spinnercon_6_0= ruleSpinnerCon ) ) )* )? )
            // InternalAndroidGeneratorParser.g:1047:3: otherlv_0= Spinner ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Content otherlv_3= Colon ( (lv_spinnercon_4_0= ruleSpinnerCon ) ) (otherlv_5= Comma ( (lv_spinnercon_6_0= ruleSpinnerCon ) ) )* )?
            {
            otherlv_0=(Token)match(input,Spinner,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSpinnerAccess().getSpinnerKeyword_0());
            		
            // InternalAndroidGeneratorParser.g:1051:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAndroidGeneratorParser.g:1052:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAndroidGeneratorParser.g:1052:4: (lv_name_1_0= RULE_ID )
            // InternalAndroidGeneratorParser.g:1053:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSpinnerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpinnerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAndroidGeneratorParser.g:1069:3: (otherlv_2= Content otherlv_3= Colon ( (lv_spinnercon_4_0= ruleSpinnerCon ) ) (otherlv_5= Comma ( (lv_spinnercon_6_0= ruleSpinnerCon ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Content) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:1070:4: otherlv_2= Content otherlv_3= Colon ( (lv_spinnercon_4_0= ruleSpinnerCon ) ) (otherlv_5= Comma ( (lv_spinnercon_6_0= ruleSpinnerCon ) ) )*
                    {
                    otherlv_2=(Token)match(input,Content,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getSpinnerAccess().getContentKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,Colon,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getSpinnerAccess().getColonKeyword_2_1());
                    			
                    // InternalAndroidGeneratorParser.g:1078:4: ( (lv_spinnercon_4_0= ruleSpinnerCon ) )
                    // InternalAndroidGeneratorParser.g:1079:5: (lv_spinnercon_4_0= ruleSpinnerCon )
                    {
                    // InternalAndroidGeneratorParser.g:1079:5: (lv_spinnercon_4_0= ruleSpinnerCon )
                    // InternalAndroidGeneratorParser.g:1080:6: lv_spinnercon_4_0= ruleSpinnerCon
                    {

                    						newCompositeNode(grammarAccess.getSpinnerAccess().getSpinnerconSpinnerConParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_spinnercon_4_0=ruleSpinnerCon();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSpinnerRule());
                    						}
                    						add(
                    							current,
                    							"spinnercon",
                    							lv_spinnercon_4_0,
                    							"org.xtext.example.mdsd.AndroidGenerator.SpinnerCon");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAndroidGeneratorParser.g:1097:4: (otherlv_5= Comma ( (lv_spinnercon_6_0= ruleSpinnerCon ) ) )*
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
                    	    // InternalAndroidGeneratorParser.g:1098:5: otherlv_5= Comma ( (lv_spinnercon_6_0= ruleSpinnerCon ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_21); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getSpinnerAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalAndroidGeneratorParser.g:1102:5: ( (lv_spinnercon_6_0= ruleSpinnerCon ) )
                    	    // InternalAndroidGeneratorParser.g:1103:6: (lv_spinnercon_6_0= ruleSpinnerCon )
                    	    {
                    	    // InternalAndroidGeneratorParser.g:1103:6: (lv_spinnercon_6_0= ruleSpinnerCon )
                    	    // InternalAndroidGeneratorParser.g:1104:7: lv_spinnercon_6_0= ruleSpinnerCon
                    	    {

                    	    							newCompositeNode(grammarAccess.getSpinnerAccess().getSpinnerconSpinnerConParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_spinnercon_6_0=ruleSpinnerCon();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSpinnerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"spinnercon",
                    	    								lv_spinnercon_6_0,
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
    // InternalAndroidGeneratorParser.g:1127:1: entryRuleSpinnerCon returns [EObject current=null] : iv_ruleSpinnerCon= ruleSpinnerCon EOF ;
    public final EObject entryRuleSpinnerCon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpinnerCon = null;


        try {
            // InternalAndroidGeneratorParser.g:1127:51: (iv_ruleSpinnerCon= ruleSpinnerCon EOF )
            // InternalAndroidGeneratorParser.g:1128:2: iv_ruleSpinnerCon= ruleSpinnerCon EOF
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
    // InternalAndroidGeneratorParser.g:1134:1: ruleSpinnerCon returns [EObject current=null] : ( (lv_text_0_0= RULE_STRING ) ) ;
    public final EObject ruleSpinnerCon() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;


        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:1140:2: ( ( (lv_text_0_0= RULE_STRING ) ) )
            // InternalAndroidGeneratorParser.g:1141:2: ( (lv_text_0_0= RULE_STRING ) )
            {
            // InternalAndroidGeneratorParser.g:1141:2: ( (lv_text_0_0= RULE_STRING ) )
            // InternalAndroidGeneratorParser.g:1142:3: (lv_text_0_0= RULE_STRING )
            {
            // InternalAndroidGeneratorParser.g:1142:3: (lv_text_0_0= RULE_STRING )
            // InternalAndroidGeneratorParser.g:1143:4: lv_text_0_0= RULE_STRING
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
    // InternalAndroidGeneratorParser.g:1162:1: entryRuleTextView returns [EObject current=null] : iv_ruleTextView= ruleTextView EOF ;
    public final EObject entryRuleTextView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextView = null;


        try {
            // InternalAndroidGeneratorParser.g:1162:49: (iv_ruleTextView= ruleTextView EOF )
            // InternalAndroidGeneratorParser.g:1163:2: iv_ruleTextView= ruleTextView EOF
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
    // InternalAndroidGeneratorParser.g:1169:1: ruleTextView returns [EObject current=null] : (otherlv_0= Textview ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Content_1 otherlv_3= Colon ( (lv_text_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleTextView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_text_4_0=null;


        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:1175:2: ( (otherlv_0= Textview ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Content_1 otherlv_3= Colon ( (lv_text_4_0= RULE_STRING ) ) ) )
            // InternalAndroidGeneratorParser.g:1176:2: (otherlv_0= Textview ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Content_1 otherlv_3= Colon ( (lv_text_4_0= RULE_STRING ) ) )
            {
            // InternalAndroidGeneratorParser.g:1176:2: (otherlv_0= Textview ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Content_1 otherlv_3= Colon ( (lv_text_4_0= RULE_STRING ) ) )
            // InternalAndroidGeneratorParser.g:1177:3: otherlv_0= Textview ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Content_1 otherlv_3= Colon ( (lv_text_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Textview,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTextViewAccess().getTextviewKeyword_0());
            		
            // InternalAndroidGeneratorParser.g:1181:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAndroidGeneratorParser.g:1182:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAndroidGeneratorParser.g:1182:4: (lv_name_1_0= RULE_ID )
            // InternalAndroidGeneratorParser.g:1183:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTextViewAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextViewRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,Content_1,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getTextViewAccess().getContentKeyword_2());
            		
            otherlv_3=(Token)match(input,Colon,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getTextViewAccess().getColonKeyword_3());
            		
            // InternalAndroidGeneratorParser.g:1207:3: ( (lv_text_4_0= RULE_STRING ) )
            // InternalAndroidGeneratorParser.g:1208:4: (lv_text_4_0= RULE_STRING )
            {
            // InternalAndroidGeneratorParser.g:1208:4: (lv_text_4_0= RULE_STRING )
            // InternalAndroidGeneratorParser.g:1209:5: lv_text_4_0= RULE_STRING
            {
            lv_text_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_text_4_0, grammarAccess.getTextViewAccess().getTextSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextViewRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_4_0,
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
    // InternalAndroidGeneratorParser.g:1229:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalAndroidGeneratorParser.g:1229:47: (iv_ruleButton= ruleButton EOF )
            // InternalAndroidGeneratorParser.g:1230:2: iv_ruleButton= ruleButton EOF
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
    // InternalAndroidGeneratorParser.g:1236:1: ruleButton returns [EObject current=null] : ( () otherlv_1= Button ( (lv_name_2_0= RULE_ID ) ) this_BEGIN_3= RULE_BEGIN ( ( (lv_actions_4_0= ruleButtonActions ) ) (otherlv_5= Comma ( (lv_actions_6_0= ruleButtonActions ) ) )* )? this_END_7= RULE_END ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_BEGIN_3=null;
        Token otherlv_5=null;
        Token this_END_7=null;
        EObject lv_actions_4_0 = null;

        EObject lv_actions_6_0 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:1242:2: ( ( () otherlv_1= Button ( (lv_name_2_0= RULE_ID ) ) this_BEGIN_3= RULE_BEGIN ( ( (lv_actions_4_0= ruleButtonActions ) ) (otherlv_5= Comma ( (lv_actions_6_0= ruleButtonActions ) ) )* )? this_END_7= RULE_END ) )
            // InternalAndroidGeneratorParser.g:1243:2: ( () otherlv_1= Button ( (lv_name_2_0= RULE_ID ) ) this_BEGIN_3= RULE_BEGIN ( ( (lv_actions_4_0= ruleButtonActions ) ) (otherlv_5= Comma ( (lv_actions_6_0= ruleButtonActions ) ) )* )? this_END_7= RULE_END )
            {
            // InternalAndroidGeneratorParser.g:1243:2: ( () otherlv_1= Button ( (lv_name_2_0= RULE_ID ) ) this_BEGIN_3= RULE_BEGIN ( ( (lv_actions_4_0= ruleButtonActions ) ) (otherlv_5= Comma ( (lv_actions_6_0= ruleButtonActions ) ) )* )? this_END_7= RULE_END )
            // InternalAndroidGeneratorParser.g:1244:3: () otherlv_1= Button ( (lv_name_2_0= RULE_ID ) ) this_BEGIN_3= RULE_BEGIN ( ( (lv_actions_4_0= ruleButtonActions ) ) (otherlv_5= Comma ( (lv_actions_6_0= ruleButtonActions ) ) )* )? this_END_7= RULE_END
            {
            // InternalAndroidGeneratorParser.g:1244:3: ()
            // InternalAndroidGeneratorParser.g:1245:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getButtonAccess().getButtonAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Button,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getButtonAccess().getButtonKeyword_1());
            		
            // InternalAndroidGeneratorParser.g:1255:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAndroidGeneratorParser.g:1256:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAndroidGeneratorParser.g:1256:4: (lv_name_2_0= RULE_ID )
            // InternalAndroidGeneratorParser.g:1257:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_23); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getButtonAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalAndroidGeneratorParser.g:1277:3: ( ( (lv_actions_4_0= ruleButtonActions ) ) (otherlv_5= Comma ( (lv_actions_6_0= ruleButtonActions ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Bundle||LA17_0==Toast) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:1278:4: ( (lv_actions_4_0= ruleButtonActions ) ) (otherlv_5= Comma ( (lv_actions_6_0= ruleButtonActions ) ) )*
                    {
                    // InternalAndroidGeneratorParser.g:1278:4: ( (lv_actions_4_0= ruleButtonActions ) )
                    // InternalAndroidGeneratorParser.g:1279:5: (lv_actions_4_0= ruleButtonActions )
                    {
                    // InternalAndroidGeneratorParser.g:1279:5: (lv_actions_4_0= ruleButtonActions )
                    // InternalAndroidGeneratorParser.g:1280:6: lv_actions_4_0= ruleButtonActions
                    {

                    						newCompositeNode(grammarAccess.getButtonAccess().getActionsButtonActionsParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_actions_4_0=ruleButtonActions();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getButtonRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_4_0,
                    							"org.xtext.example.mdsd.AndroidGenerator.ButtonActions");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAndroidGeneratorParser.g:1297:4: (otherlv_5= Comma ( (lv_actions_6_0= ruleButtonActions ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==Comma) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalAndroidGeneratorParser.g:1298:5: otherlv_5= Comma ( (lv_actions_6_0= ruleButtonActions ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_24); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getButtonAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalAndroidGeneratorParser.g:1302:5: ( (lv_actions_6_0= ruleButtonActions ) )
                    	    // InternalAndroidGeneratorParser.g:1303:6: (lv_actions_6_0= ruleButtonActions )
                    	    {
                    	    // InternalAndroidGeneratorParser.g:1303:6: (lv_actions_6_0= ruleButtonActions )
                    	    // InternalAndroidGeneratorParser.g:1304:7: lv_actions_6_0= ruleButtonActions
                    	    {

                    	    							newCompositeNode(grammarAccess.getButtonAccess().getActionsButtonActionsParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_actions_6_0=ruleButtonActions();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getButtonRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_6_0,
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

            this_END_7=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_7, grammarAccess.getButtonAccess().getENDTerminalRuleCall_5());
            		

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
    // InternalAndroidGeneratorParser.g:1331:1: entryRuleButtonActions returns [EObject current=null] : iv_ruleButtonActions= ruleButtonActions EOF ;
    public final EObject entryRuleButtonActions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonActions = null;


        try {
            // InternalAndroidGeneratorParser.g:1331:54: (iv_ruleButtonActions= ruleButtonActions EOF )
            // InternalAndroidGeneratorParser.g:1332:2: iv_ruleButtonActions= ruleButtonActions EOF
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
    // InternalAndroidGeneratorParser.g:1338:1: ruleButtonActions returns [EObject current=null] : (this_Toast_0= ruleToast | this_Bundle_1= ruleBundle ) ;
    public final EObject ruleButtonActions() throws RecognitionException {
        EObject current = null;

        EObject this_Toast_0 = null;

        EObject this_Bundle_1 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:1344:2: ( (this_Toast_0= ruleToast | this_Bundle_1= ruleBundle ) )
            // InternalAndroidGeneratorParser.g:1345:2: (this_Toast_0= ruleToast | this_Bundle_1= ruleBundle )
            {
            // InternalAndroidGeneratorParser.g:1345:2: (this_Toast_0= ruleToast | this_Bundle_1= ruleBundle )
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
                    // InternalAndroidGeneratorParser.g:1346:3: this_Toast_0= ruleToast
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
                    // InternalAndroidGeneratorParser.g:1355:3: this_Bundle_1= ruleBundle
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
    // InternalAndroidGeneratorParser.g:1367:1: entryRuleToast returns [EObject current=null] : iv_ruleToast= ruleToast EOF ;
    public final EObject entryRuleToast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToast = null;


        try {
            // InternalAndroidGeneratorParser.g:1367:46: (iv_ruleToast= ruleToast EOF )
            // InternalAndroidGeneratorParser.g:1368:2: iv_ruleToast= ruleToast EOF
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
    // InternalAndroidGeneratorParser.g:1374:1: ruleToast returns [EObject current=null] : (otherlv_0= Toast ( (lv_text_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleToast() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;


        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:1380:2: ( (otherlv_0= Toast ( (lv_text_1_0= RULE_STRING ) ) ) )
            // InternalAndroidGeneratorParser.g:1381:2: (otherlv_0= Toast ( (lv_text_1_0= RULE_STRING ) ) )
            {
            // InternalAndroidGeneratorParser.g:1381:2: (otherlv_0= Toast ( (lv_text_1_0= RULE_STRING ) ) )
            // InternalAndroidGeneratorParser.g:1382:3: otherlv_0= Toast ( (lv_text_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Toast,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getToastAccess().getToastKeyword_0());
            		
            // InternalAndroidGeneratorParser.g:1386:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalAndroidGeneratorParser.g:1387:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalAndroidGeneratorParser.g:1387:4: (lv_text_1_0= RULE_STRING )
            // InternalAndroidGeneratorParser.g:1388:5: lv_text_1_0= RULE_STRING
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
    // InternalAndroidGeneratorParser.g:1408:1: entryRuleBundle returns [EObject current=null] : iv_ruleBundle= ruleBundle EOF ;
    public final EObject entryRuleBundle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundle = null;


        try {
            // InternalAndroidGeneratorParser.g:1408:47: (iv_ruleBundle= ruleBundle EOF )
            // InternalAndroidGeneratorParser.g:1409:2: iv_ruleBundle= ruleBundle EOF
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
    // InternalAndroidGeneratorParser.g:1415:1: ruleBundle returns [EObject current=null] : (otherlv_0= Bundle ( (otherlv_1= RULE_ID ) ) ( (lv_holder_2_0= ruleHolder ) )? ) ;
    public final EObject ruleBundle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_holder_2_0 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:1421:2: ( (otherlv_0= Bundle ( (otherlv_1= RULE_ID ) ) ( (lv_holder_2_0= ruleHolder ) )? ) )
            // InternalAndroidGeneratorParser.g:1422:2: (otherlv_0= Bundle ( (otherlv_1= RULE_ID ) ) ( (lv_holder_2_0= ruleHolder ) )? )
            {
            // InternalAndroidGeneratorParser.g:1422:2: (otherlv_0= Bundle ( (otherlv_1= RULE_ID ) ) ( (lv_holder_2_0= ruleHolder ) )? )
            // InternalAndroidGeneratorParser.g:1423:3: otherlv_0= Bundle ( (otherlv_1= RULE_ID ) ) ( (lv_holder_2_0= ruleHolder ) )?
            {
            otherlv_0=(Token)match(input,Bundle,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBundleAccess().getBundleKeyword_0());
            		
            // InternalAndroidGeneratorParser.g:1427:3: ( (otherlv_1= RULE_ID ) )
            // InternalAndroidGeneratorParser.g:1428:4: (otherlv_1= RULE_ID )
            {
            // InternalAndroidGeneratorParser.g:1428:4: (otherlv_1= RULE_ID )
            // InternalAndroidGeneratorParser.g:1429:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBundleRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_1, grammarAccess.getBundleAccess().getBundleRecipientFragmentCrossReference_1_0());
            				

            }


            }

            // InternalAndroidGeneratorParser.g:1440:3: ( (lv_holder_2_0= ruleHolder ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Holder) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:1441:4: (lv_holder_2_0= ruleHolder )
                    {
                    // InternalAndroidGeneratorParser.g:1441:4: (lv_holder_2_0= ruleHolder )
                    // InternalAndroidGeneratorParser.g:1442:5: lv_holder_2_0= ruleHolder
                    {

                    					newCompositeNode(grammarAccess.getBundleAccess().getHolderHolderParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_holder_2_0=ruleHolder();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBundleRule());
                    					}
                    					set(
                    						current,
                    						"holder",
                    						lv_holder_2_0,
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
    // InternalAndroidGeneratorParser.g:1463:1: entryRuleHolder returns [EObject current=null] : iv_ruleHolder= ruleHolder EOF ;
    public final EObject entryRuleHolder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHolder = null;


        try {
            // InternalAndroidGeneratorParser.g:1463:47: (iv_ruleHolder= ruleHolder EOF )
            // InternalAndroidGeneratorParser.g:1464:2: iv_ruleHolder= ruleHolder EOF
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
    // InternalAndroidGeneratorParser.g:1470:1: ruleHolder returns [EObject current=null] : (otherlv_0= Holder ( (otherlv_1= RULE_ID ) ) (otherlv_2= Comma ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleHolder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:1476:2: ( (otherlv_0= Holder ( (otherlv_1= RULE_ID ) ) (otherlv_2= Comma ( (otherlv_3= RULE_ID ) ) )* ) )
            // InternalAndroidGeneratorParser.g:1477:2: (otherlv_0= Holder ( (otherlv_1= RULE_ID ) ) (otherlv_2= Comma ( (otherlv_3= RULE_ID ) ) )* )
            {
            // InternalAndroidGeneratorParser.g:1477:2: (otherlv_0= Holder ( (otherlv_1= RULE_ID ) ) (otherlv_2= Comma ( (otherlv_3= RULE_ID ) ) )* )
            // InternalAndroidGeneratorParser.g:1478:3: otherlv_0= Holder ( (otherlv_1= RULE_ID ) ) (otherlv_2= Comma ( (otherlv_3= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,Holder,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getHolderAccess().getHolderKeyword_0());
            		
            // InternalAndroidGeneratorParser.g:1482:3: ( (otherlv_1= RULE_ID ) )
            // InternalAndroidGeneratorParser.g:1483:4: (otherlv_1= RULE_ID )
            {
            // InternalAndroidGeneratorParser.g:1483:4: (otherlv_1= RULE_ID )
            // InternalAndroidGeneratorParser.g:1484:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHolderRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_1, grammarAccess.getHolderAccess().getHolDataholdersCrossReference_1_0());
            				

            }


            }

            // InternalAndroidGeneratorParser.g:1495:3: (otherlv_2= Comma ( (otherlv_3= RULE_ID ) ) )*
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
            	    // InternalAndroidGeneratorParser.g:1496:4: otherlv_2= Comma ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getHolderAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalAndroidGeneratorParser.g:1500:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalAndroidGeneratorParser.g:1501:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalAndroidGeneratorParser.g:1501:5: (otherlv_3= RULE_ID )
            	    // InternalAndroidGeneratorParser.g:1502:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getHolderRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_13); 

            	    						newLeafNode(otherlv_3, grammarAccess.getHolderAccess().getHolDataholdersCrossReference_2_1_0());
            	    					

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
    // InternalAndroidGeneratorParser.g:1518:1: entryRuleFilterQuery returns [EObject current=null] : iv_ruleFilterQuery= ruleFilterQuery EOF ;
    public final EObject entryRuleFilterQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterQuery = null;


        try {
            // InternalAndroidGeneratorParser.g:1518:52: (iv_ruleFilterQuery= ruleFilterQuery EOF )
            // InternalAndroidGeneratorParser.g:1519:2: iv_ruleFilterQuery= ruleFilterQuery EOF
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
    // InternalAndroidGeneratorParser.g:1525:1: ruleFilterQuery returns [EObject current=null] : ( () otherlv_1= FilterQuery ( (lv_name_2_0= RULE_ID ) ) ( (lv_filterAttributes_3_0= ruleFilterAttributes ) ) ) ;
    public final EObject ruleFilterQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_filterAttributes_3_0 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:1531:2: ( ( () otherlv_1= FilterQuery ( (lv_name_2_0= RULE_ID ) ) ( (lv_filterAttributes_3_0= ruleFilterAttributes ) ) ) )
            // InternalAndroidGeneratorParser.g:1532:2: ( () otherlv_1= FilterQuery ( (lv_name_2_0= RULE_ID ) ) ( (lv_filterAttributes_3_0= ruleFilterAttributes ) ) )
            {
            // InternalAndroidGeneratorParser.g:1532:2: ( () otherlv_1= FilterQuery ( (lv_name_2_0= RULE_ID ) ) ( (lv_filterAttributes_3_0= ruleFilterAttributes ) ) )
            // InternalAndroidGeneratorParser.g:1533:3: () otherlv_1= FilterQuery ( (lv_name_2_0= RULE_ID ) ) ( (lv_filterAttributes_3_0= ruleFilterAttributes ) )
            {
            // InternalAndroidGeneratorParser.g:1533:3: ()
            // InternalAndroidGeneratorParser.g:1534:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFilterQueryAccess().getFilterQueryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,FilterQuery,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFilterQueryAccess().getFilterQueryKeyword_1());
            		
            // InternalAndroidGeneratorParser.g:1544:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAndroidGeneratorParser.g:1545:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAndroidGeneratorParser.g:1545:4: (lv_name_2_0= RULE_ID )
            // InternalAndroidGeneratorParser.g:1546:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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

            // InternalAndroidGeneratorParser.g:1562:3: ( (lv_filterAttributes_3_0= ruleFilterAttributes ) )
            // InternalAndroidGeneratorParser.g:1563:4: (lv_filterAttributes_3_0= ruleFilterAttributes )
            {
            // InternalAndroidGeneratorParser.g:1563:4: (lv_filterAttributes_3_0= ruleFilterAttributes )
            // InternalAndroidGeneratorParser.g:1564:5: lv_filterAttributes_3_0= ruleFilterAttributes
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
    // InternalAndroidGeneratorParser.g:1585:1: entryRuleFilterAttributes returns [EObject current=null] : iv_ruleFilterAttributes= ruleFilterAttributes EOF ;
    public final EObject entryRuleFilterAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterAttributes = null;


        try {
            // InternalAndroidGeneratorParser.g:1585:57: (iv_ruleFilterAttributes= ruleFilterAttributes EOF )
            // InternalAndroidGeneratorParser.g:1586:2: iv_ruleFilterAttributes= ruleFilterAttributes EOF
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
    // InternalAndroidGeneratorParser.g:1592:1: ruleFilterAttributes returns [EObject current=null] : ( (lv_distance_0_0= ruleDistance ) ) ;
    public final EObject ruleFilterAttributes() throws RecognitionException {
        EObject current = null;

        EObject lv_distance_0_0 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:1598:2: ( ( (lv_distance_0_0= ruleDistance ) ) )
            // InternalAndroidGeneratorParser.g:1599:2: ( (lv_distance_0_0= ruleDistance ) )
            {
            // InternalAndroidGeneratorParser.g:1599:2: ( (lv_distance_0_0= ruleDistance ) )
            // InternalAndroidGeneratorParser.g:1600:3: (lv_distance_0_0= ruleDistance )
            {
            // InternalAndroidGeneratorParser.g:1600:3: (lv_distance_0_0= ruleDistance )
            // InternalAndroidGeneratorParser.g:1601:4: lv_distance_0_0= ruleDistance
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
    // InternalAndroidGeneratorParser.g:1621:1: entryRuleDistance returns [EObject current=null] : iv_ruleDistance= ruleDistance EOF ;
    public final EObject entryRuleDistance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistance = null;


        try {
            // InternalAndroidGeneratorParser.g:1621:49: (iv_ruleDistance= ruleDistance EOF )
            // InternalAndroidGeneratorParser.g:1622:2: iv_ruleDistance= ruleDistance EOF
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
    // InternalAndroidGeneratorParser.g:1628:1: ruleDistance returns [EObject current=null] : (otherlv_0= Distance otherlv_1= Colon ( (lv_unit_2_0= ruleUnit ) ) ( (lv_operator_3_0= ruleOperator ) ) ( (lv_results_4_0= ruleNumber ) ) ) ;
    public final EObject ruleDistance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_unit_2_0 = null;

        EObject lv_operator_3_0 = null;

        EObject lv_results_4_0 = null;



        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:1634:2: ( (otherlv_0= Distance otherlv_1= Colon ( (lv_unit_2_0= ruleUnit ) ) ( (lv_operator_3_0= ruleOperator ) ) ( (lv_results_4_0= ruleNumber ) ) ) )
            // InternalAndroidGeneratorParser.g:1635:2: (otherlv_0= Distance otherlv_1= Colon ( (lv_unit_2_0= ruleUnit ) ) ( (lv_operator_3_0= ruleOperator ) ) ( (lv_results_4_0= ruleNumber ) ) )
            {
            // InternalAndroidGeneratorParser.g:1635:2: (otherlv_0= Distance otherlv_1= Colon ( (lv_unit_2_0= ruleUnit ) ) ( (lv_operator_3_0= ruleOperator ) ) ( (lv_results_4_0= ruleNumber ) ) )
            // InternalAndroidGeneratorParser.g:1636:3: otherlv_0= Distance otherlv_1= Colon ( (lv_unit_2_0= ruleUnit ) ) ( (lv_operator_3_0= ruleOperator ) ) ( (lv_results_4_0= ruleNumber ) )
            {
            otherlv_0=(Token)match(input,Distance,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDistanceAccess().getDistanceKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getDistanceAccess().getColonKeyword_1());
            		
            // InternalAndroidGeneratorParser.g:1644:3: ( (lv_unit_2_0= ruleUnit ) )
            // InternalAndroidGeneratorParser.g:1645:4: (lv_unit_2_0= ruleUnit )
            {
            // InternalAndroidGeneratorParser.g:1645:4: (lv_unit_2_0= ruleUnit )
            // InternalAndroidGeneratorParser.g:1646:5: lv_unit_2_0= ruleUnit
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

            // InternalAndroidGeneratorParser.g:1663:3: ( (lv_operator_3_0= ruleOperator ) )
            // InternalAndroidGeneratorParser.g:1664:4: (lv_operator_3_0= ruleOperator )
            {
            // InternalAndroidGeneratorParser.g:1664:4: (lv_operator_3_0= ruleOperator )
            // InternalAndroidGeneratorParser.g:1665:5: lv_operator_3_0= ruleOperator
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

            // InternalAndroidGeneratorParser.g:1682:3: ( (lv_results_4_0= ruleNumber ) )
            // InternalAndroidGeneratorParser.g:1683:4: (lv_results_4_0= ruleNumber )
            {
            // InternalAndroidGeneratorParser.g:1683:4: (lv_results_4_0= ruleNumber )
            // InternalAndroidGeneratorParser.g:1684:5: lv_results_4_0= ruleNumber
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
    // InternalAndroidGeneratorParser.g:1705:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalAndroidGeneratorParser.g:1705:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalAndroidGeneratorParser.g:1706:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalAndroidGeneratorParser.g:1712:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:1718:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalAndroidGeneratorParser.g:1719:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalAndroidGeneratorParser.g:1719:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalAndroidGeneratorParser.g:1720:3: (lv_value_0_0= RULE_INT )
            {
            // InternalAndroidGeneratorParser.g:1720:3: (lv_value_0_0= RULE_INT )
            // InternalAndroidGeneratorParser.g:1721:4: lv_value_0_0= RULE_INT
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
    // InternalAndroidGeneratorParser.g:1740:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // InternalAndroidGeneratorParser.g:1740:49: (iv_ruleOperator= ruleOperator EOF )
            // InternalAndroidGeneratorParser.g:1741:2: iv_ruleOperator= ruleOperator EOF
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
    // InternalAndroidGeneratorParser.g:1747:1: ruleOperator returns [EObject current=null] : ( ( () otherlv_1= GreaterThanSign ) | ( () otherlv_3= LessThanSign ) | ( () otherlv_5= EqualsSign ) ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:1753:2: ( ( ( () otherlv_1= GreaterThanSign ) | ( () otherlv_3= LessThanSign ) | ( () otherlv_5= EqualsSign ) ) )
            // InternalAndroidGeneratorParser.g:1754:2: ( ( () otherlv_1= GreaterThanSign ) | ( () otherlv_3= LessThanSign ) | ( () otherlv_5= EqualsSign ) )
            {
            // InternalAndroidGeneratorParser.g:1754:2: ( ( () otherlv_1= GreaterThanSign ) | ( () otherlv_3= LessThanSign ) | ( () otherlv_5= EqualsSign ) )
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
                    // InternalAndroidGeneratorParser.g:1755:3: ( () otherlv_1= GreaterThanSign )
                    {
                    // InternalAndroidGeneratorParser.g:1755:3: ( () otherlv_1= GreaterThanSign )
                    // InternalAndroidGeneratorParser.g:1756:4: () otherlv_1= GreaterThanSign
                    {
                    // InternalAndroidGeneratorParser.g:1756:4: ()
                    // InternalAndroidGeneratorParser.g:1757:5: 
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
                    // InternalAndroidGeneratorParser.g:1769:3: ( () otherlv_3= LessThanSign )
                    {
                    // InternalAndroidGeneratorParser.g:1769:3: ( () otherlv_3= LessThanSign )
                    // InternalAndroidGeneratorParser.g:1770:4: () otherlv_3= LessThanSign
                    {
                    // InternalAndroidGeneratorParser.g:1770:4: ()
                    // InternalAndroidGeneratorParser.g:1771:5: 
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
                    // InternalAndroidGeneratorParser.g:1783:3: ( () otherlv_5= EqualsSign )
                    {
                    // InternalAndroidGeneratorParser.g:1783:3: ( () otherlv_5= EqualsSign )
                    // InternalAndroidGeneratorParser.g:1784:4: () otherlv_5= EqualsSign
                    {
                    // InternalAndroidGeneratorParser.g:1784:4: ()
                    // InternalAndroidGeneratorParser.g:1785:5: 
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
    // InternalAndroidGeneratorParser.g:1800:1: entryRuleUnit returns [EObject current=null] : iv_ruleUnit= ruleUnit EOF ;
    public final EObject entryRuleUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnit = null;


        try {
            // InternalAndroidGeneratorParser.g:1800:45: (iv_ruleUnit= ruleUnit EOF )
            // InternalAndroidGeneratorParser.g:1801:2: iv_ruleUnit= ruleUnit EOF
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
    // InternalAndroidGeneratorParser.g:1807:1: ruleUnit returns [EObject current=null] : ( ( () otherlv_1= M ) | ( () otherlv_3= F ) ) ;
    public final EObject ruleUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAndroidGeneratorParser.g:1813:2: ( ( ( () otherlv_1= M ) | ( () otherlv_3= F ) ) )
            // InternalAndroidGeneratorParser.g:1814:2: ( ( () otherlv_1= M ) | ( () otherlv_3= F ) )
            {
            // InternalAndroidGeneratorParser.g:1814:2: ( ( () otherlv_1= M ) | ( () otherlv_3= F ) )
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
                    // InternalAndroidGeneratorParser.g:1815:3: ( () otherlv_1= M )
                    {
                    // InternalAndroidGeneratorParser.g:1815:3: ( () otherlv_1= M )
                    // InternalAndroidGeneratorParser.g:1816:4: () otherlv_1= M
                    {
                    // InternalAndroidGeneratorParser.g:1816:4: ()
                    // InternalAndroidGeneratorParser.g:1817:5: 
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
                    // InternalAndroidGeneratorParser.g:1829:3: ( () otherlv_3= F )
                    {
                    // InternalAndroidGeneratorParser.g:1829:3: ( () otherlv_3= F )
                    // InternalAndroidGeneratorParser.g:1830:4: () otherlv_3= F
                    {
                    // InternalAndroidGeneratorParser.g:1830:4: ()
                    // InternalAndroidGeneratorParser.g:1831:5: 
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000400004082L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000800000100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000800200800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001093400L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000802000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800440000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000038000000L});

}