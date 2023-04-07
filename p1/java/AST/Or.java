package AST;

public class Or implements Exp {
    public final Exp e1;
    public final Exp e2;

    public Or(Exp e1, Exp e2) {
        this.e1 = e1;
        this.e2 = e2;
    }
}
