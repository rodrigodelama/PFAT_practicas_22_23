package AST;

public class Inp1 implements Inp {
    public final LVar lv;

    public Inp1(LVar lv) {
        this.lv = lv;
    }
    //para lambda
    public Inp1() {
        this.lv = null;
    }
}
