package AST;

public class LVar2 implements LVar {
    public final String identifier;
    public final LVar lv;

    public LVar2(String identifier, LVar l) {
        this.identifier = identifier;
        this.lv = l;
    }
}
