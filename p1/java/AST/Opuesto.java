package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Compiler.Typ;
import Errors.CompilerExc;
import Errors.TypExc;

public class Opuesto implements Exp {
    public final Exp e;

    public Opuesto(Exp e) {
        this.e = e;
    }
    public int computeTyp() throws CompilerExc {
        int t1;
        t1 = e.computeTyp();

        if((t1 == Typ.t_int)) {
            return Typ.t_int;

        } else if ((t1 == Typ.t_real)) {
            return Typ.t_real;
        }
        throw new TypExc("Error en Opuesto");
    }

    public void generateCode(BufferedWriter w) throws IOException {
        w.write("-");
        e.generateCode(w);
        
    }
}
