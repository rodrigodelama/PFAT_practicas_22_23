package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Errors.CompilerExc;

public class Decl {
    public final int type;
    public final LVar lvars;

    public Decl(int type, LVar lvars) {
        this.type = type;
        this.lvars = lvars;
    }

    public void computeAH1() throws CompilerExc {
        int ah1 = this.type;
        lvars.computeAH1(ah1);
    }

    public void generateCode(BufferedWriter w ,String tabs) throws IOException{
        String type_str = "";
        switch (type) {
            case 200:
                type_str = "int";
                break;
            case 300:
                type_str = "boolean";
                break;
            case 400:
                type_str = "float";
                break;
            default:
                break;
        }
        w.write(tabs+type_str + " ");
        lvars.generateCode(w,tabs);
        w.write(";");
        w.newLine();

    }

}
