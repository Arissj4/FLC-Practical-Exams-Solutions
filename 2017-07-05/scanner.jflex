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

comment     = "%" ~ {nl}

sep         = "$$"

inum        = [0-9]+
sinum       = ("-")?[0-9]+

//fnum      = [0-9]+.[0-9]+

var    = [a-zA-Z][a-zA-Z]*

//qstring   = \" ~ \"

//// TOKENS ////

token_1   = ("-"1[0-2][024]
            |"-"[1-9][02468]
            |"-"[02468]
            |[02468]
            |[1-7][02468]
            |8[0246])
            (
                ([a-z]{5})(([a-z]){2} "ABC")*
                |
                (( ("XX" | "XY" | "YX" | "YY"){3} ("XX" | "XY" | "YX" | "YY")* ) )
            )?

token_2   = (({word}("*" | "-")){5}) ({word}("*" | "-"){word})*

word      = ((1[0-1])
            |(1 [0-1] [0-1])
            |(1 [0-1] [0-1] [0-1])
            |(10 [0-1] [0-1] [0-1])
            |(110 [0-1] [0-1])
            |(1110 [0-1])
            |(11110))

token_3   = ( 08 ":" (1[2-9] | [2-5][0-9]) ":" (3[4-9] | [4-5][0-9])
            |09 ":" ([0-5] [0-9]) ":" ([0-5] [0-9])
            |1[0-6] ":" ([0-5] [0-9]) ":" ([0-5] [0-9])
            |17 ":" (([01][0-9] | 2[0-1])) ":" ([0-2][0-9] | 3[0-7])
            )

%%

// Strings part
"set"              {return sym(sym.SET_WD, new String(yytext()));}
"position"         {return sym(sym.POS_WD, new String(yytext()));}
"fuel"             {return sym(sym.FUE_WD, new String(yytext()));}
"declare"          {return sym(sym.DEC_WD, new String(yytext()));}
"else"             {return sym(sym.ELS_WD, new String(yytext()));}
"and"              {return sym(sym.AND_WD, new String(yytext()));}
"or"               {return sym(sym.OR_WD, new String(yytext()));}
"not"              {return sym(sym.NOT_WD, new String(yytext()));}
"increases"        {return sym(sym.INC_WD, new String(yytext()));}
"decreases"        {return sym(sym.DECR_WD, new String(yytext()));}
"max"              {return sym(sym.MAX_WD, new String(yytext()));}
"min"              {return sym(sym.MIN_WD, new String(yytext()));}
"mv"               {return sym(sym.MV_WD, new String(yytext()));}


"?"                {return sym(sym.QUM);}
// "!"             {return sym(sym.EXM);}
// "@"             {return sym(sym.ATM);}
// "#"             {return sym(sym.HAM);}
// "$"             {return sym(sym.DOM);}
// "%"             {return sym(sym.PAM);}
// "^"             {return sym(sym.CIM);}
// "&"             {return sym(sym.AMM);}
// "*"             {return sym(sym.STAR);}
"-"                {return sym(sym.DASH);}
"="                {return sym(sym.EQ);}
// "+"             {return sym(sym.PLUS);}
"("                {return sym(sym.OP);}
")"                {return sym(sym.CP);}
// "["             {return sym(sym.OB);}
// "]"             {return sym(sym.CB);}
"{"                {return sym(sym.OC);}
"}"                {return sym(sym.CC);}
// ">"             {return sym(sym.GT);}
// "<"             {return sym(sym.LT);}
// "/"             {return sym(sym.SLASH);}
// \\              {return sym(sym.BSLASH);}
"."                {return sym(sym.DOT);}
":"                {return sym(sym.COLON);}
","                {return sym(sym.COMMA);}
";"                {return sym(sym.SCOLON);}
// \'              {return sym(sym.TQUO);}
// \"              {return sym(sym.DQUO);}
// \`              {return sym(sym.GRAVE);}
// "~"             {return sym(sym.TIL);}
// "|"             {return sym(sym.PIPE);}
// "_"             {return sym(sym.USCORE);}

//{inum}             {return sym(sym.INUM, new Integer(yytext()));}
{sinum}            {return sym(sym.SINUM, new Integer(yytext()));}
// {fnum}             {return sym(sym.FNUM, new Float(yytext()));}
// {qstring}          {return sym(sym.QSTRING, new String(yytext()));}
{var}              {return sym(sym.VAR, new String(yytext()));}


{token_1}          {return sym(sym.TOK1);}
{token_2}          {return sym(sym.TOK2);}
{token_3}          {return sym(sym.TOK3);}

{sep}            {return sym(sym.SEP);}



{comment}          {;}

\r | \n | \r\n | " " | \t   {;}

.                   {System.out.println("Scanner Error: " + yytext());}

// System.out.println(yytext());
