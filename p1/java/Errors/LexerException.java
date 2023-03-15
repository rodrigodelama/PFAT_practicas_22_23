package Errors;
//import Errors.CompilerExc;
public class LexerException extends CompilerExc {

  private String msg;

  public LexerException(String s) {
    this.msg = s;
  }

  public String toString() {
    return msg;
  }
}
