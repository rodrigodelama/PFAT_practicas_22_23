package Errors;

public class SyntaxException extends CompilerExc {

    private String msg;
    private int lineNumber;

    public SyntaxException(String s, int lineNumber) {
    msg = s;
    this.lineNumber = lineNumber;
    }

    public String toString() {
        return "Error sintáctico en la línea " + lineNumber + ": " + msg;
    }
}