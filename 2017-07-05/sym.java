
//----------------------------------------------------
// The following code was generated by CUP v0.11b beta 20140226
//----------------------------------------------------

/** CUP generated class containing symbol constants. */
public class sym {
  /* terminals */
  public static final int MV_WD = 29;
  public static final int QUM = 12;
  public static final int CP = 16;
  public static final int DECR_WD = 26;
  public static final int OP = 15;
  public static final int MAX_WD = 27;
  public static final int AND_WD = 22;
  public static final int NOT_WD = 24;
  public static final int FUE_WD = 19;
  public static final int CC = 10;
  public static final int COLON = 14;
  public static final int SCOLON = 6;
  public static final int OC = 9;
  public static final int POS_WD = 18;
  public static final int SINUM = 31;
  public static final int COMMA = 7;
  public static final int EOF = 0;
  public static final int INC_WD = 25;
  public static final int MIN_WD = 28;
  public static final int TOK3 = 5;
  public static final int OR_WD = 23;
  public static final int TOK2 = 4;
  public static final int SEP = 2;
  public static final int TOK1 = 3;
  public static final int error = 1;
  public static final int DOT = 13;
  public static final int EQ = 11;
  public static final int ELS_WD = 21;
  public static final int DASH = 8;
  public static final int SET_WD = 17;
  public static final int VAR = 30;
  public static final int DEC_WD = 20;
  public static final String[] terminalNames = new String[] {
  "EOF",
  "error",
  "SEP",
  "TOK1",
  "TOK2",
  "TOK3",
  "SCOLON",
  "COMMA",
  "DASH",
  "OC",
  "CC",
  "EQ",
  "QUM",
  "DOT",
  "COLON",
  "OP",
  "CP",
  "SET_WD",
  "POS_WD",
  "FUE_WD",
  "DEC_WD",
  "ELS_WD",
  "AND_WD",
  "OR_WD",
  "NOT_WD",
  "INC_WD",
  "DECR_WD",
  "MAX_WD",
  "MIN_WD",
  "MV_WD",
  "VAR",
  "SINUM"
  };
public String[] TT;
	public sym(){
		TT = new String[100];
		TT[29]=new String("MV_WD");
		TT[12]=new String("QUM");
		TT[16]=new String("CP");
		TT[26]=new String("DECR_WD");
		TT[15]=new String("OP");
		TT[27]=new String("MAX_WD");
		TT[22]=new String("AND_WD");
		TT[24]=new String("NOT_WD");
		TT[19]=new String("FUE_WD");
		TT[10]=new String("CC");
		TT[14]=new String("COLON");
		TT[6]=new String("SCOLON");
		TT[9]=new String("OC");
		TT[18]=new String("POS_WD");
		TT[31]=new String("SINUM");
		TT[7]=new String("COMMA");
		TT[0]=new String("EOF");
		TT[25]=new String("INC_WD");
		TT[28]=new String("MIN_WD");
		TT[5]=new String("TOK3");
		TT[23]=new String("OR_WD");
		TT[4]=new String("TOK2");
		TT[2]=new String("SEP");
		TT[3]=new String("TOK1");
		TT[1]=new String("error");
		TT[13]=new String("DOT");
		TT[11]=new String("EQ");
		TT[21]=new String("ELS_WD");
		TT[8]=new String("DASH");
		TT[17]=new String("SET_WD");
		TT[30]=new String("VAR");
		TT[20]=new String("DEC_WD");
	}
public String getTT(int i){return TT[i];}
}

