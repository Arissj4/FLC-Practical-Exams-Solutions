/**************************
 Scanner
***************************/

import java_cup.runtime.*;

%%

%unicode
%cup
%line
%column

%{
	private Symbol sym(int type) {
		return new Symbol(type, yyline, yycolumn);
	}
	
	private Symbol sym(int type, Object value) {
		return new Symbol(type, yyline, yycolumn, value);
	}
	
%}
 
// space = \s
nl = \r|\n|\r\n 

sep = ("####") ("##")*
comment = ("\/\/" ~ {nl})

token_1 = (("%%%%%") ("%%")* | ("**"|"???"){2} | ("**"|"???"){3}) ( ( ("-"(1|3|5|7|9)) | ("-"[1-2] ((1|3|5|7|9)) | ("-" 3 ((1|3|5)) ) ) ) | ( ((1|3|5|7|9)) | ([1-9] (1|3|5|7|9)) | ( (1|2|3) (1|2|3) (1|2|3) ) ) )?

token_2 = {date}("-"|"+"){date}

date    = 2015 "/" 12 "/" (1[2-9] | 2[0-9] | 30)
         |2016 "/" 01 "/" (0[1-46-9] | [12][0-9] | 3[01])
         |2016 "/" 02 "/" (0[1-9] | 1[0-9] | 2[0-9])
         |2016 "/" 03 "/" (0[1-9] | 1[0-3])

// date1 = ( (2015 "/" 12 "/" ( (1 [2-9]) | (2 [0-9]) | (30) ) ) | (2016 "/" ( 01 ) "/" ( (0 [1-9]) | (1 [0-9]) | (2 [0-9] | 30) ) ) | (2016 "/" 02 "/" ( (0 [1-9]) | (1 [0-9]) | (2 [0-9]) ) ) | (2016 "/" 03 "/" ( (0 [1-9]) | (1 [0-3]) ) ) ) 

// date2 = ( (2015 "/" 12 "/" ( (1 [2-9]) | (2 [0-9]) | (30) ) ) | (2016 "/" ( 01 ) "/" ( (0 [1-9]) | (1 [0-9]) | (2 [0-9] | 30) ) ) | (2016 "/" 02 "/" ( (0 [1-9]) | (1 [0-9]) | (2 [0-9]) ) ) | (2016 "/" 03 "/" ( (0 [1-9]) | (1 [0-3]) ) ) ) 

token_3 = ("$" ( (101) | (11[0-1]) | (1[0-1][0-1][0-1]) | (1[0-1][0-1][0-1][0-1]) | ((100 [0-1] [0-1] [0-1]) | (101000) ) ) )

// fnum        = [0-9]+.[0-9]+
inum        = [0-9]+
// var			= [a-zA-Z_][a-zA-Z0-9_]*


q_string    = \" ~ \"

%%



// "TRUE"    	{ return sym(sym.TRUE); }
// "FALSE"    	{ return sym(sym.FALSE);}
// "IF"    	{ return sym(sym.IF);}
// "OR"    	{ return sym(sym.ORR); }
// "DO"    	{ return sym(sym.DO); }
// "AND"    	{ return sym(sym.ANDD); }
// "PRINT"    	{ return sym(sym.PRINT); }
// "DONE"    	{ return sym(sym.DONE); }
// "FI"    	{ return sym(sym.FI); }


"m/s"               { return sym(sym.MS_WD, new String(yytext()));}
"PRINT_MIN_MAX"    	{ return sym(sym.PRINTMM, new String(yytext()));}
"->"                { return sym(sym.ARR, new String(yytext()));}
"PART"              { return sym(sym.PART, new String(yytext()));}
"m"                 { return sym(sym.M_WD, new String(yytext()));}

";" 				{ return sym(sym.S); }
":" 				{ return sym(sym.COL); }
"," 				{ return sym(sym.CM); }
"=" 				{ return sym(sym.EQ); }
// "+" 				{ return sym(sym.PL); }
// "-" 				{ return sym(sym.MIN);}
// "*"			    { return sym(sym.ST);}
// "&" 				{ return sym(sym.AND); }
"|" 				{ return sym(sym.OR); }
// "!" 				{ return sym(sym.NOT); }
// ">" 				{ return sym(sym.GT); }
"(" 				{ return sym(sym.OP); }
")" 				{ return sym(sym.CP); }
"{" 				{ return sym(sym.OT); }
"}" 				{ return sym(sym.CT); }
// "[" 				{ return sym(sym.OB); }
// "]" 				{ return sym(sym.CB); }


{token_1}			{ return sym(sym.TOK1);}
{token_2}			{ return sym(sym.TOK2);}
{token_3}			{ return sym(sym.TOK3);}


{inum}			    { return sym(sym.INUM, new Integer(yytext()));}
// {fnum}			{ return sym(sym.FNUM, new Float(yytext()));}
// {var}			{ return sym(sym.VAR, yytext());}

{q_string}			{ return sym(sym.QSTRING, new String(yytext()));}

{sep}				{ return sym(sym.SEP);}


// {space} {;}
// {nl} {;}
{comment}	 		{;}
// {sec_comment}	 		{;}

\r | \n | \r\n | " " | \t	{;}

.				{ System.out.println("Scanner Error: " + yytext()); }
