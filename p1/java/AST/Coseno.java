package AST;

import Compiler.Typ;
import Errors.CompilerExc;
import Errors.TypExc;

public class Coseno implements Exp {
    public final Exp e1;

    public Coseno(Exp e1) {
        this.e1 = e1;
    }
    public int computeTyp() throws CompilerExc {
        int t1;
        t1 = e1.computeTyp();
        
        if (t1 == Typ.t_real) {
            return Typ.t_real;
        } else {
            throw new TypExc("Error en RealToInt");
        }
    }
}
