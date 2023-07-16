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
comment     = "(*" ~ "*)"

sep         = ("####")

inum      = [1-9][0-9]*

//sinum       = ("-")?[0-9]+

fnum      = [0-9]+.[0-9][0-9]

//var       = [a-zA-Z_][a-zA-Z0-9_]*

qstring   = \" ~ \"

//// TOKENS ////

token_1   = "X-" {hour} (({word}{5})({word}{word})*)?

hour = (03 ":" 51 ":" (4[789] | 5[0-9])
    |03 ":" 5[2-9] ":" (0[0-9] | [1-5][0-9])
    |0[4-9] ":" (0[0-9] | [1-5][0-9]) ":" (0[0-9] | [1-5][0-9])
    |1[0-9] ":" (0[0-9] | [1-5][0-9]) ":" (0[0-9] | [1-5][0-9])
    |2[0-2] ":" (0[0-9] | [1-5][0-9]) ":" (0[0-9] | [1-5][0-9])
    |23 ":" (0[0-9] | [1-3][0-9]) ":" (0[0-9] | [1-5][0-9])
    |23 ":" 4[0-4] ":" (0[0-9] | [1-5][0-9])
    |23 ":" 45 ":" (0[0-9] | [12][0-9] | 3[0-4])
)

word = ("aa" | "ab" | "ba" | "bb")

token_2   = "Y-" ({binum}("-"{binum}){3} | {binum}("-"{binum}){5} | {binum}("-"{binum}){9})

binum = (101
    |111
    |1[01][01][01]
    |1[01][01][01][01]
    |1[01][01][01][01][01]
    |100[01][01][01][01]
    |101000[01]
)

//token_3   =

%%

// Strings part
 "euro/kg"            {return sym(sym.EK_WD, new String(yytext()));}
 "euro"            {return sym(sym.EURO_WD, new String(yytext()));}
 "kg"            {return sym(sym.KG_WD, new String(yytext()));}


// "?"             {return sym(sym.QUM);}
// "!"             {return sym(sym.EXM);}
// "@"             {return sym(sym.ATM);}
// "#"             {return sym(sym.HAM);}
// "$"             {return sym(sym.DOM);}
// "%"             {return sym(sym.PAM);}
// "^"             {return sym(sym.CIM);}
// "&"             {return sym(sym.AND);}
// "*"             {return sym(sym.STAR);}
// "-"             {return sym(sym.DASH);}
// "="             {return sym(sym.EQ);}
// "+"             {return sym(sym.PLUS);}
// "("             {return sym(sym.OP);}
// ")"             {return sym(sym.CP);}
// "["             {return sym(sym.OB);}
// "]"             {return sym(sym.CB);}
 "{"             {return sym(sym.OC);}
 "}"             {return sym(sym.CC);}
// ">"             {return sym(sym.GT);}
// "<"             {return sym(sym.LT);}
// "/"             {return sym(sym.SL);}
// \\              {return sym(sym.BSL);}
// "."             {return sym(sym.DOT);}
 ":"             {return sym(sym.CO);}
 ","             {return sym(sym.CM);}
";"             {return sym(sym.SC);}
// \'              {return sym(sym.QU);}
// \"              {return sym(sym.DQU);}
// \`              {return sym(sym.GRAVE);}
// "~"             {return sym(sym.TIL);}
// "|"             {return sym(sym.OR);}
// "_"             {return sym(sym.US);}




{inum}             {return sym(sym.INUM, new Integer(yytext()));}
// {sinum}            {return sym(sym.SINUM, new Integer(yytext()));}
 {fnum}             {return sym(sym.FNUM, new Float(yytext()));}
 {qstring}          {return sym(sym.QSTRING, new String(yytext()));}
// {var}              {return sym(sym.VAR, new String(yytext()));}

{token_1}          {return sym(sym.TOK1);}
{token_2}          {return sym(sym.TOK2);}
// {token_3}          {return sym(sym.TOK3);}

//{var}              {return sym(sym.VAR, yytext());}

{sep}            {return sym(sym.SEP);}

{comment}          {;}

\r | \n | \r\n | " " | \t   {;}

.                   {System.out.println("Scanner Error: " + yytext());}