package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Errors.CompilerExc;

public class SentSimp2 implements Sentencia {
    public final Plot p;

    public SentSimp2(Plot p) {
        this.p = p;
    }

    public int computeStTyp() throws CompilerExc {
        return p.computeStTyp();
    }

    public void generateCode(BufferedWriter w, String indent) throws IOException {
        p.generateCode(w, indent);
    }
}
