package AST;
import Errors.*;

import java.io.BufferedWriter;
import java.io.IOException;

import Compiler.*;
public class ConstanteEntera implements Exp {
    public final int n;

    public ConstanteEntera(int n) {
        this.n = n;
    }

    public int computeTyp() throws CompilerExc {
        return Typ.t_int;
    }

    public void generateCode(BufferedWriter w) throws IOException {
        w.write(""+n);//TODO posible error de tipo de dato (si nos da problemas, convertir a string)
    }
}
