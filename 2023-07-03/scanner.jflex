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

//nl          = \r | \n | \r\n
comment     = "<*" ~ "*>"

sep         = (\$\$\$)(\$\$)*

inum      = [1-9][0-9]*

//sinum       = ("-")?[0-9]+

//fnum      = [0-9]+.[0-9]+

//var       = [a-zA-Z_][a-zA-Z0-9_]*

qstring   = \" ~ \"

//// TOKENS ////

token_1   = ( (("!!!!" ("!!")*) | ("?????") ("??")*) ("-" [2468]|"-" 1[02468]|[02468]|[1-9][02468]|1[0-9][02468]|2[0-7][02468]|28[0246]))

token_2   = ( 0[2-9] "/" 07 "/" 2023
    | [12][0-9] "/" 07 "/" 2023
    | 3[01] "/" 07 "/" 2023
    | 0[1-9] "/" 08 "/" 2023
    | [12][0-9] "/" 08 "/" 2023
    | 3[01] "/" 08 "/" 2023
    | 0[1-9] "/" 09 "/" 2023
    | [12][0-9] "/" 09 "/" 2023
    | 30 "/" 09 "/" 2023
    | 0[1-6] "/" 10 "/" 2023
)
| 
( 2023 "/" 07 "/" 0[2-9]
    | 2023 "/" 07 "/" [12][0-9]
    | 2023 "/" 07 "/" 3[01]
    | 2023 "/" 08 "/" 0[1-9] 
    | 2023 "/" 08 "/" [12][0-9]
    | 2023 "/" 08 "/" 3[01]
    | 2023 "/" 09 "/" 0[1-9]
    | 2023 "/" 09 "/" [12][0-9]
    | 2023 "/" 09 "/" 30
    | 2023 "/" 10 "/" 0[1-6]
)

token_3   = ( 07 ":" 3[7-9] ":" 19
    | 07 ":" [45][0-9] ":" [2-5][0-9]
    | 0[89] ":" 0[1-9] ":" (0[1-9] | [1-5][0-9])
    | 0[89] ":" [1-5][0-9] ":" (0[1-9] | [1-5][0-9])
    | 1[0-9] ":" 0[1-9] ":" (0[1-9] | [1-5][0-9])
    | 1[0-9] ":" [1-5][0-9] ":" (0[1-9] | [1-5][0-9])
    | 2[0-2] ":" 0[1-9] ":" (0[1-9] | [1-5][0-9])
    | 2[0-2] ":" [12][0-9] ":" (0[1-9] | [1-5][0-9])
    | 2[0-2] ":" 3[0-7] ":" 0[1-9]
    | 2[0-2] ":" 3[0-7] ":" 1[0-9]
    | 2[0-2] ":" 3[0-7] ":" 2[0123]
)
|
( 07 ":" 3[7-9]
    | 07 ":" [45][0-9]
    | 0[89] ":" 0[1-9]
    | 0[89] ":" [1-5][0-9]
    | 1[0-9] ":" 0[1-9]
    | 1[0-9] ":" [1-5][0-9]
    | 2[0-2] ":" 0[1-9]
    | 2[0-2] ":" [12][0-9]
    | 2[0-2] ":" 3[0-7]
    | 2[0-2] ":" 3[0-7]
    | 2[0-2] ":" 3[0-7]
)

%%

// Strings part
"house"            {return sym(sym.HOUSE_WD, new String(yytext()));}
"start"            {return sym(sym.START_WD, new String(yytext()));}
"end"            {return sym(sym.END_WD, new String(yytext()));}
"if"            {return sym(sym.IF_WD, new String(yytext()));}
"then"            {return sym(sym.THEN_WD, new String(yytext()));}
"fi"            {return sym(sym.FI_WD, new String(yytext()));}
"and"            {return sym(sym.AND_WD, new String(yytext()));}
"or"            {return sym(sym.OR_WD, new String(yytext()));}
"not"            {return sym(sym.NOT_WD, new String(yytext()));}
"print"            {return sym(sym.PRINT_WD, new String(yytext()));}



// "?"             {return sym(sym.QUM);}
//"!"             {return sym(sym.NOT);}
// "@"             {return sym(sym.ATM);}
// "#"             {return sym(sym.HAM);}
// "$"             {return sym(sym.DOM);}
// "%"             {return sym(sym.PAM);}
// "^"             {return sym(sym.CIM);}
//"&"             {return sym(sym.AND);}
// "*"             {return sym(sym.STAR);}
// "-"             {return sym(sym.DASH);}
 "="             {return sym(sym.EQ);}
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
"."             {return sym(sym.DOT);}
// ":"             {return sym(sym.COLON);}
","             {return sym(sym.COMMA);}
";"             {return sym(sym.SCOLON);}
// \'              {return sym(sym.TQUO);}
// \"              {return sym(sym.DQUO);}
// \`              {return sym(sym.GRAVE);}
// "~"             {return sym(sym.TIL);}
//"|"             {return sym(sym.OR);}
// "_"             {return sym(sym.USCORE);}




 {inum}             {return sym(sym.INUM, new Integer(yytext()));}
// {sinum}            {return sym(sym.SINUM, new Integer(yytext()));}
// {fnum}             {return sym(sym.FNUM, new Float(yytext()));}
{qstring}          {return sym(sym.QSTRING, new String(yytext()));}
// {var}              {return sym(sym.VAR, new String(yytext()));}

{token_1}          {return sym(sym.TOK1);}
{token_2}          {return sym(sym.TOK2);}
{token_3}          {return sym(sym.TOK3);}

//{var}              {return sym(sym.VAR, yytext());}

{sep}            {return sym(sym.SEP);}

{comment}          {;}

\r | \n | \r\n | " " | \t   {;}

.                   {System.out.println("Scanner Error: " + yytext());}