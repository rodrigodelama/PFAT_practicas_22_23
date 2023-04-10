package AST;
import Compiler.*;
import Errors.*;
public class Variable implements Exp {
    public final String ident;

    public Variable(String ident) {
        this.ident = ident;
    }
    public int computeTyp() throws CompilerExc{
        return SymbolTable.getType(this.ident);//si no lanza la excepcion, entonces devuelve el numero del tipo.
    }
}
