package AST;

public class Parentesis implements Exp {
    public final Exp e;

    public Parentesis(Exp e) {
        this.e = e;
    }
}
