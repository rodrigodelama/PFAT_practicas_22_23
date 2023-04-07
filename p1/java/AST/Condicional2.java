package AST;

public class Condicional2 implements Sentencia {
    public final Exp e;
    public final Sentencia s1;
    public final Sentencia s2;

    public Condicional2(Exp e, Sentencia s1 ,Sentencia s2) {
        this.e = e;
        this.s1 = s1;
        this.s2 = s2;
    }
}
