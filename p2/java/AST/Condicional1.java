package AST;

public class Condicional1 implements Sentencia {
    public final Exp e;
    public final Sentencia s1;

    public Condicional1(Exp e, Sentencia s1) {
        this.e = e;
        this.s1 = s1;
    }
}
