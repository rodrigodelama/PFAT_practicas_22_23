package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Compiler.*;
import Errors.*;

public interface Size {
    public int computeStTyp() throws CompilerExc;
    public void generateCode(BufferedWriter w, String indent) throws IOException;
}


