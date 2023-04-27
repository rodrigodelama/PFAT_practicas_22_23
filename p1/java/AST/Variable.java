package AST;
import java.io.BufferedWriter;
import java.io.IOException;

import Compiler.*;
import Errors.*;
public class Variable implements Exp {
    public final String ident;

    public Variable(String ident) {
        this.ident = ident;
    }
    public int computeTyp() throws CompilerExc {
        return SymbolTable.getType(this.ident); //si no lanza la excepcion, entonces devuelve el numero del tipo.
    }
    public void generateCode(BufferedWriter w) throws IOException{
        w.write(ident);
    }
}
