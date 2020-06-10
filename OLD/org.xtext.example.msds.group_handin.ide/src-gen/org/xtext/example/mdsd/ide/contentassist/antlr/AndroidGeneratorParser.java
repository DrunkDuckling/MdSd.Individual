/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mdsd.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mdsd.ide.contentassist.antlr.internal.InternalAndroidGeneratorParser;
import org.xtext.example.mdsd.services.AndroidGeneratorGrammarAccess;

public class AndroidGeneratorParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(AndroidGeneratorGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, AndroidGeneratorGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getApplicationAttributeAccess().getAlternatives(), "rule__ApplicationAttribute__Alternatives");
			builder.put(grammarAccess.getApplicationElementAccess().getAlternatives(), "rule__ApplicationElement__Alternatives");
			builder.put(grammarAccess.getActivityAccess().getAlternatives(), "rule__Activity__Alternatives");
			builder.put(grammarAccess.getLayoutElementAccess().getAlternatives(), "rule__LayoutElement__Alternatives");
			builder.put(grammarAccess.getOperatorAccess().getAlternatives(), "rule__Operator__Alternatives");
			builder.put(grammarAccess.getUnitAccess().getAlternatives(), "rule__Unit__Alternatives");
			builder.put(grammarAccess.getAndroidAppProjectAccess().getGroup(), "rule__AndroidAppProject__Group__0");
			builder.put(grammarAccess.getAndroidAppProjectAccess().getGroup_1(), "rule__AndroidAppProject__Group_1__0");
			builder.put(grammarAccess.getApplicationAccess().getGroup(), "rule__Application__Group__0");
			builder.put(grammarAccess.getApplicationVersionAccess().getGroup(), "rule__ApplicationVersion__Group__0");
			builder.put(grammarAccess.getTargetSDKAccess().getGroup(), "rule__TargetSDK__Group__0");
			builder.put(grammarAccess.getMinSDKAccess().getGroup(), "rule__MinSDK__Group__0");
			builder.put(grammarAccess.getApplicationPermissionListAccess().getGroup(), "rule__ApplicationPermissionList__Group__0");
			builder.put(grammarAccess.getApplicationPermissionListAccess().getGroup_2(), "rule__ApplicationPermissionList__Group_2__0");
			builder.put(grammarAccess.getApplicationElementListAccess().getGroup(), "rule__ApplicationElementList__Group__0");
			builder.put(grammarAccess.getApplicationMainActivityAccess().getGroup(), "rule__ApplicationMainActivity__Group__0");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getModelAccess().getGroup_2(), "rule__Model__Group_2__0");
			builder.put(grammarAccess.getModelListAccess().getGroup(), "rule__ModelList__Group__0");
			builder.put(grammarAccess.getModelListAccess().getGroup_3(), "rule__ModelList__Group_3__0");
			builder.put(grammarAccess.getGetSetAccess().getGroup(), "rule__GetSet__Group__0");
			builder.put(grammarAccess.getTypeAccess().getGroup(), "rule__Type__Group__0");
			builder.put(grammarAccess.getFragmentAccess().getGroup(), "rule__Fragment__Group__0");
			builder.put(grammarAccess.getFragmentAccess().getGroup_1(), "rule__Fragment__Group_1__0");
			builder.put(grammarAccess.getActivityAccess().getGroup_0(), "rule__Activity__Group_0__0");
			builder.put(grammarAccess.getActivityAccess().getGroup_0_2(), "rule__Activity__Group_0_2__0");
			builder.put(grammarAccess.getActivityAccess().getGroup_1(), "rule__Activity__Group_1__0");
			builder.put(grammarAccess.getActivityTypeAccess().getGroup(), "rule__ActivityType__Group__0");
			builder.put(grammarAccess.getActivityLayoutAttributesAccess().getGroup(), "rule__ActivityLayoutAttributes__Group__0");
			builder.put(grammarAccess.getActivityLayoutAttributesAccess().getGroup_1(), "rule__ActivityLayoutAttributes__Group_1__0");
			builder.put(grammarAccess.getTextViewAccess().getGroup(), "rule__TextView__Group__0");
			builder.put(grammarAccess.getButtonAccess().getGroup(), "rule__Button__Group__0");
			builder.put(grammarAccess.getFilterQueryAccess().getGroup(), "rule__FilterQuery__Group__0");
			builder.put(grammarAccess.getDistanceAccess().getGroup(), "rule__Distance__Group__0");
			builder.put(grammarAccess.getOperatorAccess().getGroup_0(), "rule__Operator__Group_0__0");
			builder.put(grammarAccess.getOperatorAccess().getGroup_1(), "rule__Operator__Group_1__0");
			builder.put(grammarAccess.getOperatorAccess().getGroup_2(), "rule__Operator__Group_2__0");
			builder.put(grammarAccess.getUnitAccess().getGroup_0(), "rule__Unit__Group_0__0");
			builder.put(grammarAccess.getUnitAccess().getGroup_1(), "rule__Unit__Group_1__0");
			builder.put(grammarAccess.getAndroidAppProjectAccess().getApplicationsAssignment_0(), "rule__AndroidAppProject__ApplicationsAssignment_0");
			builder.put(grammarAccess.getAndroidAppProjectAccess().getApplicationsAssignment_1_1(), "rule__AndroidAppProject__ApplicationsAssignment_1_1");
			builder.put(grammarAccess.getApplicationAccess().getNameAssignment_1(), "rule__Application__NameAssignment_1");
			builder.put(grammarAccess.getApplicationAccess().getAttributesAssignment_2(), "rule__Application__AttributesAssignment_2");
			builder.put(grammarAccess.getApplicationVersionAccess().getResultAssignment_3(), "rule__ApplicationVersion__ResultAssignment_3");
			builder.put(grammarAccess.getApplicationVersionAccess().getTargetsdkAssignment_4(), "rule__ApplicationVersion__TargetsdkAssignment_4");
			builder.put(grammarAccess.getTargetSDKAccess().getResultAssignment_3(), "rule__TargetSDK__ResultAssignment_3");
			builder.put(grammarAccess.getTargetSDKAccess().getMinsdkAssignment_4(), "rule__TargetSDK__MinsdkAssignment_4");
			builder.put(grammarAccess.getMinSDKAccess().getResultAssignment_3(), "rule__MinSDK__ResultAssignment_3");
			builder.put(grammarAccess.getApplicationPermissionListAccess().getPermissionsAssignment_1(), "rule__ApplicationPermissionList__PermissionsAssignment_1");
			builder.put(grammarAccess.getApplicationPermissionListAccess().getPermissionsAssignment_2_1(), "rule__ApplicationPermissionList__PermissionsAssignment_2_1");
			builder.put(grammarAccess.getPermissionAccess().getNameAssignment(), "rule__Permission__NameAssignment");
			builder.put(grammarAccess.getApplicationElementListAccess().getElementsAssignment_2(), "rule__ApplicationElementList__ElementsAssignment_2");
			builder.put(grammarAccess.getApplicationMainActivityAccess().getLauncherActivityAssignment_1(), "rule__ApplicationMainActivity__LauncherActivityAssignment_1");
			builder.put(grammarAccess.getModelAccess().getActivityTypeAssignment_2_1(), "rule__Model__ActivityTypeAssignment_2_1");
			builder.put(grammarAccess.getModelAccess().getNameAssignment_3(), "rule__Model__NameAssignment_3");
			builder.put(grammarAccess.getModelAccess().getModellistAssignment_4(), "rule__Model__ModellistAssignment_4");
			builder.put(grammarAccess.getModelListAccess().getTypeAssignment_0(), "rule__ModelList__TypeAssignment_0");
			builder.put(grammarAccess.getModelListAccess().getGetsetAssignment_2(), "rule__ModelList__GetsetAssignment_2");
			builder.put(grammarAccess.getModelListAccess().getTypeAssignment_3_1(), "rule__ModelList__TypeAssignment_3_1");
			builder.put(grammarAccess.getModelListAccess().getGetsetAssignment_3_3(), "rule__ModelList__GetsetAssignment_3_3");
			builder.put(grammarAccess.getGetSetAccess().getNameAssignment_1(), "rule__GetSet__NameAssignment_1");
			builder.put(grammarAccess.getTypeAccess().getNameAssignment_1(), "rule__Type__NameAssignment_1");
			builder.put(grammarAccess.getFragmentAccess().getActivityTypeAssignment_1_1(), "rule__Fragment__ActivityTypeAssignment_1_1");
			builder.put(grammarAccess.getFragmentAccess().getNameAssignment_2(), "rule__Fragment__NameAssignment_2");
			builder.put(grammarAccess.getFragmentAccess().getActivityAttributesAssignment_3(), "rule__Fragment__ActivityAttributesAssignment_3");
			builder.put(grammarAccess.getActivityAccess().getActivityTypeAssignment_0_2_1(), "rule__Activity__ActivityTypeAssignment_0_2_1");
			builder.put(grammarAccess.getActivityAccess().getNameAssignment_0_2_2(), "rule__Activity__NameAssignment_0_2_2");
			builder.put(grammarAccess.getActivityAccess().getActivityTypeAttributesAssignment_0_2_3(), "rule__Activity__ActivityTypeAttributesAssignment_0_2_3");
			builder.put(grammarAccess.getActivityAccess().getActivityAttributesAssignment_0_2_4(), "rule__Activity__ActivityAttributesAssignment_0_2_4");
			builder.put(grammarAccess.getActivityAccess().getNameAssignment_1_2(), "rule__Activity__NameAssignment_1_2");
			builder.put(grammarAccess.getActivityAccess().getActivityAttributesAssignment_1_3(), "rule__Activity__ActivityAttributesAssignment_1_3");
			builder.put(grammarAccess.getActivityTypeAttributesAccess().getFilterAssignment(), "rule__ActivityTypeAttributes__FilterAssignment");
			builder.put(grammarAccess.getActivityLayoutAttributesAccess().getLayoutElementsAssignment_0(), "rule__ActivityLayoutAttributes__LayoutElementsAssignment_0");
			builder.put(grammarAccess.getActivityLayoutAttributesAccess().getLayoutElementsAssignment_1_1(), "rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1");
			builder.put(grammarAccess.getTextViewAccess().getNameAssignment_2(), "rule__TextView__NameAssignment_2");
			builder.put(grammarAccess.getButtonAccess().getNameAssignment_2(), "rule__Button__NameAssignment_2");
			builder.put(grammarAccess.getFilterQueryAccess().getNameAssignment_2(), "rule__FilterQuery__NameAssignment_2");
			builder.put(grammarAccess.getFilterQueryAccess().getFilterAttributesAssignment_3(), "rule__FilterQuery__FilterAttributesAssignment_3");
			builder.put(grammarAccess.getFilterAttributesAccess().getDistanceAssignment(), "rule__FilterAttributes__DistanceAssignment");
			builder.put(grammarAccess.getDistanceAccess().getUnitAssignment_2(), "rule__Distance__UnitAssignment_2");
			builder.put(grammarAccess.getDistanceAccess().getOperatorAssignment_3(), "rule__Distance__OperatorAssignment_3");
			builder.put(grammarAccess.getDistanceAccess().getResultsAssignment_4(), "rule__Distance__ResultsAssignment_4");
			builder.put(grammarAccess.getNumberAccess().getValueAssignment(), "rule__Number__ValueAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private AndroidGeneratorGrammarAccess grammarAccess;

	@Override
	protected InternalAndroidGeneratorParser createParser() {
		InternalAndroidGeneratorParser result = new InternalAndroidGeneratorParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public AndroidGeneratorGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AndroidGeneratorGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
