package AST;

import java.io.BufferedWriter;
import java.io.IOException;

//import Errors.CompilerExc; -> esta en la carpeta de Errors.
import Errors.*;
public interface Exp {
    public int computeTyp() throws CompilerExc;
    public void generateCode(BufferedWriter w) throws IOException;
}
/*
    - no pasamos indentacion a "generateCode" porque no es necesario,
        las expresiones siempre estaran dentro de parentesis.
    - no hacemos nueva linea tampoco por eso mismo.


*/