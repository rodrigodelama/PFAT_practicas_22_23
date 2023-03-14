package AST;

public class Iteracion implements Sentencia {
    public final Exp e;
    public final Sentencia s;

    public Iteracion(Exp e, Sentencia s)  {
        this.e = e;
        this.s = s;
    }
}