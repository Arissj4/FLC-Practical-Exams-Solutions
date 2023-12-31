
//----------------------------------------------------
// The following code was generated by CUP v0.11b beta 20140226
//----------------------------------------------------

import java_cup.runtime.*;
import java.util.*;
import java.io.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b beta 20140226 generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\027\000\002\002\004\000\002\002\007\000\002\003" +
    "\004\000\002\003\005\000\002\003\010\000\002\004\010" +
    "\000\002\004\007\000\002\005\010\000\002\005\024\000" +
    "\002\005\026\000\002\006\005\000\002\006\005\000\002" +
    "\006\002\000\002\007\005\000\002\007\005\000\002\010" +
    "\006\000\002\012\006\000\002\012\010\000\002\011\003" +
    "\000\002\014\010\000\002\014\011\000\002\013\004\000" +
    "\002\013\006" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\126\000\006\005\005\006\004\001\002\000\004\010" +
    "\120\001\002\000\004\010\113\001\002\000\004\002\112" +
    "\001\002\000\006\005\062\006\061\001\002\000\004\004" +
    "\011\001\002\000\004\014\014\001\002\000\004\014\014" +
    "\001\002\000\006\004\031\014\014\001\002\000\004\011" +
    "\015\001\002\000\004\017\016\001\002\000\004\014\026" +
    "\001\002\000\006\010\021\012\020\001\002\000\004\017" +
    "\022\001\002\000\006\004\ufff2\014\ufff2\001\002\000\004" +
    "\014\023\001\002\000\004\016\024\001\002\000\004\015" +
    "\025\001\002\000\006\010\ufff0\012\ufff0\001\002\000\004" +
    "\016\027\001\002\000\004\015\030\001\002\000\006\010" +
    "\ufff1\012\ufff1\001\002\000\004\014\036\001\002\000\004" +
    "\014\014\001\002\000\006\004\ufff3\014\ufff3\001\002\000" +
    "\004\002\000\001\002\000\006\002\uffef\014\051\001\002" +
    "\000\004\017\037\001\002\000\004\013\040\001\002\000" +
    "\004\011\041\001\002\000\004\014\043\001\002\000\006" +
    "\010\046\012\045\001\002\000\004\017\044\001\002\000" +
    "\006\010\uffec\012\uffec\001\002\000\004\014\047\001\002" +
    "\000\006\002\uffee\014\uffee\001\002\000\004\017\050\001" +
    "\002\000\006\010\uffeb\012\uffeb\001\002\000\004\017\052" +
    "\001\002\000\004\013\053\001\002\000\004\011\054\001" +
    "\002\000\004\014\043\001\002\000\006\010\056\012\045" +
    "\001\002\000\006\002\uffed\014\uffed\001\002\000\004\014" +
    "\014\001\002\000\006\004\ufff4\014\ufff4\001\002\000\004" +
    "\010\067\001\002\000\004\010\064\001\002\000\004\004" +
    "\uffff\001\002\000\004\005\065\001\002\000\004\010\066" +
    "\001\002\000\006\005\ufffb\006\ufffb\001\002\000\004\006" +
    "\070\001\002\000\004\010\071\001\002\000\004\006\072" +
    "\001\002\000\004\010\073\001\002\000\006\004\ufffa\006" +
    "\074\001\002\000\004\010\075\001\002\000\004\006\076" +
    "\001\002\000\004\010\077\001\002\000\004\006\100\001" +
    "\002\000\004\010\101\001\002\000\004\006\102\001\002" +
    "\000\004\010\103\001\002\000\004\006\104\001\002\000" +
    "\004\010\105\001\002\000\004\006\106\001\002\000\004" +
    "\010\107\001\002\000\006\004\ufff9\006\110\001\002\000" +
    "\004\010\111\001\002\000\004\004\ufff8\001\002\000\004" +
    "\002\001\001\002\000\004\005\114\001\002\000\004\010" +
    "\115\001\002\000\004\005\116\001\002\000\004\010\117" +
    "\001\002\000\006\005\ufffc\006\ufffc\001\002\000\012\004" +
    "\ufff5\005\ufff5\006\ufff5\007\ufff5\001\002\000\012\004\ufffe" +
    "\005\124\006\123\007\122\001\002\000\004\010\130\001" +
    "\002\000\004\010\126\001\002\000\004\010\125\001\002" +
    "\000\012\004\ufff7\005\ufff7\006\ufff7\007\ufff7\001\002\000" +
    "\010\004\ufff5\005\ufff5\007\ufff5\001\002\000\010\004\ufffd" +
    "\005\124\007\122\001\002\000\012\004\ufff6\005\ufff6\006" +
    "\ufff6\007\ufff6\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\126\000\010\002\005\003\007\004\006\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\005\062\001\001\000\002\001\001\000\006\007\012\010" +
    "\011\001\001\000\004\010\056\001\001\000\004\010\031" +
    "\001\001\000\002\001\001\000\004\012\016\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\011\033\014\034\001\001\000" +
    "\004\010\032\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\013\041\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\013" +
    "\054\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\010\057\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\006\120\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\006\126\001\001\000\002\001\001\000" +
    "\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {

    table = new HashMap <String, HashMap <String, Float>>();

 Tree = new DisegnaAlbero();   }public static DisegnaAlbero Tree;

  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 Symbol s=_scanner.next_token(); Tree.push(s.toString(), 0); return s;   }


    public HashMap <String, HashMap <String, Float>> table;

    public Object stack(int position){
        return (((Symbol)stack.elementAt(tos + position)).value);
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= prog EOF 
            { 
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // prog ::= header SEP dres_section SEP shop_section 
            { parser.Tree.reduce(5,"prog",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("prog",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // header ::= header1 header2 
            { parser.Tree.reduce(2,"header",1);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("header",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // header ::= TOK2 SC header3 
            { parser.Tree.reduce(3,"header",1);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("header",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // header ::= TOK2 SC header3 TOK2 SC header3 
            { parser.Tree.reduce(6,"header",1);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("header",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // header1 ::= TOK1 SC TOK1 SC TOK1 SC 
            { parser.Tree.reduce(6,"header1",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("header1",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // header1 ::= header1 TOK1 SC TOK1 SC 
            { parser.Tree.reduce(5,"header1",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("header1",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // header2 ::= TOK2 SC TOK2 SC TOK2 SC 
            { parser.Tree.reduce(6,"header2",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("header2",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // header2 ::= TOK2 SC TOK2 SC TOK2 SC TOK2 SC TOK2 SC TOK2 SC TOK2 SC TOK2 SC TOK2 SC 
            { parser.Tree.reduce(18,"header2",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("header2",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-17)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // header2 ::= TOK2 SC TOK2 SC TOK2 SC TOK2 SC TOK2 SC TOK2 SC TOK2 SC TOK2 SC TOK2 SC TOK2 SC 
            { parser.Tree.reduce(20,"header2",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("header2",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-19)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // header3 ::= header3 TOK1 SC 
            { parser.Tree.reduce(3,"header3",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("header3",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // header3 ::= header3 TOK3 SC 
            { parser.Tree.reduce(3,"header3",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("header3",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // header3 ::= 
            { parser.Tree.reduce(0,"header3",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("header3",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // dres_section ::= dresses dresses dresses 
            { parser.Tree.reduce(3,"dres_section",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dres_section",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // dres_section ::= dres_section dresses dresses 
            { parser.Tree.reduce(3,"dres_section",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dres_section",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // dresses ::= QSTRING DASH prod_lsit SC 
            { parser.Tree.reduce(4,"dresses",0);
              Object RESULT =null;
		int dresnameleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int dresnameright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String dresname = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int prolistleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int prolistright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		HashMap prolist = (HashMap)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
    parser.table.put(dresname, prolist);

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dresses",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // prod_lsit ::= INUM QSTRING FNUM EURO_WD 
            { parser.Tree.reduce(4,"prod_lsit",0);
              HashMap RESULT =null;
		int prodidleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int prodidright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Integer prodid = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int prodnameleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int prodnameright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String prodname = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int costleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int costright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Float cost = (Float)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
    HashMap tab = new HashMap<String, Float>();
    tab.put(prodname, cost);
    RESULT = tab;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("prod_lsit",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // prod_lsit ::= prod_lsit CM INUM QSTRING FNUM EURO_WD 
            { parser.Tree.reduce(6,"prod_lsit",0);
              HashMap RESULT =null;
		int tableft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int tabright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		HashMap tab = (HashMap)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int prodidleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int prodidright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Integer prodid = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int prodnameleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int prodnameright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String prodname = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int costleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int costright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Float cost = (Float)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
    tab.put(prodname, cost);
    RESULT = tab;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("prod_lsit",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // shop_section ::= purchasig 
            { parser.Tree.reduce(1,"shop_section",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("shop_section",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // purchasig ::= QSTRING INUM PAM DASH purch_prod SC 
            { parser.Tree.reduce(6,"purchasig",0);
              Object[] RESULT =null;
		int dresnameleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int dresnameright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		String dresname = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int percentleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int percentright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Integer percent = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int fpriceleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int fpriceright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object[] fprice = (Object[])((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
    System.out.println("TOTAL: " + fprice[1] + " euro " + "N_PROD: " + fprice[0]);

              CUP$parser$result = parser.getSymbolFactory().newSymbol("purchasig",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // purchasig ::= purchasig QSTRING INUM PAM DASH purch_prod SC 
            { parser.Tree.reduce(7,"purchasig",0);
              Object[] RESULT =null;
		int preleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).left;
		int preright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).right;
		Object[] pre = (Object[])((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-6)).value;
		int dresnameleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int dresnameright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		String dresname = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int percentleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int percentright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Integer percent = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int fpriceleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int fpriceright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object[] fprice = (Object[])((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
    System.out.println("TOTAL: " + fprice[1] + " euro " + "N_PROD: " + fprice[0]);

              CUP$parser$result = parser.getSymbolFactory().newSymbol("purchasig",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // purch_prod ::= QSTRING INUM 
            { parser.Tree.reduce(2,"purch_prod",0);
              Object[] RESULT =null;
		int prodnameleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int prodnameright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String prodname = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int quantityleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int quantityright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer quantity = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
    System.out.println((String)parser.stack(-5));
    HashMap dress = (HashMap)parser.table.get((String)parser.stack(-5));
    Float cost = (Float)dress.get(prodname);
    Integer pre = (Integer)parser.stack(-4);
    Float fin = cost * quantity * pre / 100;
    System.out.println(prodname + " " + fin + " euro");
    Object[] a = new Object[2];
    a[0] = quantity;
    a[1] = fin;
    RESULT = a;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("purch_prod",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // purch_prod ::= purch_prod CM QSTRING INUM 
            { parser.Tree.reduce(4,"purch_prod",0);
              Object[] RESULT =null;
		int priceleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int priceright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Object[] price = (Object[])((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int prodnameleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int prodnameright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String prodname = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int quantityleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int quantityright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer quantity = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
    HashMap dress = (HashMap)parser.table.get((String)parser.stack(-7));
    Float cost = (Float)dress.get(prodname);
    Integer pre = (Integer)parser.stack(-6);
    Float fin = cost * quantity * pre / 100;
    System.out.println(prodname + " " + fin + " euro");
    price[0] = (Integer)price[0] + quantity;
    price[1] = (Float)price[1] + fin;
    RESULT = price;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("purch_prod",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
