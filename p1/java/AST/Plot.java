package AST;

import Compiler.*;
import Errors.*;

public class Plot implements Sentencia {
    public final Exp e1;
    public final Exp e2;

    public Plot(Exp e1, Exp e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public int computeStTyp() throws CompilerExc {
        int t1, t2;
        t1 = e1.computeTyp();
        t2 = e2.computeTyp();

        if((t1 == Typ.t_int) && (t2 == Typ.t_int)) {
            return Typ.t_void;
        } else {
            throw new TypExc("Error en Plot");
        }
    }
}
