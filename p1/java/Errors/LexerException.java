package Errors;
//import Errors.CompilerExc;
public class LexerException extends CompilerExc {

  private String msg;

  public LexerException(String s) {
    super(s);
  }

  public String toString() {
    return msg;
  }
}
