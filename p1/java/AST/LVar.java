package AST;

import Errors.CompilerExc;

public interface LVar {
    public void computeAH1(int t) throws CompilerExc;
    public int getAH1();
}
