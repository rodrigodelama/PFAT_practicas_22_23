package AST;
public class Decl {
    public final int type;
    public final LVar lvars;

    public Decl(int type, LVar lvars) {
        this.type = type;
        this.lvars = lvars;
    }
}
