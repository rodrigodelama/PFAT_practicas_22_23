package AST;

import Errors.CompilerExc;

public class SentSimp1 implements Sentencia {
    public final Sentencia as;

    public SentSimp1(Sentencia as) {
        this.as = as;
    }

    public int computeStTyp() throws CompilerExc {
        return as.computeStTyp();
    }
}
