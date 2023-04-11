package AST;
import Errors.*;
import Compiler.*;
public class ConstanteBooleana implements Exp {
    public final boolean c;

    public ConstanteBooleana(boolean c) {
        this.c = c;
    }

    public int computeTyp() throws CompilerExc {
        return Typ.t_bool;
    }
}
