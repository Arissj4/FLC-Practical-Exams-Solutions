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
comment     = "[[--" ~ "--]]"

sep         = "===="

//inum      = [1-9][0-9]*

//sinum       = ("-")?[0-9]+

//fnum      = [0-9]+.[0-9]+

var       = [a-zA-Z_][a-zA-Z0-9_]*

qstring   = \" ~ \"

//// TOKENS ////

token_1   = (("D-" {date}) ("-"{date})?)

date = ( (0[4-9] | [12][0-9] | 3[01]) \/ "July" \/ 2022
        | (0[1-9] | [12] [0-9] | 30) \/ ("August"|"October"|"December") \/ 2022
        | (0[1-9] | [12] [0-9] | 30) \/ ("September"|"November") \/ 2022
        | (0[1-9] | 1[0-5]) \/ "January" \/ 2023
)

token_2   = ("R-" ({word}){4,15}) ("????" ("?")*)?

word = ("XX" | "YY" | "ZZ")

token_3   =  "N-" ({binum}("+" | "/" | "*"){binum}("+" | "/" | "*"){binum}("+" | "/" | "*"){binum}("+" | "/" | "*"){binum}) (("+" | "/" | "*"){binum}("+" | "/" | "*"){binum})*

binum = 2[A-Fa-f]
| [1-9] [1-9A-Fa-f]
| [A-Fa-f] [a-fA-F0-9]
| [1-9Aa] [a-fA-F0-9] [a-fA-F0-9]
| [1-9Bb] [0-9A-Ca-c] [1-3]

%%

// Strings part
"TRUE"            {return sym(sym.TURE_WD, new String(yytext()));}
 "FALSE"            {return sym(sym.FALSE_WD, new String(yytext()));}
 "IF"            {return sym(sym.IF_WD, new String(yytext()));}
 "FI"            {return sym(sym.FI_WD, new String(yytext()));}
 "OR"            {return sym(sym.OR_WD, new String(yytext()));}
 "AND"            {return sym(sym.AND_WD, new String(yytext()));}
 "DO"            {return sym(sym.DO_WD, new String(yytext()));}
 "DONE"            {return sym(sym.DONE_WD, new String(yytext()));}
 "PRINT"            {return sym(sym.PRINT_WD, new String(yytext()));}


// "?"             {return sym(sym.QUM);}
 "!"             {return sym(sym.NOT, new String(yytext()));}
// "@"             {return sym(sym.ATM);}
// "#"             {return sym(sym.HAM);}
// "$"             {return sym(sym.DOM);}
// "%"             {return sym(sym.PAM);}
// "^"             {return sym(sym.CIM);}
 "&"             {return sym(sym.AND, new String(yytext()));}
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
// "."             {return sym(sym.DOT);}
// ":"             {return sym(sym.COLON);}
// ","             {return sym(sym.COMMA);}
";"             {return sym(sym.SCOLON);}
// \'              {return sym(sym.TQUO);}
// \"              {return sym(sym.DQUO);}
// \`              {return sym(sym.GRAVE);}
// "~"             {return sym(sym.TIL);}
 "|"             {return sym(sym.OR, new String(yytext()));}
// "_"             {return sym(sym.USCORE);}




// {inum}             {return sym(sym.INUM, new Integer(yytext()));}
// {sinum}            {return sym(sym.SINUM, new Integer(yytext()));}
// {fnum}             {return sym(sym.FNUM, new Float(yytext()));}
 {qstring}          {return sym(sym.QSTRING, new String(yytext()));}

{token_1}          {return sym(sym.TOK1);}
{token_2}          {return sym(sym.TOK2);}
{token_3}          {return sym(sym.TOK3);}

{var}              {return sym(sym.VAR, yytext());}

{sep}            {return sym(sym.SEP);}

{comment}          {;}

\r | \n | \r\n | " " | \t   {;}

.                   {System.out.println("Scanner Error: " + yytext());}