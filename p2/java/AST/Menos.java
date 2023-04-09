package AST;

import Compiler.Typ;
import Errors.CompilerExc;
import Errors.TypExc;

public class Menos implements Exp {
    public final Exp e1;
    public final Exp e2;

    public Menos(Exp e1, Exp e2) {
        this.e1 = e1;
        this.e2 = e2;
    }
    public int computeTyp() throws CompilerExc{

        int t1, t2;
        t1 = e1.computeTyp();
        t2 = e2.computeTyp();
        if((t1==Typ.t_int) && (t2 == Typ.t_int)){
            return Typ.t_int;

        }else if ((t1==Typ.t_real) && (t2 == Typ.t_real)){
            return Typ.t_real;
            
        }
        throw new TypExc("Error en resta");
    }
}
