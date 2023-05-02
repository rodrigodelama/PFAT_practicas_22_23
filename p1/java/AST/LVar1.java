package AST;

import java.io.BufferedWriter;
import java.io.IOException;

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

    public void generateCode(BufferedWriter w, String tabs) throws IOException {
        w.write(identifier + " = ");
        switch (ah1) {
            case 200:
                w.write("0");
                break;
            case 300:
                w.write("false");
                break;
            case 400:
                w.write("0.0f");
                break;
            default:
                break;
        }
    }

    public void generateCodeInp(BufferedWriter w, String tabs) throws IOException {
        w.write(tabs + "int " + identifier + " = Integer.parseInt(args["+ ind +"]);");
        w.newLine();
    }
}
