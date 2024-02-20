package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Compiler.SymbolTable;
import Errors.CompilerExc;

public class LVar2 implements LVar {
    public final String identifier;
    public final LVar lv;
    private int ah1;
    private int ind;
    private int args_length;

    //constructor
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

    public void generateCode(BufferedWriter w, String tabs) throws IOException {
        w.write(identifier + " = ");
        switch (ah1) {
            case 200:
                w.write("0,");
                break;
            case 300:
                w.write("false,");
                break;
            case 400:
                w.write("0.0f,");
                break;
            default:
                break;
        }
        lv.generateCode(w, tabs);
    }

    public void generateCodeInp(BufferedWriter w, String tabs) throws IOException {
        w.write(tabs + "int " + identifier + " = Integer.parseInt(args["+ ind +"]);");
        w.newLine();
        lv.generateCodeInp(w, tabs);
    }
}
