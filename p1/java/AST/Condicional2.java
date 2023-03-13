package AST;

public class Condicional2 implements Sentencias {
    public final Exp e;
    public final Sentencias s1;
    public final Sentencias s2;

    public Condicional2(Exp e, Sentencias s1 ,Sentencias s2)  {
        this.e = e;
        this.s1 = s1;
        this.s2=s2;
    }
}
