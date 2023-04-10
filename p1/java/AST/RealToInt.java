package AST;

import Compiler.Typ;
import Errors.CompilerExc;
import Errors.TypExc;

public class RealToInt implements Exp {
    public final Exp e1;

    public RealToInt(Exp e1) {
        this.e1 = e1;
    }
    public int computeTyp() throws CompilerExc{

        int t1;
        t1 = e1.computeTyp();
        
        if ((t1==Typ.t_real)){
            return Typ.t_int;
        }else{
            throw new TypExc("Error en RealToInt");
        }
    }
}
