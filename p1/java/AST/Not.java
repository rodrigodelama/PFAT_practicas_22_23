package AST;

public class Not implements Exp{
    public final Exp e1;

    public Not(Exp e1) {
        this.e1 = e1;
    }
}
