package AST;

import Errors.CompilerExc;

public class Decl {
    public final int type;
    public final LVar lvars;

    public Decl(int type, LVar lvars) {
        this.type = type;
        this.lvars = lvars;
    }

    public void computeAH1() throws CompilerExc {
        int ah1 = this.type;
        lvars.computeAH1(ah1);
    }
}
