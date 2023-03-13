package AST;

public class RealToInt implements Exp {
    public final Exp e1;

    public RealToInt(Exp e1) {
        this.e1 = e1;
    }
}
