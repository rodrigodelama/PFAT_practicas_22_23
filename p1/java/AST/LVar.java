package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Errors.CompilerExc;

public interface LVar {
    public void computeAH1(int t) throws CompilerExc;
    public int getAH1();
    public void computeInd(int args) throws CompilerExc;
    public int getInd() ;
    public int getArgsLength();
    public void generateCode(BufferedWriter w, String tabs) throws IOException;
    public void generateCodeInp(BufferedWriter w, String tabs) throws IOException;
}
