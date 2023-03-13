package AST;
public class Condicional1 implements Sentencias, Sent {
    public final Exp e;
    public final Sent s1;

    public Condicional1(Exp e, Sent s1) {
        this.e = e;
        this.s1 = s1;
    }
}
