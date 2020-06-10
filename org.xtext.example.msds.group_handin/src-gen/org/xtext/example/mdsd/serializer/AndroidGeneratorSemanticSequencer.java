/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mdsd.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mdsd.androidGenerator.Activity;
import org.xtext.example.mdsd.androidGenerator.ActivityLayoutAttributes;
import org.xtext.example.mdsd.androidGenerator.ActivityTypeAttributes;
import org.xtext.example.mdsd.androidGenerator.AndroidAppProject;
import org.xtext.example.mdsd.androidGenerator.AndroidGeneratorPackage;
import org.xtext.example.mdsd.androidGenerator.Application;
import org.xtext.example.mdsd.androidGenerator.ApplicationElementList;
import org.xtext.example.mdsd.androidGenerator.ApplicationMainActivity;
import org.xtext.example.mdsd.androidGenerator.ApplicationPermissionList;
import org.xtext.example.mdsd.androidGenerator.ApplicationVersion;
import org.xtext.example.mdsd.androidGenerator.Button;
import org.xtext.example.mdsd.androidGenerator.Distance;
import org.xtext.example.mdsd.androidGenerator.Equal;
import org.xtext.example.mdsd.androidGenerator.FilterAttributes;
import org.xtext.example.mdsd.androidGenerator.FilterQuery;
import org.xtext.example.mdsd.androidGenerator.Fragment;
import org.xtext.example.mdsd.androidGenerator.GetSet;
import org.xtext.example.mdsd.androidGenerator.Imperial;
import org.xtext.example.mdsd.androidGenerator.Less;
import org.xtext.example.mdsd.androidGenerator.Meters;
import org.xtext.example.mdsd.androidGenerator.MinSDK;
import org.xtext.example.mdsd.androidGenerator.Model;
import org.xtext.example.mdsd.androidGenerator.ModelList;
import org.xtext.example.mdsd.androidGenerator.More;
import org.xtext.example.mdsd.androidGenerator.Permission;
import org.xtext.example.mdsd.androidGenerator.TargetSDK;
import org.xtext.example.mdsd.androidGenerator.TextView;
import org.xtext.example.mdsd.androidGenerator.Type;
import org.xtext.example.mdsd.androidGenerator.TypeMap;
import org.xtext.example.mdsd.androidGenerator.TypeSetting;
import org.xtext.example.mdsd.services.AndroidGeneratorGrammarAccess;

@SuppressWarnings("all")
public class AndroidGeneratorSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AndroidGeneratorGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == AndroidGeneratorPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case AndroidGeneratorPackage.ACTIVITY:
				sequence_Activity(context, (Activity) semanticObject); 
				return; 
			case AndroidGeneratorPackage.ACTIVITY_LAYOUT_ATTRIBUTES:
				sequence_ActivityLayoutAttributes(context, (ActivityLayoutAttributes) semanticObject); 
				return; 
			case AndroidGeneratorPackage.ACTIVITY_TYPE_ATTRIBUTES:
				sequence_ActivityTypeAttributes(context, (ActivityTypeAttributes) semanticObject); 
				return; 
			case AndroidGeneratorPackage.ANDROID_APP_PROJECT:
				sequence_AndroidAppProject(context, (AndroidAppProject) semanticObject); 
				return; 
			case AndroidGeneratorPackage.APPLICATION:
				sequence_Application(context, (Application) semanticObject); 
				return; 
			case AndroidGeneratorPackage.APPLICATION_ELEMENT_LIST:
				sequence_ApplicationElementList(context, (ApplicationElementList) semanticObject); 
				return; 
			case AndroidGeneratorPackage.APPLICATION_MAIN_ACTIVITY:
				sequence_ApplicationMainActivity(context, (ApplicationMainActivity) semanticObject); 
				return; 
			case AndroidGeneratorPackage.APPLICATION_PERMISSION_LIST:
				sequence_ApplicationPermissionList(context, (ApplicationPermissionList) semanticObject); 
				return; 
			case AndroidGeneratorPackage.APPLICATION_VERSION:
				sequence_ApplicationVersion(context, (ApplicationVersion) semanticObject); 
				return; 
			case AndroidGeneratorPackage.BUTTON:
				sequence_Button(context, (Button) semanticObject); 
				return; 
			case AndroidGeneratorPackage.DISTANCE:
				sequence_Distance(context, (Distance) semanticObject); 
				return; 
			case AndroidGeneratorPackage.EQUAL:
				sequence_Operator(context, (Equal) semanticObject); 
				return; 
			case AndroidGeneratorPackage.FILTER_ATTRIBUTES:
				sequence_FilterAttributes(context, (FilterAttributes) semanticObject); 
				return; 
			case AndroidGeneratorPackage.FILTER_QUERY:
				sequence_FilterQuery(context, (FilterQuery) semanticObject); 
				return; 
			case AndroidGeneratorPackage.FRAGMENT:
				sequence_Fragment(context, (Fragment) semanticObject); 
				return; 
			case AndroidGeneratorPackage.GET_SET:
				sequence_GetSet(context, (GetSet) semanticObject); 
				return; 
			case AndroidGeneratorPackage.IMPERIAL:
				sequence_Unit(context, (Imperial) semanticObject); 
				return; 
			case AndroidGeneratorPackage.LESS:
				sequence_Operator(context, (Less) semanticObject); 
				return; 
			case AndroidGeneratorPackage.METERS:
				sequence_Unit(context, (Meters) semanticObject); 
				return; 
			case AndroidGeneratorPackage.MIN_SDK:
				sequence_MinSDK(context, (MinSDK) semanticObject); 
				return; 
			case AndroidGeneratorPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case AndroidGeneratorPackage.MODEL_LIST:
				sequence_ModelList(context, (ModelList) semanticObject); 
				return; 
			case AndroidGeneratorPackage.MORE:
				sequence_Operator(context, (More) semanticObject); 
				return; 
			case AndroidGeneratorPackage.NUMBER:
				sequence_Number(context, (org.xtext.example.mdsd.androidGenerator.Number) semanticObject); 
				return; 
			case AndroidGeneratorPackage.PERMISSION:
				sequence_Permission(context, (Permission) semanticObject); 
				return; 
			case AndroidGeneratorPackage.TARGET_SDK:
				sequence_TargetSDK(context, (TargetSDK) semanticObject); 
				return; 
			case AndroidGeneratorPackage.TEXT_VIEW:
				sequence_TextView(context, (TextView) semanticObject); 
				return; 
			case AndroidGeneratorPackage.TYPE:
				sequence_Type(context, (Type) semanticObject); 
				return; 
			case AndroidGeneratorPackage.TYPE_MAP:
				sequence_ActivityType(context, (TypeMap) semanticObject); 
				return; 
			case AndroidGeneratorPackage.TYPE_SETTING:
				sequence_ActivityType(context, (TypeSetting) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ActivityLayoutAttributes returns ActivityLayoutAttributes
	 *
	 * Constraint:
	 *     (layoutElements+=LayoutElement layoutElements+=LayoutElement*)
	 */
	protected void sequence_ActivityLayoutAttributes(ISerializationContext context, ActivityLayoutAttributes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ActivityTypeAttributes returns ActivityTypeAttributes
	 *
	 * Constraint:
	 *     filter=FilterQuery
	 */
	protected void sequence_ActivityTypeAttributes(ISerializationContext context, ActivityTypeAttributes semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AndroidGeneratorPackage.Literals.ACTIVITY_TYPE_ATTRIBUTES__FILTER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroidGeneratorPackage.Literals.ACTIVITY_TYPE_ATTRIBUTES__FILTER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getActivityTypeAttributesAccess().getFilterFilterQueryParserRuleCall_0(), semanticObject.getFilter());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ActivityType returns TypeMap
	 *
	 * Constraint:
	 *     {TypeMap}
	 */
	protected void sequence_ActivityType(ISerializationContext context, TypeMap semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ActivityType returns TypeSetting
	 *
	 * Constraint:
	 *     {TypeSetting}
	 */
	protected void sequence_ActivityType(ISerializationContext context, TypeSetting semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ApplicationElement returns Activity
	 *     Activity returns Activity
	 *
	 * Constraint:
	 *     (
	 *         (activityType=ActivityType name=ID activityTypeAttributes=ActivityTypeAttributes activityAttributes+=ActivityLayoutAttributes*) | 
	 *         (name=ID activityAttributes+=ActivityLayoutAttributes*)
	 *     )?
	 */
	protected void sequence_Activity(ISerializationContext context, Activity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AndroidAppProject returns AndroidAppProject
	 *
	 * Constraint:
	 *     (applications+=Application applications+=Application*)
	 */
	protected void sequence_AndroidAppProject(ISerializationContext context, AndroidAppProject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ApplicationAttribute returns ApplicationElementList
	 *     ApplicationElementList returns ApplicationElementList
	 *
	 * Constraint:
	 *     elements+=ApplicationElement*
	 */
	protected void sequence_ApplicationElementList(ISerializationContext context, ApplicationElementList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ApplicationAttribute returns ApplicationMainActivity
	 *     ApplicationMainActivity returns ApplicationMainActivity
	 *
	 * Constraint:
	 *     launcherActivity=[Activity|ID]
	 */
	protected void sequence_ApplicationMainActivity(ISerializationContext context, ApplicationMainActivity semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AndroidGeneratorPackage.Literals.APPLICATION_MAIN_ACTIVITY__LAUNCHER_ACTIVITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroidGeneratorPackage.Literals.APPLICATION_MAIN_ACTIVITY__LAUNCHER_ACTIVITY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getApplicationMainActivityAccess().getLauncherActivityActivityIDTerminalRuleCall_1_0_1(), semanticObject.eGet(AndroidGeneratorPackage.Literals.APPLICATION_MAIN_ACTIVITY__LAUNCHER_ACTIVITY, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ApplicationAttribute returns ApplicationPermissionList
	 *     ApplicationPermissionList returns ApplicationPermissionList
	 *
	 * Constraint:
	 *     (permissions+=Permission permissions+=Permission*)
	 */
	protected void sequence_ApplicationPermissionList(ISerializationContext context, ApplicationPermissionList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ApplicationAttribute returns ApplicationVersion
	 *     ApplicationVersion returns ApplicationVersion
	 *
	 * Constraint:
	 *     (result=Number targetsdk=TargetSDK?)
	 */
	protected void sequence_ApplicationVersion(ISerializationContext context, ApplicationVersion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Application returns Application
	 *
	 * Constraint:
	 *     (name=ID attributes+=ApplicationAttribute*)
	 */
	protected void sequence_Application(ISerializationContext context, Application semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LayoutElement returns Button
	 *     Button returns Button
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Button(ISerializationContext context, Button semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AndroidGeneratorPackage.Literals.LAYOUT_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroidGeneratorPackage.Literals.LAYOUT_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Distance returns Distance
	 *
	 * Constraint:
	 *     (unit=Unit operator=Operator results=Number)
	 */
	protected void sequence_Distance(ISerializationContext context, Distance semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AndroidGeneratorPackage.Literals.DISTANCE__UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroidGeneratorPackage.Literals.DISTANCE__UNIT));
			if (transientValues.isValueTransient(semanticObject, AndroidGeneratorPackage.Literals.DISTANCE__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroidGeneratorPackage.Literals.DISTANCE__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, AndroidGeneratorPackage.Literals.DISTANCE__RESULTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroidGeneratorPackage.Literals.DISTANCE__RESULTS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDistanceAccess().getUnitUnitParserRuleCall_2_0(), semanticObject.getUnit());
		feeder.accept(grammarAccess.getDistanceAccess().getOperatorOperatorParserRuleCall_3_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getDistanceAccess().getResultsNumberParserRuleCall_4_0(), semanticObject.getResults());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FilterAttributes returns FilterAttributes
	 *
	 * Constraint:
	 *     distance=Distance
	 */
	protected void sequence_FilterAttributes(ISerializationContext context, FilterAttributes semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AndroidGeneratorPackage.Literals.FILTER_ATTRIBUTES__DISTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroidGeneratorPackage.Literals.FILTER_ATTRIBUTES__DISTANCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFilterAttributesAccess().getDistanceDistanceParserRuleCall_0(), semanticObject.getDistance());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FilterQuery returns FilterQuery
	 *
	 * Constraint:
	 *     (name=ID filterAttributes=FilterAttributes)
	 */
	protected void sequence_FilterQuery(ISerializationContext context, FilterQuery semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AndroidGeneratorPackage.Literals.FILTER_QUERY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroidGeneratorPackage.Literals.FILTER_QUERY__NAME));
			if (transientValues.isValueTransient(semanticObject, AndroidGeneratorPackage.Literals.FILTER_QUERY__FILTER_ATTRIBUTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroidGeneratorPackage.Literals.FILTER_QUERY__FILTER_ATTRIBUTES));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFilterQueryAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFilterQueryAccess().getFilterAttributesFilterAttributesParserRuleCall_3_0(), semanticObject.getFilterAttributes());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ApplicationElement returns Fragment
	 *     Fragment returns Fragment
	 *
	 * Constraint:
	 *     (activityType=ActivityType? name=ID activityAttributes+=ActivityLayoutAttributes?)
	 */
	protected void sequence_Fragment(ISerializationContext context, Fragment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GetSet returns GetSet
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_GetSet(ISerializationContext context, GetSet semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AndroidGeneratorPackage.Literals.GET_SET__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroidGeneratorPackage.Literals.GET_SET__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGetSetAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MinSDK returns MinSDK
	 *
	 * Constraint:
	 *     result=Number
	 */
	protected void sequence_MinSDK(ISerializationContext context, MinSDK semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AndroidGeneratorPackage.Literals.MIN_SDK__RESULT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroidGeneratorPackage.Literals.MIN_SDK__RESULT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMinSDKAccess().getResultNumberParserRuleCall_3_0(), semanticObject.getResult());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ModelList returns ModelList
	 *
	 * Constraint:
	 *     (type+=Type getset+=GetSet (type+=Type getset+=GetSet)*)
	 */
	protected void sequence_ModelList(ISerializationContext context, ModelList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ApplicationElement returns Model
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (activityType=ActivityType? name=ID modellist=ModelList?)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Number returns Number
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Number(ISerializationContext context, org.xtext.example.mdsd.androidGenerator.Number semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AndroidGeneratorPackage.Literals.NUMBER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroidGeneratorPackage.Literals.NUMBER__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Operator returns Equal
	 *
	 * Constraint:
	 *     {Equal}
	 */
	protected void sequence_Operator(ISerializationContext context, Equal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operator returns Less
	 *
	 * Constraint:
	 *     {Less}
	 */
	protected void sequence_Operator(ISerializationContext context, Less semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operator returns More
	 *
	 * Constraint:
	 *     {More}
	 */
	protected void sequence_Operator(ISerializationContext context, More semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Permission returns Permission
	 *
	 * Constraint:
	 *     name=PACKAGE_NAME
	 */
	protected void sequence_Permission(ISerializationContext context, Permission semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AndroidGeneratorPackage.Literals.PERMISSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroidGeneratorPackage.Literals.PERMISSION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPermissionAccess().getNamePACKAGE_NAMETerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TargetSDK returns TargetSDK
	 *
	 * Constraint:
	 *     (result=Number minsdk=MinSDK?)
	 */
	protected void sequence_TargetSDK(ISerializationContext context, TargetSDK semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LayoutElement returns TextView
	 *     TextView returns TextView
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_TextView(ISerializationContext context, TextView semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AndroidGeneratorPackage.Literals.LAYOUT_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroidGeneratorPackage.Literals.LAYOUT_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTextViewAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Type
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Type(ISerializationContext context, Type semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AndroidGeneratorPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroidGeneratorPackage.Literals.TYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Unit returns Imperial
	 *
	 * Constraint:
	 *     {Imperial}
	 */
	protected void sequence_Unit(ISerializationContext context, Imperial semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Unit returns Meters
	 *
	 * Constraint:
	 *     {Meters}
	 */
	protected void sequence_Unit(ISerializationContext context, Meters semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
