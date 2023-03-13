package AST;

public class Iteracion implements Sentencias {
    public final Exp e;
    public final Sentencias s;

    public Iteracion(Exp e, Sentencias s)  {
        this.e = e;
        this.s = s;
    }
}