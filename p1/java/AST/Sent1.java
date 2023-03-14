package AST;

public class Sent1 implements Sentencia {
    public final SentSimp ss;
    public final Sentencia s;

    public Sent1(SentSimp ss, Sentencia s) {
        this.ss = ss;
        this.s = s;
    }
}
