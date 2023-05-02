package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Compiler.Typ;
import Errors.CompilerExc;
import Errors.TypExc;

public class MenorQue implements Exp {
    public final Exp e1;
    public final Exp e2;

    public MenorQue(Exp e1, Exp e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public int computeTyp() throws CompilerExc {
        int t1, t2;
        t1 = e1.computeTyp();
        t2 = e2.computeTyp();

        if(((t1 == Typ.t_int) && (t2 == Typ.t_int)) || ((t1==Typ.t_real) && (t2 == Typ.t_real))) {
            return Typ.t_bool;
        } else {
            throw new TypExc("Error en MenorQue");
        }
    }

    public void generateCode(BufferedWriter w) throws IOException {
        w.write("("); 
        e1.generateCode(w);
        w.write(" < ");
        e2.generateCode(w); 
        w.write(")"); 
    }
}
