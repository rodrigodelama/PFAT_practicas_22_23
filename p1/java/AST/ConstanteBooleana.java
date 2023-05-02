package AST;
import Errors.*;

import java.io.BufferedWriter;
import java.io.IOException;

import Compiler.*;
public class ConstanteBooleana implements Exp {
    public final boolean c;

    public ConstanteBooleana(boolean c) {
        this.c = c;
    }

    public int computeTyp() throws CompilerExc {
        return Typ.t_bool;
    }

    public void generateCode(BufferedWriter w) throws IOException {
        w.write("" + c);
    }
}
