
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
    "\000\026\000\002\002\004\000\002\002\007\000\002\003" +
    "\011\000\002\003\011\000\002\004\005\000\002\004\002" +
    "\000\002\005\004\000\002\005\005\000\002\006\007\000" +
    "\002\011\004\000\002\011\006\000\002\007\004\000\002" +
    "\007\002\000\002\010\007\000\002\013\003\000\002\013" +
    "\004\000\002\013\005\000\002\013\005\000\002\013\005" +
    "\000\002\012\010\000\002\014\005\000\002\014\006" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\101\000\010\005\ufffc\006\ufffc\007\ufffc\001\002\000" +
    "\004\002\103\001\002\000\010\005\067\006\066\007\065" +
    "\001\002\000\004\004\007\001\002\000\004\016\012\001" +
    "\002\000\006\004\025\016\012\001\002\000\004\016\012" +
    "\001\002\000\004\017\013\001\002\000\004\020\014\001" +
    "\002\000\004\017\016\001\002\000\006\011\020\021\021" +
    "\001\002\000\004\031\017\001\002\000\006\011\ufff8\021" +
    "\ufff8\001\002\000\004\017\022\001\002\000\006\004\ufff9" +
    "\016\ufff9\001\002\000\004\031\023\001\002\000\006\011" +
    "\ufff7\021\ufff7\001\002\000\006\004\ufffb\016\ufffb\001\002" +
    "\000\006\002\ufff5\022\ufff5\001\002\000\004\016\012\001" +
    "\002\000\006\004\ufffa\016\ufffa\001\002\000\006\002\000" +
    "\022\032\001\002\000\006\002\ufff6\022\ufff6\001\002\000" +
    "\010\012\033\017\037\027\036\001\002\000\010\012\033" +
    "\017\037\027\036\001\002\000\010\023\052\025\046\026" +
    "\047\001\002\000\012\013\ufff3\023\ufff3\025\ufff3\026\ufff3" +
    "\001\002\000\010\012\033\017\037\027\036\001\002\000" +
    "\004\015\040\001\002\000\004\017\041\001\002\000\004" +
    "\014\042\001\002\000\004\014\043\001\002\000\004\031" +
    "\044\001\002\000\012\013\uffee\023\uffee\025\uffee\026\uffee" +
    "\001\002\000\012\013\ufff2\023\ufff2\025\ufff2\026\ufff2\001" +
    "\002\000\010\012\033\017\037\027\036\001\002\000\010" +
    "\012\033\017\037\027\036\001\002\000\012\013\ufff0\023" +
    "\ufff0\025\046\026\ufff0\001\002\000\012\013\ufff1\023\ufff1" +
    "\025\ufff1\026\ufff1\001\002\000\004\030\054\001\002\000" +
    "\006\024\057\030\060\001\002\000\004\017\055\001\002" +
    "\000\004\010\056\001\002\000\006\024\uffed\030\uffed\001" +
    "\002\000\006\002\ufff4\022\ufff4\001\002\000\004\017\061" +
    "\001\002\000\004\010\062\001\002\000\006\024\uffec\030" +
    "\uffec\001\002\000\010\013\064\025\046\026\047\001\002" +
    "\000\012\013\uffef\023\uffef\025\uffef\026\uffef\001\002\000" +
    "\004\010\102\001\002\000\004\010\075\001\002\000\004" +
    "\010\070\001\002\000\006\006\ufffc\007\ufffc\001\002\000" +
    "\006\006\072\007\065\001\002\000\004\010\073\001\002" +
    "\000\006\004\ufffc\007\ufffc\001\002\000\006\004\uffff\007" +
    "\065\001\002\000\006\005\ufffc\007\ufffc\001\002\000\006" +
    "\005\077\007\065\001\002\000\004\010\100\001\002\000" +
    "\006\004\ufffc\007\ufffc\001\002\000\006\004\ufffe\007\065" +
    "\001\002\000\012\004\ufffd\005\ufffd\006\ufffd\007\ufffd\001" +
    "\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\101\000\010\002\003\003\005\004\004\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\005\007\006\010\001\001\000\004\006\025\001\001\000" +
    "\004\006\023\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\011\014\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\007\027\001\001\000\004\006\026\001\001\000\002" +
    "\001\001\000\004\010\030\001\001\000\002\001\001\000" +
    "\006\012\034\013\033\001\001\000\006\012\034\013\062" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\012" +
    "\034\013\044\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\012\034\013\050" +
    "\001\001\000\006\012\034\013\047\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\014\052\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\004\070\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\004\073\001\001\000\002\001\001\000\004\004\075" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\004" +
    "\100\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001" });

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

    table = new HashMap <String, HashMap <String, Integer>>();

 Tree = new DisegnaAlbero();   }public static DisegnaAlbero Tree;

  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 Symbol s=_scanner.next_token(); Tree.push(s.toString(), 0); return s;   }


    public HashMap <String, HashMap <String, Integer>> table;

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
          case 1: // prog ::= header SEP house_section SEP pre_section 
            { parser.Tree.reduce(5,"prog",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("prog",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // header ::= header1 TOK1 SCOLON header1 TOK2 SCOLON header1 
            { parser.Tree.reduce(7,"header",1);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("header",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // header ::= header1 TOK2 SCOLON header1 TOK1 SCOLON header1 
            { parser.Tree.reduce(7,"header",1);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("header",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // header1 ::= header1 TOK3 SCOLON 
            { parser.Tree.reduce(3,"header1",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("header1",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // header1 ::= 
            { parser.Tree.reduce(0,"header1",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("header1",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // house_section ::= house house 
            { parser.Tree.reduce(2,"house_section",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("house_section",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // house_section ::= house_section house house 
            { parser.Tree.reduce(3,"house_section",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("house_section",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // house ::= HOUSE_WD QSTRING START_WD room_list END_WD 
            { parser.Tree.reduce(5,"house",0);
              Object RESULT =null;
		int keyleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int keyright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String key = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int valueleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int valueright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		HashMap value = (HashMap)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
parser.table.put(key, value);

              CUP$parser$result = parser.getSymbolFactory().newSymbol("house",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // room_list ::= QSTRING INUM 
            { parser.Tree.reduce(2,"room_list",0);
              HashMap RESULT =null;
		int nameleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int nameright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String name = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int sizeleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sizeright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer size = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                                HashMap<String, Integer> tab = new HashMap<String, Integer>();
                                tab.put(name, size);
                                RESULT = tab;
                            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("room_list",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // room_list ::= room_list COMMA QSTRING INUM 
            { parser.Tree.reduce(4,"room_list",0);
              HashMap RESULT =null;
		int tableft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int tabright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		HashMap tab = (HashMap)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int nameleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int nameright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String name = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int sizeleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sizeright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer size = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                                tab.put(name, size);
                                RESULT = tab;
                            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("room_list",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // pre_section ::= pre_section if 
            { parser.Tree.reduce(2,"pre_section",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("pre_section",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // pre_section ::= 
            { parser.Tree.reduce(0,"pre_section",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("pre_section",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // if ::= IF_WD bool_exp THEN_WD print_list FI_WD 
            { parser.Tree.reduce(5,"if",0);
              Object RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Boolean exp = (Boolean)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		

              CUP$parser$result = parser.getSymbolFactory().newSymbol("if",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // bool_exp ::= operands 
            { parser.Tree.reduce(1,"bool_exp",0);
              Boolean RESULT =null;
		int opeleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int operight = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Boolean ope = (Boolean)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = ope; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("bool_exp",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // bool_exp ::= NOT_WD bool_exp 
            { parser.Tree.reduce(2,"bool_exp",0);
              Boolean RESULT =null;
		int boolleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int boolright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Boolean bool = (Boolean)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = !bool; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("bool_exp",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // bool_exp ::= bool_exp AND_WD bool_exp 
            { parser.Tree.reduce(3,"bool_exp",0);
              Boolean RESULT =null;
		int bool1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int bool1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Boolean bool1 = (Boolean)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bool2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bool2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Boolean bool2 = (Boolean)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = bool1 && bool2; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("bool_exp",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // bool_exp ::= bool_exp OR_WD bool_exp 
            { parser.Tree.reduce(3,"bool_exp",0);
              Boolean RESULT =null;
		int bool1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int bool1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Boolean bool1 = (Boolean)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bool2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bool2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Boolean bool2 = (Boolean)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = bool1 || bool2; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("bool_exp",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // bool_exp ::= OP bool_exp CP 
            { parser.Tree.reduce(3,"bool_exp",0);
              Boolean RESULT =null;
		int boolleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int boolright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Boolean bool = (Boolean)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = bool; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("bool_exp",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // operands ::= QSTRING DOT QSTRING EQ EQ INUM 
            { parser.Tree.reduce(6,"operands",0);
              Boolean RESULT =null;
		int houseleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int houseright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		String house = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int roomleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int roomright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String room = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int gsizeleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int gsizeright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer gsize = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                                                                HashMap<String, Integer> m_house = parser.table.get(house);
                                                                Integer m_size = m_house.get(room);
                                                                if(m_size.equals(gsize)){
                                                                    RESULT = true;
                                                                }else {
                                                                    RESULT = false;
                                                                }
                                                            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("operands",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // print_list ::= PRINT_WD QSTRING SCOLON 
            { parser.Tree.reduce(3,"print_list",0);
              Boolean RESULT =null;
		int qsleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int qsright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String qs = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
                                            if((Boolean)parser.stack(-4) == true){
                                                System.out.println(qs);
                                                RESULT = true;
                                            }else{
                                                RESULT = false;
                                            }
                                        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("print_list",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // print_list ::= print_list PRINT_WD QSTRING SCOLON 
            { parser.Tree.reduce(4,"print_list",0);
              Boolean RESULT =null;
		int qsleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int qsright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String qs = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
                                        if((Boolean)parser.stack(-3) == true){
                                            System.out.println(qs);
                                            RESULT = true;
                                        }else{
                                            RESULT = false;
                                        }
                                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("print_list",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
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
