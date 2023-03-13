package AST;

public class VDef2 implements VDef {
    public final Decl d;
    public final VDef v;

    public VDef2(Decl d, VDef v) {
        this.d = d;
        this.v=v;
    }
}
