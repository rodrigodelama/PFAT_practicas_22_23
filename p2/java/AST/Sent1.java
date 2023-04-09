package AST;

public class Sent1 implements Sentencia {
    public final Sentencia ss;
    public final Sentencia s;

    public Sent1(Sentencia ss, Sentencia s) {
        this.ss = ss;
        this.s = s;
    }
}
