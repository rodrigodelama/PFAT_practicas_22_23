package AST;
import Errors.*;
import Compiler.*;
public class ConstanteReal implements Exp {
    public final float n;

    public ConstanteReal(float n) {
        this.n = n;
    }

    public int computeTyp() throws CompilerExc {
        return Typ.t_real;
    }
}
