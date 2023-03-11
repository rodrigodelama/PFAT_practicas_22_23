package AST;

public class Sent1 implements Sent, Sentencias {
    public final SentSimp ss;
    public final Sent s;

    public Sent1(SentSimp ss, Sent s) {
        this.ss = ss;
        this.s = s;
    }
}
