
//----------------------------------------------------
// The following code was generated by CUP v0.11b beta 20140226
//----------------------------------------------------

/** CUP generated class containing symbol constants. */
public class sym {
  /* terminals */
  public static final int TOK1 = 3;
  public static final int EURO_WD = 11;
  public static final int SC = 6;
  public static final int QSTRING = 10;
  public static final int CM = 8;
  public static final int DASH = 7;
  public static final int PAM = 9;
  public static final int EOF = 0;
  public static final int SEP = 2;
  public static final int error = 1;
  public static final int FNUM = 12;
  public static final int TOK3 = 5;
  public static final int INUM = 13;
  public static final int TOK2 = 4;
  public static final String[] terminalNames = new String[] {
  "EOF",
  "error",
  "SEP",
  "TOK1",
  "TOK2",
  "TOK3",
  "SC",
  "DASH",
  "CM",
  "PAM",
  "QSTRING",
  "EURO_WD",
  "FNUM",
  "INUM"
  };
public String[] TT;
	public sym(){
		TT = new String[100];
		TT[3]=new String("TOK1");
		TT[11]=new String("EURO_WD");
		TT[6]=new String("SC");
		TT[10]=new String("QSTRING");
		TT[8]=new String("CM");
		TT[7]=new String("DASH");
		TT[9]=new String("PAM");
		TT[0]=new String("EOF");
		TT[2]=new String("SEP");
		TT[1]=new String("error");
		TT[12]=new String("FNUM");
		TT[5]=new String("TOK3");
		TT[13]=new String("INUM");
		TT[4]=new String("TOK2");
	}
public String getTT(int i){return TT[i];}
}

