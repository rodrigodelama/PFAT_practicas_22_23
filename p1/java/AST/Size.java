package AST;

import Compiler.*;
import Errors.*;

public class Size {
    public final Exp exp1;
    public final Exp exp2;

    public Size(Exp exp1, Exp exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }
    
    //<Size>.st_typ= if (<Exp>.typ== int) 
    //and (<Exp>1.typ== int) then void else typ_err
    public int computeStTyp() throws CompilerExc {
        int t1, t2;
        t1 = exp1.computeTyp();
        t2 = exp2.computeTyp();

        if((t1 == Typ.t_int) && (t2 == Typ.t_int)) {
            return Typ.t_void;
        } else {
            throw new TypExc("Error en size");
        }
    }
}
