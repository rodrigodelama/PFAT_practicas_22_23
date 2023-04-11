package AST;

import Compiler.Typ;
import Errors.CompilerExc;
import Errors.TypExc;

public class Condicional1 implements Sentencia {
    public final Exp e;
    public final Sentencia s1;

    public Condicional1(Exp e, Sentencia s1) {
        this.e = e;
        this.s1 = s1;
    }

    public int computeTyp() throws CompilerExc {
        int t1, t2;
        t1 = e.computeTyp();
        t2 = s1.computeTyp();

        if((t1 == Typ.t_bool) && (t2 == Typ.t_void)) {
            return Typ.t_void;
        } else {
            throw new TypExc("Error en Condicional");
        } 
    }
}
