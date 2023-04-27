package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Compiler.Typ;
import Errors.CompilerExc;
import Errors.TypExc;

public class Sent1 implements Sentencia {
    public final Sentencia ss;
    public final Sentencia s;

    public Sent1(Sentencia ss, Sentencia s) {
        this.ss = ss;
        this.s = s;
    }
    public int computeStTyp() throws CompilerExc {
        int t1, t2;
        t1 = ss.computeStTyp();
        t2 = s.computeStTyp();

        if((t1 == Typ.t_void) && (t2 == Typ.t_void)) {
            return Typ.t_void;
        } else {
            throw new TypExc("Error en Sent1");
        } 
    }
    public void generateCode(BufferedWriter w, String indent) throws IOException{
        ss.generateCode(w, indent);
        s.generateCode(w, indent);
    }

}
