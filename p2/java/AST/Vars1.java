package AST;

import Errors.CompilerExc;

public class Vars1 implements Vars {
    public final VDef vd;

    public Vars1(VDef vd) {
        this.vd = vd;
    }
    //para lambda
    public Vars1() {
        this.vd = null;
    } 

    public void computeAH1() throws CompilerExc{
        vd.computeAH1();
    }

}
