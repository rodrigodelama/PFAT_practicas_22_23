package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Errors.CompilerExc;

public interface Vars {
    public void computeAH1() throws CompilerExc;
    public void generateCode(BufferedWriter w ,String tabs) throws IOException;
}
