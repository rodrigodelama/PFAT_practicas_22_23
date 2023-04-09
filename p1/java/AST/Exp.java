package AST;

import Errors.CompilerExc;

public interface Exp {
    public int computeTyp() throws CompilerExc;
}
