package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Errors.CompilerExc;

public class Sent2 implements Sentencia {
    public final Sentencia ss;
    
    public Sent2(Sentencia ss) {
        this.ss = ss;
    }

    public int computeStTyp() throws CompilerExc {
        return ss.computeStTyp();
    }

    public void generateCode(BufferedWriter w, String indent) throws IOException {
        ss.generateCode(w, indent);
    }
}
