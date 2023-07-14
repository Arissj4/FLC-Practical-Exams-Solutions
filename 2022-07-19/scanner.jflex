import java_cup.runtime.*;

%%

%unicode
%cup
%line
%column

%{
    private Symbol sym(int type){
        return new Symbol(type, yyline, yycolumn);
    }

    private Symbol sym(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
%}

nl          = \r | \n | \r\n
comment     = "(((-" ~ "-)))"
comment2    = "---" ~ {nl}

sep         = ("%%%%")("%%")*

//inum      = [1-9][0-9]*

//sinum       = ("-")?[0-9]+

fnum      = [0-9]+"."[0-9]+

//var       = [a-zA-Z_][a-zA-Z0-9_]*

//qstring   = \" ~ \"

//// TOKENS ////

token_1   = "A_" (
    ((1*01*01*) | (1*01*01*01*01*01*))
    |
    ( "*" | "+" | "*+" | "+*")*
)

token_2   = "B_" ({word} ("*" | "$" | "+") {word} ("*" | "$" | "+") {word} ("*" | "$" | "+") {word}) ( ("*" | "$" | "+") {word} ("*" | "$" | "+") {word})*

word = (
    "-" 3 [02]
    | "-" 2 [02468]
    | "-" 1 [02468]
    | "-" [2468]
    | 0
    | [2468]
    | [1-9] [2468]
    | [1-9] [1-9] [2468]
    | 1 [01] [0-9] [02468]
    | 12 [0-3] [02468]
    | 124 [0246]
)

//token_3   = 

%%

// Strings part
"START"            {return sym(sym.START_WD, new String(yytext()));}
"BATTERY"            {return sym(sym.BAT_WD, new String(yytext()));}
"FUEL"            {return sym(sym.FUE_WD, new String(yytext()));}
"kWh"            {return sym(sym.KWH_WD, new String(yytext()));}
"liters"            {return sym(sym.LIT_WD, new String(yytext()));}
"MAX"            {return sym(sym.MAX_WD, new String(yytext()));}
"PLUS"            {return sym(sym.PLUS_WD, new String(yytext()));}
"STAR"            {return sym(sym.STAR_WD, new String(yytext()));}
"MOD"            {return sym(sym.MOD_WD, new String(yytext()));}
"USE"            {return sym(sym.USE_WD, new String(yytext()));}
"DO"            {return sym(sym.DO_WD, new String(yytext()));}
"DONE"            {return sym(sym.DONE_WD, new String(yytext()));}
"km"            {return sym(sym.KM_WD, new String(yytext()));}
"units/km"            {return sym(sym.UKM_WD, new String(yytext()));}


// "?"             {return sym(sym.QUM);}
// "!"             {return sym(sym.EXM);}
// "@"             {return sym(sym.ATM);}
// "#"             {return sym(sym.HAM);}
// "$"             {return sym(sym.DOM);}
// "%"             {return sym(sym.PAM);}
// "^"             {return sym(sym.CIM);}
// "&"             {return sym(sym.AMM);}
// "*"             {return sym(sym.STAR);}
"-"             {return sym(sym.DASH);}
// "="             {return sym(sym.EQUAL);}
// "+"             {return sym(sym.PLUS);}
"("             {return sym(sym.OP);}
")"             {return sym(sym.CP);}
// "["             {return sym(sym.OB);}
// "]"             {return sym(sym.CB);}
// "{"             {return sym(sym.OC);}
// "}"             {return sym(sym.CC);}
// ">"             {return sym(sym.GT);}
// "<"             {return sym(sym.LT);}
// "/"             {return sym(sym.SLASH);}
// \\              {return sym(sym.BSLASH);}
// "."             {return sym(sym.DOT);}
// ":"             {return sym(sym.COLON);}
","             {return sym(sym.COMMA);}
";"                {return sym(sym.SCOLON);}
// \'              {return sym(sym.TQUO);}
// \"              {return sym(sym.DQUO);}
// \`              {return sym(sym.GRAVE);}
// "~"             {return sym(sym.TIL);}
// "|"             {return sym(sym.PIPE);}
// "_"             {return sym(sym.USCORE);}




// {inum}             {return sym(sym.INUM, new Integer(yytext()));}
// {sinum}            {return sym(sym.SINUM, new Integer(yytext()));}
{fnum}             {return sym(sym.FNUM, new Float(yytext()));}
// {qstring}          {return sym(sym.QSTRING, new String(yytext()));}
// {var}              {return sym(sym.VAR, new String(yytext()));}

{token_1}          {return sym(sym.TOK1);}
{token_2}          {return sym(sym.TOK2);}
// {token_3}          {return sym(sym.TOK3);}

//{var}              {return sym(sym.VAR, yytext());}

{sep}            {return sym(sym.SEP);}

{comment}          {;}
{comment2}          {;}

\r | \n | \r\n | " " | \t   {;}

.                   {System.out.println("Scanner Error: " + yytext());}