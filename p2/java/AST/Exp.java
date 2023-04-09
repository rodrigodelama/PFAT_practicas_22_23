package AST;

//import Errors.CompilerExc; -> esta en la carpeta de Errors.
import Errors.*;
public interface Exp {
    public int computeTyp() throws CompilerExc;
}
