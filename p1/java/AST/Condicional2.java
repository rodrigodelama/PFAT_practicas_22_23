package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Compiler.Typ;
import Errors.CompilerExc;
import Errors.TypExc;

public class Condicional2 implements Sentencia {
    public final Exp e;
    public final Sentencia s1;
    public final Sentencia s2;

    public Condicional2(Exp e, Sentencia s1 ,Sentencia s2) {
        this.e = e;
        this.s1 = s1;
        this.s2 = s2;
    }

    public int computeStTyp() throws CompilerExc {
        int t1, t2, t3;
        t1 = e.computeTyp();
        t2 = s1.computeStTyp();
        t3 = s2.computeStTyp();

        if((t1 == Typ.t_bool) && (t2 == Typ.t_void) && (t3 == Typ.t_void)) {
            return Typ.t_void;
        } else {
            throw new TypExc("Error en Condicional");
        }
    }

    public void generateCode(BufferedWriter w, String indent) throws IOException {
        // if (i < ancho) {
        // } else {

        w.write(indent+"if (");
        e.generateCode(w);
        w.write(") {");
        w.newLine();
        s1.generateCode(w, indent+"    ");
        w.newLine();
        w.write(indent+"} else {");
        w.newLine();
        s2.generateCode(w, indent+"    ");
        w.newLine();
        w.write(indent+"}");
        w.newLine();
    }
}
