package AST;
import Errors.*;
import Compiler.*;
public class ConstanteEntera implements Exp {
    public final int n;

    public ConstanteEntera(int n) {
        this.n = n;
    }
    public int computeTyp() throws CompilerExc{
        return Typ.t_int;
    }
}
