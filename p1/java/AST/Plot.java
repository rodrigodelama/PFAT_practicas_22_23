package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Compiler.*;
import Errors.*;

public class Plot implements Sentencia {
    public final Exp e1; //x
    public final Exp e2; //y
    public final int color;

    public Plot(Exp e1, Exp e2, int color) {
        this.e1 = e1;
        this.e2 = e2;
        this.color = color;
        
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
    public void generateCode(BufferedWriter w, String indent) throws IOException {
        //array[i+5][(alto_size-1)-(5)] = 2; //igual a 2 porque el 2 es negro

        w.write(indent+"array[");
        e1.generateCode(w);
        w.write("][(int)((alto_size-1)-(");
        e2.generateCode(w);
        w.write("))] =");
        w.write(color + "" + ";");
        w.newLine();
    }
}
