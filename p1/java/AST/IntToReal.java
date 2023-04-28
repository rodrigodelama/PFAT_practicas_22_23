package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Compiler.Typ;
import Errors.CompilerExc;
import Errors.TypExc;

public class IntToReal implements Exp {
    public final Exp e1;

    public IntToReal(Exp e1) {
        this.e1 = e1;
    }

    public int computeTyp() throws CompilerExc {
        int t1;
        t1 = e1.computeTyp();

        if ((t1 == Typ.t_int)) {
            return Typ.t_real;
        } else {
            throw new TypExc("Error en IntToReal");
        }
    }

    public void generateCode(BufferedWriter w) throws IOException {
        w.write("(float)( ");
        e1.generateCode(w);
        w.write(")");//entre parentesis para cumplir la regla de produccion.
        
    }
}
