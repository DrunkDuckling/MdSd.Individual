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

Permissions : 'Permissions';

TargetSDK : 'Target-SDK';

EditText : 'EditText';

Elements : 'Elements';

Fragment : 'Fragment';

Settings : 'Settings';

Textview : 'Textview';

Content : 'Content';

MinSDK : 'Min-SDK';

Spinner : 'Spinner';

Bundle : 'Bundle';

Button : 'Button';

Holder : 'Holder';

Model : 'Model';

Toast : 'Toast';

Dist : 'Dist';

App : 'App';

Map : 'Map';

Comma : ',';

Colon : ':';

LessThanSign : '<';

EqualsSign : '=';

GreaterThanSign : '>';

F : 'f';

M : 'm';

fragment RULE_BEGIN : ;

fragment RULE_END : ;

RULE_PACKAGE_NAME : '"' RULE_ID ('.' RULE_ID)* '"';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
