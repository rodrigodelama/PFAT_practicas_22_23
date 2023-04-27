package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Errors.CompilerExc;

public class Parentesis implements Exp {
    public final Exp e;

    public Parentesis(Exp e) {
        this.e = e;
    }

    //<Exp>.typ= <Exp>1.typ
    public int computeTyp() throws CompilerExc {
        return e.computeTyp();
    }

    public void generateCode(BufferedWriter w) throws IOException {
        w.write("(");
        e.generateCode(w);
        w.write(")");

    }
}
