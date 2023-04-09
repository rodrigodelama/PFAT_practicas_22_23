package AST;

import Errors.CompilerExc;

public class VDef1 implements VDef {
    public final Decl d;

    public VDef1(Decl d) {
        this.d = d;
    }
    public void computeAH1() throws CompilerExc{
        d.computeAH1();
    }

}
