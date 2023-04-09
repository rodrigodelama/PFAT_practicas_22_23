package AST;

import Errors.CompilerExc;

public class LVar1 implements LVar {
    public final String identifier;
    private int ah1;

    public LVar1(String identifier) {
        this.identifier = identifier;
    }
    public void computeAH1(int t) throws CompilerExc{
        ah1=t;
        SymbolTable.newEntry(identifier,ah1);

    }

    public int getAH1(){
        return ah1;
    }
}

