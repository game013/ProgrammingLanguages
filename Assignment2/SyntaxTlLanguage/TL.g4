grammar TL;

// Define palabras reservadas
WHILE: 'while';
FOR: 'for';
IF: 'if';
ELSE: 'else';
LOG: 'log';
FUNCION: 'funcion';
FALSE: 'false';
TRUE: 'true';
IMPORTAR: 'importar';
IN: 'in';
RETORNO: 'retorno';
END: 'end';
DESDE: 'desde';
TODO: 'todo';
LEER: 'leer';

// Define simbolos y operadores
TOKEN_LLAVE_IZQ: '{';
TOKEN_LLAVE_DER: '}';
TOKEN_COR_IZQ: '[';
TOKEN_COR_DER: ']';
TOKEN_PAR_IZQ: '(';
TOKEN_PAR_DER: ')';
TOKEN_MAYOR: '>';
TOKEN_MENOR: '<';
TOKEN_MAYOR_IGUAL: '>=';
TOKEN_MENOR_IGUAL: '<=';
TOKEN_IGUAL_NUM: '==';
TOKEN_POINT: '.';
TOKEN_DIFF_NUM: '!=';
TOKEN_AND: '&&';
TOKEN_OR: '||';
TOKEN_NOT: '!';
TOKEN_MAS: '+';
TOKEN_MENOS: '-';
TOKEN_MUL: '*';
TOKEN_DIV: '/';
TOKEN_MOD: '%';
TOKEN_POT: '^';
TOKEN_ASSIGN: '=';
TOKEN_COMA: ',';
TOKEN_DOSP: ':';

TOKEN_STRING: '"'.*?'"';
// Otra version TOKEN_STRING         :   '"' ( '\\' ('\\'|'\t'|'\r\n'|'\r'|'\n'|'"') | ~('\\'|'\t'|'\r'|'\n'|'"') )* '"';

COMMENTARIO: '#' .*? '\n' -> skip;
// Otra version	 '#' ~[\r\n]* -> skip;

ID: [a-zA-Z_][a-zA-Z0-9_]*;
TOKEN_INTEGER: [0-9]+;
TOKEN_FLOAT: [0-9]+'.'[0-9]+;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
BL : [ \r\n]+;

literal: TOKEN_STRING | numerical_literal;
numerical_literal: TOKEN_INTEGER | TOKEN_FLOAT;

// Syntactic rules
all: import_block* func_def* empty_main;

import_block: direct_import_style | from_import_style;
direct_import_style: IMPORTAR ' ' ID (TOKEN_POINT ID)*;
from_import_style: DESDE ' ' ID (TOKEN_POINT ID)* IMPORTAR ID;

empty_params: params | ;
params: param (TOKEN_COMA ' '* param)*;
param: ID | func_call | literal;

func_def: FUNCION ' ' ID TOKEN_PAR_IZQ empty_params TOKEN_PAR_DER empty_main RETORNO ' ' statement* END ' ' FUNCION;
empty_main: main | ;
main: statement+;
cond: cond_header elseif* else_block?;
cond_header: ((if_header TOKEN_LLAVE_IZQ empty_main TOKEN_LLAVE_DER) | (if_header main));
if_header: IF WS* TOKEN_PAR_IZQ bool TOKEN_PAR_DER;
elseif: ELSE ' ' cond_header;
else_block: ELSE ((TOKEN_LLAVE_IZQ empty_main TOKEN_LLAVE_DER) | (main));
bool: (binary_bool | unary_bool) ((TOKEN_AND | TOKEN_OR) (binary_bool | unary_bool))*;
binary_bool: statement (TOKEN_MENOR | TOKEN_MAYOR | TOKEN_MENOR_IGUAL | TOKEN_MAYOR_IGUAL | TOKEN_DIFF_NUM | TOKEN_IGUAL_NUM) statement;
unary_bool: TOKEN_NOT ID | ID;

expr: ID | literal | array_def (WS)*;
array_def: TOKEN_COR_IZQ (literal (TOKEN_COMA literal)*)? TOKEN_COR_DER;

statement: assignment | func_call | cond | math_operation;

assignment: ID TOKEN_ASSIGN expr;
func_call: ID TOKEN_PAR_IZQ params TOKEN_PAR_DER;
math_operation: basic_math_op
    | TOKEN_PAR_IZQ basic_math_op TOKEN_PAR_DER;
basic_math_op: numerical_literal | basic_math_op (TOKEN_MAS | TOKEN_MENOS | TOKEN_MUL | TOKEN_DIV | TOKEN_POT | TOKEN_MOD) numerical_literal;