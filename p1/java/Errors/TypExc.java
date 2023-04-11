package Errors;

public class TypExc extends CompilerExc {
    private String msg;

    public TypExc (String name) {
        this.msg = name;
    }

    public String toString() {
        return this.msg;
    }
}
