package AST;

import Errors.CompilerExc;

public class SentSimp2 implements Sentencia {
    public final Plot p;

    public SentSimp2(Plot p) {
        this.p = p;
    }

    public int computeTyp() throws CompilerExc{

        return p.computeTyp();
    }
}
