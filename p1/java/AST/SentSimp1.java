package AST;

public class SentSimp1 implements Sentencia {
    public final Sentencia as;

    public SentSimp1(Sentencia as) {
        this.as = as;
    }

    public int computeTyp() throws CompilerExc{

        return as.computeTyp();
    }
}
