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

WS : [ \t\r] -> skip ; // skip spaces, tabs, newlines
BL : [\n];

// Syntactic rules
all: (statement | BL)* EOF;

statement: simple_statement | composed_statement;

simple_statement: import_block | assignment | log_invoke | method_invoke;
composed_statement: func_def | if_block | while_block | for_block;

import_block: regular_import | from_import;
regular_import: IMPORTAR ID (TOKEN_POINT ID)*;
from_import: DESDE ID (TOKEN_POINT ID)* IMPORTAR ID;

assignment: variable TOKEN_ASSIGN expr;
log_invoke: (LOG | LEER) TOKEN_PAR_IZQ expr TOKEN_PAR_DER;
method_invoke: ID TOKEN_PAR_IZQ (expr (TOKEN_COMA expr)*)? TOKEN_PAR_DER;

params: param (TOKEN_COMA param)*;
param: ID;
func_def: FUNCION ID TOKEN_PAR_IZQ params? TOKEN_PAR_DER (statement | BL)* RETORNO expr BL END;
if_header: IF TOKEN_PAR_IZQ bool TOKEN_PAR_DER BL?;
if_block: if_header block (elif_header block)* (ELSE block)?;
elif_header: ELSE if_header;

while_block: WHILE TOKEN_PAR_IZQ bool TOKEN_PAR_DER BL? block;
for_block: FOR ID IN expr BL? block;

block: TOKEN_LLAVE_IZQ (statement | BL)* TOKEN_LLAVE_DER
    | statement BL;

bool: (binary_bool | unary_bool) ((TOKEN_AND | TOKEN_OR) bool)?;
binary_bool: simple_expr (TOKEN_MENOR | TOKEN_MAYOR | TOKEN_MENOR_IGUAL | TOKEN_MAYOR_IGUAL | TOKEN_DIFF_NUM | TOKEN_IGUAL_NUM) simple_expr;
unary_bool: TOKEN_NOT simple_expr | simple_expr;
simple_expr: ID
    | TOKEN_STRING
    | (TRUE | FALSE)
    | (TOKEN_INTEGER | TOKEN_FLOAT)
    | array_def;
expr: bool
    | binary_oper
    | simple_expr
    | variable;

variable: ID (TOKEN_POINT ID)* (TOKEN_COR_IZQ expr TOKEN_COR_DER)?;
array_def: TOKEN_COR_IZQ (expr (TOKEN_COMA expr)*)? TOKEN_COR_DER;
binary_oper: simple_expr (TOKEN_MAS | TOKEN_MENOS | TOKEN_MUL | TOKEN_DIV | TOKEN_POT | TOKEN_MOD) expr;