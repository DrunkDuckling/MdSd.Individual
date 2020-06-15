/*
 * generated by Xtext 2.21.0
 */
grammar InternalAndroidGenerator;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mdsd.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleAndroidAppProject
entryRuleAndroidAppProject returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAndroidAppProjectRule()); }
	iv_ruleAndroidAppProject=ruleAndroidAppProject
	{ $current=$iv_ruleAndroidAppProject.current; }
	EOF;

// Rule AndroidAppProject
ruleAndroidAppProject returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getAndroidAppProjectAccess().getApplicationsApplicationParserRuleCall_0_0());
				}
				lv_applications_0_0=ruleApplication
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAndroidAppProjectRule());
					}
					add(
						$current,
						"applications",
						lv_applications_0_0,
						"org.xtext.example.mdsd.AndroidGenerator.Application");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getAndroidAppProjectAccess().getCommaKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAndroidAppProjectAccess().getApplicationsApplicationParserRuleCall_1_1_0());
					}
					lv_applications_2_0=ruleApplication
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAndroidAppProjectRule());
						}
						add(
							$current,
							"applications",
							lv_applications_2_0,
							"org.xtext.example.mdsd.AndroidGenerator.Application");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleApplication
entryRuleApplication returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getApplicationRule()); }
	iv_ruleApplication=ruleApplication
	{ $current=$iv_ruleApplication.current; }
	EOF;

// Rule Application
ruleApplication returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Application'
		{
			newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getApplicationKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getApplicationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getApplicationAccess().getAttributesApplicationAttributeParserRuleCall_2_0());
				}
				lv_attributes_2_0=ruleApplicationAttribute
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getApplicationRule());
					}
					add(
						$current,
						"attributes",
						lv_attributes_2_0,
						"org.xtext.example.mdsd.AndroidGenerator.ApplicationAttribute");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleApplicationAttribute
entryRuleApplicationAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getApplicationAttributeRule()); }
	iv_ruleApplicationAttribute=ruleApplicationAttribute
	{ $current=$iv_ruleApplicationAttribute.current; }
	EOF;

// Rule ApplicationAttribute
ruleApplicationAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationVersionParserRuleCall_0());
		}
		this_ApplicationVersion_0=ruleApplicationVersion
		{
			$current = $this_ApplicationVersion_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationPermissionListParserRuleCall_1());
		}
		this_ApplicationPermissionList_1=ruleApplicationPermissionList
		{
			$current = $this_ApplicationPermissionList_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationElementListParserRuleCall_2());
		}
		this_ApplicationElementList_2=ruleApplicationElementList
		{
			$current = $this_ApplicationElementList_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleApplicationVersion
entryRuleApplicationVersion returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getApplicationVersionRule()); }
	iv_ruleApplicationVersion=ruleApplicationVersion
	{ $current=$iv_ruleApplicationVersion.current; }
	EOF;

// Rule ApplicationVersion
ruleApplicationVersion returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getApplicationVersionAccess().getApplicationVersionAction_0(),
					$current);
			}
		)
		otherlv_1='Android-SDK'
		{
			newLeafNode(otherlv_1, grammarAccess.getApplicationVersionAccess().getAndroidSDKKeyword_1());
		}
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getApplicationVersionAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getApplicationVersionAccess().getResultNumberParserRuleCall_3_0());
				}
				lv_result_3_0=ruleNumber
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getApplicationVersionRule());
					}
					set(
						$current,
						"result",
						lv_result_3_0,
						"org.xtext.example.mdsd.AndroidGenerator.Number");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getApplicationVersionAccess().getTargetsdkTargetSDKParserRuleCall_4_0());
				}
				lv_targetsdk_4_0=ruleTargetSDK
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getApplicationVersionRule());
					}
					set(
						$current,
						"targetsdk",
						lv_targetsdk_4_0,
						"org.xtext.example.mdsd.AndroidGenerator.TargetSDK");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleTargetSDK
entryRuleTargetSDK returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTargetSDKRule()); }
	iv_ruleTargetSDK=ruleTargetSDK
	{ $current=$iv_ruleTargetSDK.current; }
	EOF;

// Rule TargetSDK
ruleTargetSDK returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getTargetSDKAccess().getTargetSDKAction_0(),
					$current);
			}
		)
		otherlv_1='Target-SDK'
		{
			newLeafNode(otherlv_1, grammarAccess.getTargetSDKAccess().getTargetSDKKeyword_1());
		}
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getTargetSDKAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTargetSDKAccess().getResultNumberParserRuleCall_3_0());
				}
				lv_result_3_0=ruleNumber
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTargetSDKRule());
					}
					set(
						$current,
						"result",
						lv_result_3_0,
						"org.xtext.example.mdsd.AndroidGenerator.Number");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTargetSDKAccess().getMinsdkMinSDKParserRuleCall_4_0());
				}
				lv_minsdk_4_0=ruleMinSDK
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTargetSDKRule());
					}
					set(
						$current,
						"minsdk",
						lv_minsdk_4_0,
						"org.xtext.example.mdsd.AndroidGenerator.MinSDK");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleMinSDK
entryRuleMinSDK returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMinSDKRule()); }
	iv_ruleMinSDK=ruleMinSDK
	{ $current=$iv_ruleMinSDK.current; }
	EOF;

// Rule MinSDK
ruleMinSDK returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getMinSDKAccess().getMinSDKAction_0(),
					$current);
			}
		)
		otherlv_1='Minimum-SDK'
		{
			newLeafNode(otherlv_1, grammarAccess.getMinSDKAccess().getMinimumSDKKeyword_1());
		}
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getMinSDKAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMinSDKAccess().getResultNumberParserRuleCall_3_0());
				}
				lv_result_3_0=ruleNumber
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMinSDKRule());
					}
					set(
						$current,
						"result",
						lv_result_3_0,
						"org.xtext.example.mdsd.AndroidGenerator.Number");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleApplicationPermissionList
entryRuleApplicationPermissionList returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getApplicationPermissionListRule()); }
	iv_ruleApplicationPermissionList=ruleApplicationPermissionList
	{ $current=$iv_ruleApplicationPermissionList.current; }
	EOF;

// Rule ApplicationPermissionList
ruleApplicationPermissionList returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='permissions'
		{
			newLeafNode(otherlv_0, grammarAccess.getApplicationPermissionListAccess().getPermissionsKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getApplicationPermissionListAccess().getPermissionsPermissionParserRuleCall_1_0());
				}
				lv_permissions_1_0=rulePermission
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getApplicationPermissionListRule());
					}
					add(
						$current,
						"permissions",
						lv_permissions_1_0,
						"org.xtext.example.mdsd.AndroidGenerator.Permission");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=','
			{
				newLeafNode(otherlv_2, grammarAccess.getApplicationPermissionListAccess().getCommaKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getApplicationPermissionListAccess().getPermissionsPermissionParserRuleCall_2_1_0());
					}
					lv_permissions_3_0=rulePermission
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getApplicationPermissionListRule());
						}
						add(
							$current,
							"permissions",
							lv_permissions_3_0,
							"org.xtext.example.mdsd.AndroidGenerator.Permission");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePermission
entryRulePermission returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPermissionRule()); }
	iv_rulePermission=rulePermission
	{ $current=$iv_rulePermission.current; }
	EOF;

// Rule Permission
rulePermission returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_PACKAGE_NAME
			{
				newLeafNode(lv_name_0_0, grammarAccess.getPermissionAccess().getNamePACKAGE_NAMETerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getPermissionRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.xtext.example.mdsd.AndroidGenerator.PACKAGE_NAME");
			}
		)
	)
;

// Entry rule entryRuleApplicationElementList
entryRuleApplicationElementList returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getApplicationElementListRule()); }
	iv_ruleApplicationElementList=ruleApplicationElementList
	{ $current=$iv_ruleApplicationElementList.current; }
	EOF;

// Rule ApplicationElementList
ruleApplicationElementList returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getApplicationElementListAccess().getApplicationElementListAction_0(),
					$current);
			}
		)
		otherlv_1='elements'
		{
			newLeafNode(otherlv_1, grammarAccess.getApplicationElementListAccess().getElementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getApplicationElementListAccess().getElementsApplicationElementParserRuleCall_2_0());
				}
				lv_elements_2_0=ruleApplicationElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getApplicationElementListRule());
					}
					add(
						$current,
						"elements",
						lv_elements_2_0,
						"org.xtext.example.mdsd.AndroidGenerator.ApplicationElement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleApplicationElement
entryRuleApplicationElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getApplicationElementRule()); }
	iv_ruleApplicationElement=ruleApplicationElement
	{ $current=$iv_ruleApplicationElement.current; }
	EOF;

// Rule ApplicationElement
ruleApplicationElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getApplicationElementAccess().getFragmentParserRuleCall_0());
		}
		this_Fragment_0=ruleFragment
		{
			$current = $this_Fragment_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getApplicationElementAccess().getModelParserRuleCall_1());
		}
		this_Model_1=ruleModel
		{
			$current = $this_Model_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Model'
		{
			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleFragment
entryRuleFragment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFragmentRule()); }
	iv_ruleFragment=ruleFragment
	{ $current=$iv_ruleFragment.current; }
	EOF;

// Rule Fragment
ruleFragment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getFragmentAccess().getFragmentAction_0(),
					$current);
			}
		)
		otherlv_1='Fragment'
		{
			newLeafNode(otherlv_1, grammarAccess.getFragmentAccess().getFragmentKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getFragmentAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFragmentRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFragmentAccess().getActivityAttributesActivityLayoutAttributesParserRuleCall_3_0());
				}
				lv_activityAttributes_3_0=ruleActivityLayoutAttributes
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFragmentRule());
					}
					add(
						$current,
						"activityAttributes",
						lv_activityAttributes_3_0,
						"org.xtext.example.mdsd.AndroidGenerator.ActivityLayoutAttributes");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleActivityLayoutAttributes
entryRuleActivityLayoutAttributes returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActivityLayoutAttributesRule()); }
	iv_ruleActivityLayoutAttributes=ruleActivityLayoutAttributes
	{ $current=$iv_ruleActivityLayoutAttributes.current; }
	EOF;

// Rule ActivityLayoutAttributes
ruleActivityLayoutAttributes returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getActivityLayoutAttributesAccess().getLayoutElementsLayoutElementParserRuleCall_0_0());
				}
				lv_layoutElements_0_0=ruleLayoutElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getActivityLayoutAttributesRule());
					}
					add(
						$current,
						"layoutElements",
						lv_layoutElements_0_0,
						"org.xtext.example.mdsd.AndroidGenerator.LayoutElement");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getActivityLayoutAttributesAccess().getCommaKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getActivityLayoutAttributesAccess().getLayoutElementsLayoutElementParserRuleCall_1_1_0());
					}
					lv_layoutElements_2_0=ruleLayoutElement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getActivityLayoutAttributesRule());
						}
						add(
							$current,
							"layoutElements",
							lv_layoutElements_2_0,
							"org.xtext.example.mdsd.AndroidGenerator.LayoutElement");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleLayoutElement
entryRuleLayoutElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLayoutElementRule()); }
	iv_ruleLayoutElement=ruleLayoutElement
	{ $current=$iv_ruleLayoutElement.current; }
	EOF;

// Rule LayoutElement
ruleLayoutElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getLayoutElementAccess().getButtonParserRuleCall_0());
		}
		this_Button_0=ruleButton
		{
			$current = $this_Button_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getLayoutElementAccess().getEditTextParserRuleCall_1());
		}
		this_EditText_1=ruleEditText
		{
			$current = $this_EditText_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getLayoutElementAccess().getSpinnerParserRuleCall_2());
		}
		this_Spinner_2=ruleSpinner
		{
			$current = $this_Spinner_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getLayoutElementAccess().getTypeMapParserRuleCall_3());
		}
		this_TypeMap_3=ruleTypeMap
		{
			$current = $this_TypeMap_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getLayoutElementAccess().getTypeSettingParserRuleCall_4());
		}
		this_TypeSetting_4=ruleTypeSetting
		{
			$current = $this_TypeSetting_4.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleTypeMap
entryRuleTypeMap returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeMapRule()); }
	iv_ruleTypeMap=ruleTypeMap
	{ $current=$iv_ruleTypeMap.current; }
	EOF;

// Rule TypeMap
ruleTypeMap returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getTypeMapAccess().getTypeMapAction_0(),
					$current);
			}
		)
		otherlv_1='Map'
		{
			newLeafNode(otherlv_1, grammarAccess.getTypeMapAccess().getMapKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTypeMapAccess().getActivitytypeattributeActivityTypeAttributesParserRuleCall_2_0());
				}
				lv_activitytypeattribute_2_0=ruleActivityTypeAttributes
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTypeMapRule());
					}
					set(
						$current,
						"activitytypeattribute",
						lv_activitytypeattribute_2_0,
						"org.xtext.example.mdsd.AndroidGenerator.ActivityTypeAttributes");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleTypeSetting
entryRuleTypeSetting returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeSettingRule()); }
	iv_ruleTypeSetting=ruleTypeSetting
	{ $current=$iv_ruleTypeSetting.current; }
	EOF;

// Rule TypeSetting
ruleTypeSetting returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getTypeSettingAccess().getTypeSettingAction_0(),
					$current);
			}
		)
		otherlv_1='Settings'
		{
			newLeafNode(otherlv_1, grammarAccess.getTypeSettingAccess().getSettingsKeyword_1());
		}
	)
;

// Entry rule entryRuleActivityTypeAttributes
entryRuleActivityTypeAttributes returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActivityTypeAttributesRule()); }
	iv_ruleActivityTypeAttributes=ruleActivityTypeAttributes
	{ $current=$iv_ruleActivityTypeAttributes.current; }
	EOF;

// Rule ActivityTypeAttributes
ruleActivityTypeAttributes returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getActivityTypeAttributesAccess().getFilterFilterQueryParserRuleCall_0());
			}
			lv_filter_0_0=ruleFilterQuery
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getActivityTypeAttributesRule());
				}
				set(
					$current,
					"filter",
					lv_filter_0_0,
					"org.xtext.example.mdsd.AndroidGenerator.FilterQuery");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleEditText
entryRuleEditText returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEditTextRule()); }
	iv_ruleEditText=ruleEditText
	{ $current=$iv_ruleEditText.current; }
	EOF;

// Rule EditText
ruleEditText returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getEditTextAccess().getEditTextAction_0(),
					$current);
			}
		)
		otherlv_1='EditText'
		{
			newLeafNode(otherlv_1, grammarAccess.getEditTextAccess().getEditTextKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getEditTextAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEditTextRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleSpinner
entryRuleSpinner returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSpinnerRule()); }
	iv_ruleSpinner=ruleSpinner
	{ $current=$iv_ruleSpinner.current; }
	EOF;

// Rule Spinner
ruleSpinner returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getSpinnerAccess().getSpinnerAction_0(),
					$current);
			}
		)
		otherlv_1='Spinner'
		{
			newLeafNode(otherlv_1, grammarAccess.getSpinnerAccess().getSpinnerKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getSpinnerAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSpinnerRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleButton
entryRuleButton returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getButtonRule()); }
	iv_ruleButton=ruleButton
	{ $current=$iv_ruleButton.current; }
	EOF;

// Rule Button
ruleButton returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getButtonAccess().getButtonAction_0(),
					$current);
			}
		)
		otherlv_1='Button'
		{
			newLeafNode(otherlv_1, grammarAccess.getButtonAccess().getButtonKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getButtonRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getButtonAccess().getActionsButtonActionsParserRuleCall_3_0_0());
					}
					lv_actions_3_0=ruleButtonActions
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getButtonRule());
						}
						add(
							$current,
							"actions",
							lv_actions_3_0,
							"org.xtext.example.mdsd.AndroidGenerator.ButtonActions");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getButtonAccess().getCommaKeyword_3_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getButtonAccess().getActionsButtonActionsParserRuleCall_3_1_1_0());
						}
						lv_actions_5_0=ruleButtonActions
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getButtonRule());
							}
							add(
								$current,
								"actions",
								lv_actions_5_0,
								"org.xtext.example.mdsd.AndroidGenerator.ButtonActions");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
	)
;

// Entry rule entryRuleButtonActions
entryRuleButtonActions returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getButtonActionsRule()); }
	iv_ruleButtonActions=ruleButtonActions
	{ $current=$iv_ruleButtonActions.current; }
	EOF;

// Rule ButtonActions
ruleButtonActions returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getButtonActionsAccess().getToastParserRuleCall_0());
		}
		this_Toast_0=ruleToast
		{
			$current = $this_Toast_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getButtonActionsAccess().getBundleParserRuleCall_1());
		}
		this_Bundle_1=ruleBundle
		{
			$current = $this_Bundle_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleToast
entryRuleToast returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getToastRule()); }
	iv_ruleToast=ruleToast
	{ $current=$iv_ruleToast.current; }
	EOF;

// Rule Toast
ruleToast returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Toast'
		{
			newLeafNode(otherlv_0, grammarAccess.getToastAccess().getToastKeyword_0());
		}
		(
			(
				lv_text_1_0=RULE_STRING
				{
					newLeafNode(lv_text_1_0, grammarAccess.getToastAccess().getTextSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getToastRule());
					}
					setWithLastConsumed(
						$current,
						"text",
						lv_text_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleBundle
entryRuleBundle returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBundleRule()); }
	iv_ruleBundle=ruleBundle
	{ $current=$iv_ruleBundle.current; }
	EOF;

// Rule Bundle
ruleBundle returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Bundle'
		{
			newLeafNode(otherlv_0, grammarAccess.getBundleAccess().getBundleKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBundleRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getBundleAccess().getBundleRecipientFragmentCrossReference_1_0());
				}
			)
		)
	)
;

// Entry rule entryRuleFilterQuery
entryRuleFilterQuery returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFilterQueryRule()); }
	iv_ruleFilterQuery=ruleFilterQuery
	{ $current=$iv_ruleFilterQuery.current; }
	EOF;

// Rule FilterQuery
ruleFilterQuery returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getFilterQueryAccess().getFilterQueryAction_0(),
					$current);
			}
		)
		otherlv_1='FilterQuery'
		{
			newLeafNode(otherlv_1, grammarAccess.getFilterQueryAccess().getFilterQueryKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getFilterQueryAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFilterQueryRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFilterQueryAccess().getFilterAttributesFilterAttributesParserRuleCall_3_0());
				}
				lv_filterAttributes_3_0=ruleFilterAttributes
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFilterQueryRule());
					}
					set(
						$current,
						"filterAttributes",
						lv_filterAttributes_3_0,
						"org.xtext.example.mdsd.AndroidGenerator.FilterAttributes");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleFilterAttributes
entryRuleFilterAttributes returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFilterAttributesRule()); }
	iv_ruleFilterAttributes=ruleFilterAttributes
	{ $current=$iv_ruleFilterAttributes.current; }
	EOF;

// Rule FilterAttributes
ruleFilterAttributes returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getFilterAttributesAccess().getDistanceDistanceParserRuleCall_0());
			}
			lv_distance_0_0=ruleDistance
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getFilterAttributesRule());
				}
				set(
					$current,
					"distance",
					lv_distance_0_0,
					"org.xtext.example.mdsd.AndroidGenerator.Distance");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleDistance
entryRuleDistance returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDistanceRule()); }
	iv_ruleDistance=ruleDistance
	{ $current=$iv_ruleDistance.current; }
	EOF;

// Rule Distance
ruleDistance returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Distance'
		{
			newLeafNode(otherlv_0, grammarAccess.getDistanceAccess().getDistanceKeyword_0());
		}
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getDistanceAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDistanceAccess().getUnitUnitParserRuleCall_2_0());
				}
				lv_unit_2_0=ruleUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDistanceRule());
					}
					set(
						$current,
						"unit",
						lv_unit_2_0,
						"org.xtext.example.mdsd.AndroidGenerator.Unit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDistanceAccess().getOperatorOperatorParserRuleCall_3_0());
				}
				lv_operator_3_0=ruleOperator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDistanceRule());
					}
					set(
						$current,
						"operator",
						lv_operator_3_0,
						"org.xtext.example.mdsd.AndroidGenerator.Operator");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDistanceAccess().getResultsNumberParserRuleCall_4_0());
				}
				lv_results_4_0=ruleNumber
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDistanceRule());
					}
					set(
						$current,
						"results",
						lv_results_4_0,
						"org.xtext.example.mdsd.AndroidGenerator.Number");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleNumber
entryRuleNumber returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNumberRule()); }
	iv_ruleNumber=ruleNumber
	{ $current=$iv_ruleNumber.current; }
	EOF;

// Rule Number
ruleNumber returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_value_0_0=RULE_INT
			{
				newLeafNode(lv_value_0_0, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getNumberRule());
				}
				setWithLastConsumed(
					$current,
					"value",
					lv_value_0_0,
					"org.eclipse.xtext.common.Terminals.INT");
			}
		)
	)
;

// Entry rule entryRuleOperator
entryRuleOperator returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOperatorRule()); }
	iv_ruleOperator=ruleOperator
	{ $current=$iv_ruleOperator.current; }
	EOF;

// Rule Operator
ruleOperator returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getOperatorAccess().getLessAction_0_0(),
						$current);
				}
			)
			otherlv_1='>'
			{
				newLeafNode(otherlv_1, grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_0_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getOperatorAccess().getMoreAction_1_0(),
						$current);
				}
			)
			otherlv_3='<'
			{
				newLeafNode(otherlv_3, grammarAccess.getOperatorAccess().getLessThanSignKeyword_1_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getOperatorAccess().getEqualAction_2_0(),
						$current);
				}
			)
			otherlv_5='='
			{
				newLeafNode(otherlv_5, grammarAccess.getOperatorAccess().getEqualsSignKeyword_2_1());
			}
		)
	)
;

// Entry rule entryRuleUnit
entryRuleUnit returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnitRule()); }
	iv_ruleUnit=ruleUnit
	{ $current=$iv_ruleUnit.current; }
	EOF;

// Rule Unit
ruleUnit returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getUnitAccess().getMetersAction_0_0(),
						$current);
				}
			)
			otherlv_1='m'
			{
				newLeafNode(otherlv_1, grammarAccess.getUnitAccess().getMKeyword_0_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getUnitAccess().getImperialAction_1_0(),
						$current);
				}
			)
			otherlv_3='f'
			{
				newLeafNode(otherlv_3, grammarAccess.getUnitAccess().getFKeyword_1_1());
			}
		)
	)
;

RULE_PACKAGE_NAME : '"' RULE_ID ('.' RULE_ID)* '"';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
