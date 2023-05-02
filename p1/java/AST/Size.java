package AST;

import java.io.BufferedWriter;
import java.io.IOException;

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

    public void generateCode(BufferedWriter w, String indent) throws IOException {
        //w.write  if((ancho+10) <= 0 || (alto+10) <= 0) {
            //System.err.println("Error: ancho o alto negativo");
            //return;
        //}
        w.write(indent+"if((");
        exp1.generateCode(w);
        w.write(") <= 0 || (");
        exp2.generateCode(w);
        w.write(") <= 0) {");
        w.newLine();
        w.write(indent+"    "+"System.err.println(\"Error: ancho o alto negativo\");");
        w.newLine();
        w.write(indent+"    "+"return;");
        w.newLine();
        w.write(indent+"}");
        w.newLine();

        // int array[][] = new int[ancho+10][alto+10];
        
        // // inicializar a 0
        // for (int j=0; j < ancho+10; j++) {
        //     for (int k=0; k < alto+10; k++) {
        //         array[j][k] = 0;
        //     }
        // }

        w.write(indent+"int array[][] = new int[");
        exp2.generateCode(w);
        w.write("][");
        exp1.generateCode(w);
        w.write("];");
        w.newLine();
        //        int ancho_size = array.length; int alto_size = array[0].length;
        w.write(indent+"int ancho_size = array.length;");
        w.newLine();
        w.write(indent+"int alto_size = array[0].length;");
        w.newLine();

        w.write(indent+"for(int j=0; j < ancho_size; j++) { ");
        w.newLine();
        w.write(indent+"    "+"for(int k=0; k < alto_size; k++) { ");
        w.newLine();
        w.write(indent+"        "+"array[j][k] = 0;");
        w.newLine();
        w.write(indent+"    "+"}");
        w.newLine();
        w.write(indent+"}");
        w.newLine();
    }
}
