package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Errors.CompilerExc;

public interface Sentencia {
    public int computeStTyp() throws CompilerExc;
    public void generateCode(BufferedWriter w, String indent) throws IOException;
}
