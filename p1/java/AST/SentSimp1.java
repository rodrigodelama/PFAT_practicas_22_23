package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Errors.CompilerExc;

public class SentSimp1 implements Sentencia {
    public final Sentencia as;

    public SentSimp1(Sentencia as) {
        this.as = as;
    }

    public int computeStTyp() throws CompilerExc {
        return as.computeStTyp();
    }
    public void generateCode(BufferedWriter w, String indent) throws IOException{
        as.generateCode(w, indent);
    }

}
