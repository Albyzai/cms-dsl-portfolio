/*
 * generated by Xtext 2.22.0
 */
lexer grammar InternalCMSdslLexer;

@header {
package jope015.mdsd2021.reexam.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

Database : 'database';

Hostname : 'hostname';

Password : 'password';

Username : 'username';

Default : 'default';

Dialect : 'dialect';

Library : 'library';

Project : 'project';

Service : 'service';

Entity : 'entity';

String : 'string';

Float : 'float';

Bool : 'bool';

Date : 'date';

Long : 'long';

Port : 'port';

Test : 'test';

Int : 'int';

Ui : 'ui';

Colon : ':';

fragment RULE_BEGIN : ;

fragment RULE_END : ;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;