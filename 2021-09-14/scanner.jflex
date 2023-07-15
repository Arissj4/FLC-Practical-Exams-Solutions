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
comment     = "+--" ~ "--+"

sep         = ("====")

inum      = [1-9][0-9]*

//sinum       = ("-")?[0-9]+

//fnum      = [0-9]+.[0-9]+

//var       = [a-zA-Z_][a-zA-Z0-9_]*

//qstring   = \" ~ \"

//// TOKENS ////

token_1   = "I_" {date} (":" {time})?

date = (
    (0[3-9] | [12][0-9] | 30) "/" 09 "/" 2021
    |(0[1-9] | [12][0-9] | 3[0-1]) "/" (10 | 12) "/" 2021
    |(0[1-9] | [12][0-9] | 30) "/" 11 "/" 2021
    |(0[1-9] | [12][0-9] | 3[0-1]) "/" 01 "/" 2022
    |(0[1-9] | 1[0-9] | 2[0-8]) "/" 02 "/" 2022
    |0[1-5] "/" 03 "/" 2022
)

time = (0[8-9] ":" (0[0-9] | [1-5][0-9])
    |1[0-6] ":" (0[0-9] | [1-5][0-9])
    |17 ":" (0[0-9] | [12][0-9] | 3[0-5])
)


token_2   = "J_" (({num}("+"|"-"|"*")){5}{num})(("+"|"-"|"*"){num}("+"|"-"|"*"){num})*

num = (3[b-fA-F]
    |[1-9a-fA-F][0-9a-fA-F]
    |[1-9][0-9a-fA-F][0-9a-fA-F]
    |[aA][a-dA-D][0-9a-fA-F]
    |[aA][eE][0-3]
)

token_3   = "K_" ([a-z]){5} ([a-z]{2})* (("00"|"11"|"10"|"01"){3}("00"|"11"|"10"|"01")*)?

%%

// Strings part
"INIT"            {return sym(sym.INIT_WD, new String(yytext()));}
"HEIGHT"            {return sym(sym.HEIGHT_WD, new String(yytext()));}
"SPEED"            {return sym(sym.SPEED_WD, new String(yytext()));}
"SUM"            {return sym(sym.SUM_WD, new String(yytext()));}
"MUL"            {return sym(sym.MUL_WD, new String(yytext()));}
"COND"            {return sym(sym.COND_WD, new String(yytext()));}
"UPDATE"            {return sym(sym.UPDATE_WD, new String(yytext()));}
"DONE"            {return sym(sym.DONE_WD, new String(yytext()));}


// "?"             {return sym(sym.QUM);}
// "!"             {return sym(sym.EXM);}
// "@"             {return sym(sym.ATM);}
// "#"             {return sym(sym.HAM);}
// "$"             {return sym(sym.DOM);}
// "%"             {return sym(sym.PAM);}
// "^"             {return sym(sym.CIM);}
// "&"             {return sym(sym.AMM);}
// "*"             {return sym(sym.STAR);}
// "-"             {return sym(sym.DASH);}
 "="             {return sym(sym.EQ);}
// "+"             {return sym(sym.PLUS);}
// "("             {return sym(sym.OP);}
// ")"             {return sym(sym.CP);}
"["             {return sym(sym.OB);}
"]"             {return sym(sym.CB);}
// "{"             {return sym(sym.OC);}
// "}"             {return sym(sym.CC);}
">"             {return sym(sym.GT);}
// "<"             {return sym(sym.LT);}
// "/"             {return sym(sym.SLASH);}
// \\              {return sym(sym.BSLASH);}
// "."             {return sym(sym.DOT);}
// ":"             {return sym(sym.COLON);}
 ","             {return sym(sym.CM);}
";"             {return sym(sym.SC);}
// \'              {return sym(sym.TQUO);}
// \"              {return sym(sym.DQUO);}
// \`              {return sym(sym.GRAVE);}
// "~"             {return sym(sym.TIL);}
// "|"             {return sym(sym.PIPE);}
// "_"             {return sym(sym.USCORE);}




{inum}             {return sym(sym.INUM, new Integer(yytext()));}
// {sinum}            {return sym(sym.SINUM, new Integer(yytext()));}
// {fnum}             {return sym(sym.FNUM, new Float(yytext()));}
// {qstring}          {return sym(sym.QSTRING, new String(yytext()));}
// {var}              {return sym(sym.VAR, new String(yytext()));}

 {token_1}          {return sym(sym.TOK1);}
 {token_2}          {return sym(sym.TOK2);}
 {token_3}          {return sym(sym.TOK3);}

//{var}              {return sym(sym.VAR, yytext());}

{sep}            {return sym(sym.SEP);}

{comment}          {;}

\r | \n | \r\n | " " | \t   {;}

.                   {System.out.println("Scanner Error: " + yytext());}
