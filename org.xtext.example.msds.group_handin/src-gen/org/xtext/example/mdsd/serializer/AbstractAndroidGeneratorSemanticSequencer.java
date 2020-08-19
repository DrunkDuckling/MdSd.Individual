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
import org.xtext.example.mdsd.androidGenerator.AndroidAppProject;
import org.xtext.example.mdsd.androidGenerator.AndroidGeneratorPackage;
import org.xtext.example.mdsd.androidGenerator.Application;
import org.xtext.example.mdsd.androidGenerator.ApplicationElementList;
import org.xtext.example.mdsd.androidGenerator.ApplicationPermissionList;
import org.xtext.example.mdsd.androidGenerator.ApplicationVersion;
import org.xtext.example.mdsd.androidGenerator.Bundle;
import org.xtext.example.mdsd.androidGenerator.Button;
import org.xtext.example.mdsd.androidGenerator.Distance;
import org.xtext.example.mdsd.androidGenerator.EditText;
import org.xtext.example.mdsd.androidGenerator.Equal;
import org.xtext.example.mdsd.androidGenerator.FilterAttributes;
import org.xtext.example.mdsd.androidGenerator.FilterQuery;
import org.xtext.example.mdsd.androidGenerator.Fragment;
import org.xtext.example.mdsd.androidGenerator.FragmentLayoutAttributes;
import org.xtext.example.mdsd.androidGenerator.FragmentTypeAttributes;
import org.xtext.example.mdsd.androidGenerator.Holder;
import org.xtext.example.mdsd.androidGenerator.Imperial;
import org.xtext.example.mdsd.androidGenerator.Less;
import org.xtext.example.mdsd.androidGenerator.Meters;
import org.xtext.example.mdsd.androidGenerator.MinSDK;
import org.xtext.example.mdsd.androidGenerator.Model;
import org.xtext.example.mdsd.androidGenerator.More;
import org.xtext.example.mdsd.androidGenerator.Permission;
import org.xtext.example.mdsd.androidGenerator.Spinner;
import org.xtext.example.mdsd.androidGenerator.SpinnerCon;
import org.xtext.example.mdsd.androidGenerator.TargetSDK;
import org.xtext.example.mdsd.androidGenerator.TextView;
import org.xtext.example.mdsd.androidGenerator.Toast;
import org.xtext.example.mdsd.androidGenerator.TypeMap;
import org.xtext.example.mdsd.androidGenerator.TypeSetting;
import org.xtext.example.mdsd.services.AndroidGeneratorGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractAndroidGeneratorSemanticSequencer extends AbstractDelegatingSemanticSequencer {

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
			case AndroidGeneratorPackage.ANDROID_APP_PROJECT:
				sequence_AndroidAppProject(context, (AndroidAppProject) semanticObject); 
				return; 
			case AndroidGeneratorPackage.APPLICATION:
				sequence_Application(context, (Application) semanticObject); 
				return; 
			case AndroidGeneratorPackage.APPLICATION_ELEMENT_LIST:
				sequence_ApplicationElementList(context, (ApplicationElementList) semanticObject); 
				return; 
			case AndroidGeneratorPackage.APPLICATION_PERMISSION_LIST:
				sequence_ApplicationPermissionList(context, (ApplicationPermissionList) semanticObject); 
				return; 
			case AndroidGeneratorPackage.APPLICATION_VERSION:
				sequence_ApplicationVersion(context, (ApplicationVersion) semanticObject); 
				return; 
			case AndroidGeneratorPackage.BUNDLE:
				sequence_Bundle(context, (Bundle) semanticObject); 
				return; 
			case AndroidGeneratorPackage.BUTTON:
				sequence_Button(context, (Button) semanticObject); 
				return; 
			case AndroidGeneratorPackage.DISTANCE:
				sequence_Distance(context, (Distance) semanticObject); 
				return; 
			case AndroidGeneratorPackage.EDIT_TEXT:
				sequence_EditText(context, (EditText) semanticObject); 
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
			case AndroidGeneratorPackage.FRAGMENT_LAYOUT_ATTRIBUTES:
				sequence_FragmentLayoutAttributes(context, (FragmentLayoutAttributes) semanticObject); 
				return; 
			case AndroidGeneratorPackage.FRAGMENT_TYPE_ATTRIBUTES:
				sequence_FragmentTypeAttributes(context, (FragmentTypeAttributes) semanticObject); 
				return; 
			case AndroidGeneratorPackage.HOLDER:
				sequence_Holder(context, (Holder) semanticObject); 
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
			case AndroidGeneratorPackage.MORE:
				sequence_Operator(context, (More) semanticObject); 
				return; 
			case AndroidGeneratorPackage.NUMBER:
				sequence_Number(context, (org.xtext.example.mdsd.androidGenerator.Number) semanticObject); 
				return; 
			case AndroidGeneratorPackage.PERMISSION:
				sequence_Permission(context, (Permission) semanticObject); 
				return; 
			case AndroidGeneratorPackage.SPINNER:
				sequence_Spinner(context, (Spinner) semanticObject); 
				return; 
			case AndroidGeneratorPackage.SPINNER_CON:
				sequence_SpinnerCon(context, (SpinnerCon) semanticObject); 
				return; 
			case AndroidGeneratorPackage.TARGET_SDK:
				sequence_TargetSDK(context, (TargetSDK) semanticObject); 
				return; 
			case AndroidGeneratorPackage.TEXT_VIEW:
				sequence_TextView(context, (TextView) semanticObject); 
				return; 
			case AndroidGeneratorPackage.TOAST:
				sequence_Toast(context, (Toast) semanticObject); 
				return; 
			case AndroidGeneratorPackage.TYPE_MAP:
				sequence_TypeMap(context, (TypeMap) semanticObject); 
				return; 
			case AndroidGeneratorPackage.TYPE_SETTING:
				sequence_TypeSetting(context, (TypeSetting) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AndroidAppProject returns AndroidAppProject
	 *
	 * Constraint:
	 *     applications+=Application+
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
	 *     ButtonActions returns Bundle
	 *     Bundle returns Bundle
	 *
	 * Constraint:
	 *     (bundleRecipient=[Fragment|ID] holder=Holder?)
	 */
	protected void sequence_Bundle(ISerializationContext context, Bundle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LayoutElement returns Button
	 *     Button returns Button
	 *
	 * Constraint:
	 *     (name=ID (actions+=ButtonActions actions+=ButtonActions*)?)
	 */
	protected void sequence_Button(ISerializationContext context, Button semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     LayoutElement returns EditText
	 *     Dataholders returns EditText
	 *     EditText returns EditText
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_EditText(ISerializationContext context, EditText semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AndroidGeneratorPackage.Literals.DATAHOLDERS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroidGeneratorPackage.Literals.DATAHOLDERS__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEditTextAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
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
		feeder.accept(grammarAccess.getFilterQueryAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFilterQueryAccess().getFilterAttributesFilterAttributesParserRuleCall_4_0(), semanticObject.getFilterAttributes());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FragmentLayoutAttributes returns FragmentLayoutAttributes
	 *
	 * Constraint:
	 *     (layoutElements+=LayoutElement layoutElements+=LayoutElement*)
	 */
	protected void sequence_FragmentLayoutAttributes(ISerializationContext context, FragmentLayoutAttributes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FragmentTypeAttributes returns FragmentTypeAttributes
	 *
	 * Constraint:
	 *     filter=FilterQuery
	 */
	protected void sequence_FragmentTypeAttributes(ISerializationContext context, FragmentTypeAttributes semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AndroidGeneratorPackage.Literals.FRAGMENT_TYPE_ATTRIBUTES__FILTER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroidGeneratorPackage.Literals.FRAGMENT_TYPE_ATTRIBUTES__FILTER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFragmentTypeAttributesAccess().getFilterFilterQueryParserRuleCall_0(), semanticObject.getFilter());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ApplicationElement returns Fragment
	 *     Fragment returns Fragment
	 *
	 * Constraint:
	 *     (name=ID fragmentAttributes+=FragmentLayoutAttributes?)
	 */
	protected void sequence_Fragment(ISerializationContext context, Fragment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Holder returns Holder
	 *
	 * Constraint:
	 *     (hol+=[Dataholders|ID] hol+=[Dataholders|ID]*)
	 */
	protected void sequence_Holder(ISerializationContext context, Holder semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     ApplicationElement returns Model
	 *     Model returns Model
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AndroidGeneratorPackage.Literals.APPLICATION_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroidGeneratorPackage.Literals.APPLICATION_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
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
	 *     SpinnerCon returns SpinnerCon
	 *
	 * Constraint:
	 *     text=STRING
	 */
	protected void sequence_SpinnerCon(ISerializationContext context, SpinnerCon semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AndroidGeneratorPackage.Literals.SPINNER_CON__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroidGeneratorPackage.Literals.SPINNER_CON__TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSpinnerConAccess().getTextSTRINGTerminalRuleCall_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LayoutElement returns Spinner
	 *     Dataholders returns Spinner
	 *     Spinner returns Spinner
	 *
	 * Constraint:
	 *     (name=ID (spinnercon+=SpinnerCon spinnercon+=SpinnerCon*)?)
	 */
	protected void sequence_Spinner(ISerializationContext context, Spinner semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     Dataholders returns TextView
	 *     TextView returns TextView
	 *
	 * Constraint:
	 *     (name=ID text=STRING)
	 */
	protected void sequence_TextView(ISerializationContext context, TextView semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AndroidGeneratorPackage.Literals.DATAHOLDERS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroidGeneratorPackage.Literals.DATAHOLDERS__NAME));
			if (transientValues.isValueTransient(semanticObject, AndroidGeneratorPackage.Literals.TEXT_VIEW__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroidGeneratorPackage.Literals.TEXT_VIEW__TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTextViewAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTextViewAccess().getTextSTRINGTerminalRuleCall_5_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ButtonActions returns Toast
	 *     Toast returns Toast
	 *
	 * Constraint:
	 *     text=STRING
	 */
	protected void sequence_Toast(ISerializationContext context, Toast semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AndroidGeneratorPackage.Literals.TOAST__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroidGeneratorPackage.Literals.TOAST__TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getToastAccess().getTextSTRINGTerminalRuleCall_2_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LayoutElement returns TypeMap
	 *     TypeMap returns TypeMap
	 *
	 * Constraint:
	 *     fragmenttypeattribute=FragmentTypeAttributes?
	 */
	protected void sequence_TypeMap(ISerializationContext context, TypeMap semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LayoutElement returns TypeSetting
	 *     TypeSetting returns TypeSetting
	 *
	 * Constraint:
	 *     {TypeSetting}
	 */
	protected void sequence_TypeSetting(ISerializationContext context, TypeSetting semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
