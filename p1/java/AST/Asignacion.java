package AST;

import Compiler.SymbolTable;

public class Asignacion implements Sentencia {
    public final String id;
    public final Exp e;

    public Asignacion(String id, Exp e) {
        this.id = id;
        this.e = e;
    }

    public int computeTyp() throws CompilerExc{

        int t1, t2;
        t1 = SymbolTable.getType(id);
        t2 = e.computeTyp();
        if(t1==t2){
            return void;
        }
        else{
            throw new TypExc("Error en Assign");
        } 
    }
}
