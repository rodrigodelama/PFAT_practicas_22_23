package AST;

public class IntToReal implements Exp {
    public final Exp e1;

    public IntToReal(Exp e1) {
        this.e1 = e1;
    }
}
