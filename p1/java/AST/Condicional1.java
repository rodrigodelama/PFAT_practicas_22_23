package AST;

public class Condicional1 implements Sentencias {
    public final Exp e;
    public final Sentencias s1;

    public Condicional1(Exp e, Sentencias s1) {
        this.e = e;
        this.s1 = s1;
    }
}
