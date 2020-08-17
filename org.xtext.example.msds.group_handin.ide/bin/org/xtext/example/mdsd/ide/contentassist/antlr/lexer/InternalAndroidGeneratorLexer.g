/*
 * generated by Xtext 2.21.0
 */
lexer grammar InternalAndroidGeneratorLexer;

@header {
package org.xtext.example.mdsd.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

AndroidSDK : 'Android-SDK';

FilterQuery : 'FilterQuery';

MinimumSDK : 'Minimum-SDK';

Permissions : 'permissions';

TargetSDK : 'Target-SDK';

Distance : 'Distance';

EditText : 'EditText';

Fragment : 'Fragment';

Settings : 'Settings';

Textview : 'Textview';

Elements : 'elements';

Content : 'Content';

Spinner : 'Spinner';

Content_1 : 'content';

Bundle : 'Bundle';

Button : 'Button';

Holder : 'Holder';

Model : 'Model';

Toast : 'Toast';

App : 'App';

Map : 'Map';

Comma : ',';

Colon : ':';

LessThanSign : '<';

EqualsSign : '=';

GreaterThanSign : '>';

F : 'f';

M : 'm';

RULE_PACKAGE_NAME : '"' RULE_ID ('.' RULE_ID)* '"';

fragment RULE_BEGIN : ;

fragment RULE_END : ;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
