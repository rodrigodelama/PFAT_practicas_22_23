package AST;

import Errors.CompilerExc;

public class Vars1 implements Vars {
    public final VDef vd;

    public Vars1(VDef vd) {
        this.vd = vd;
    }

    public void computeAH1() throws CompilerExc{
        vd.computeAH1();
    }

}
