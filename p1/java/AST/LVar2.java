package AST;

import Compiler.SymbolTable;
import Errors.CompilerExc;

public class LVar2 implements LVar {
    public final String identifier;
    public final LVar lv;
    private int ah1;

    public LVar2(String identifier, LVar l) {
        this.identifier = identifier;
        this.lv = l;
    }

    public void computeAH1(int t) throws CompilerExc{
        ah1=t;
        lv.computeAH1(t);
        SymbolTable.newEntry(identifier,ah1);
    }

    public int getAH1(){
        return ah1;
    }
}
