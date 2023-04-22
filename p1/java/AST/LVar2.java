package AST;

import Compiler.SymbolTable;
import Errors.CompilerExc;

public class LVar2 implements LVar {
    public final String identifier;
    public final LVar lv;
    private int ah1;
    private int ind;
    private int args_length;

    public LVar2(String identifier, LVar l) {
        this.identifier = identifier;
        this.lv = l;
    }

    public void computeAH1(int t) throws CompilerExc {
        this.ah1 = t;

        lv.computeAH1(t);
        SymbolTable.newEntry(identifier,ah1);
    }

    public int getAH1() {
        return ah1;
    }

    public void computeInd(int args) throws CompilerExc {
        ind=args;
        lv.computeInd(ind + 1);
    }

    public int getInd() {
        return ind;
    }

    public int getArgsLength() {
        args_length = lv.getArgsLength();
        return args_length;
    }
}
