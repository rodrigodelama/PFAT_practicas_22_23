package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Compiler.Typ;
import Errors.CompilerExc;
import Errors.TypExc;

public class Not implements Exp {
    public final Exp e1;

    public Not(Exp e1) {
        this.e1 = e1;
    }
    public int computeTyp() throws CompilerExc {
        int t1;
        t1 = e1.computeTyp();

        if((t1 == Typ.t_bool)) {
            return Typ.t_bool;
        } else {
            throw new TypExc("Error en Op logica NOT");
        }
    }

    public void generateCode(BufferedWriter w) throws IOException {
        w.write("("); 
        w.write("!");
        e1.generateCode(w);
        w.write(")"); 
        
    }
}
