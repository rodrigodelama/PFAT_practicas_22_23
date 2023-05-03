package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Compiler.SymbolTable;
import Errors.CompilerExc;
import Errors.TypExc;
import Compiler.Typ;

public class Asignacion implements Sentencia {
    public final String id;
    public final Exp e;

    public Asignacion(String id, Exp e) {
        this.id = id; //ident
        this.e = e; //exp
    }

    public int computeStTyp() throws CompilerExc {
        int t1, t2;
        t1 = SymbolTable.getType(id); //ident
        t2 = e.computeTyp(); //exp
        
        if(t1 == t2) {
            return Typ.t_void;
        } else if (t1 == Typ.t_real && t2 == Typ.t_int) { //stage 2
            return Typ.t_void; //stage 2
        } else {
            throw new TypExc("Error en Assign");
        } 
    }

    public void generateCode(BufferedWriter w, String indent) throws IOException {
        w.write(indent + id + " = ");
        e.generateCode(w);
        w.write(";");
        w.newLine();
    }
}
