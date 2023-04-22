package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Errors.CompilerExc;

public interface Inp {
    public void computeAH1() throws CompilerExc;
    public void computeInd() throws CompilerExc;
    public int getArgsLength();
    public void generateCode(BufferedWriter w, String indent) throws IOException;
}
