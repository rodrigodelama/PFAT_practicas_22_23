package AST;

import Compiler.SymbolTable;
import Errors.CompilerExc;

public class LVar1 implements LVar {
    public final String identifier;
    private int ah1;
    private int ind;
    private int args_length;

    public LVar1(String identifier) {
        this.identifier = identifier;
    }

    public void computeAH1(int t) throws CompilerExc {
        this.ah1 = t;
        SymbolTable.newEntry(this.identifier,this.ah1);
    }

    public int getAH1() {
        return this.ah1;
    }

    public void computeInd(int args) throws CompilerExc {
        this.ind = args;
    }

    public int getInd() {
        return this.ind;
    } 

    public int getArgsLength() {
        args_length = ind;
        return args_length;
    }
    public void generateCode() {
        
    }


}

