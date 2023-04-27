package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Compiler.Typ;
import Errors.CompilerExc;
import Errors.TypExc;

public class Iteracion implements Sentencia {
    public final Exp e;
    public final Sentencia s;

    public Iteracion(Exp e, Sentencia s)  {
        this.e = e;
        this.s = s;
    }

    public int computeStTyp() throws CompilerExc {
        int t1, t2;
        t1 = e.computeTyp();
        t2 = s.computeStTyp();

        if((t1 == Typ.t_bool) && (t2 == Typ.t_void)) {
            return Typ.t_void;
        } else {
            throw new TypExc("Error en Condicional");
        } 
    }
    public void generateCode(BufferedWriter w, String indent) throws IOException{
        // while (i < ancho) {
        //     i++;
        // }
        //int i = 0;
        w.write(indent+"i = 0;");
        w.write(indent+"while (");
        e.generateCode(w);
        w.write(") {");
        w.newLine();
        s.generateCode(w, indent+"    ");
        w.newLine();
        w.write(indent+"}");
        w.newLine();
    }
}