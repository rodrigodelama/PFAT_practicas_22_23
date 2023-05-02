package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Compiler.Typ;
import Errors.CompilerExc;

public class Inp1 implements Inp {
    public final LVar lv;
    private int args_length;

    public Inp1(LVar lv) {
        this.lv = lv;
    }

    public void computeAH1() throws CompilerExc {
        //200 is for int: see yylex
        lv.computeAH1(Typ.t_int);
    }

    public void computeInd() throws CompilerExc {
        lv.computeInd(0);
    }

    public int getArgsLength() {
        args_length = lv.getArgsLength();
        return args_length;
    }

    public void generateCode(BufferedWriter w, String indent) throws IOException {
        lv.generateCodeInp(w, indent);
        w.newLine();
    }
}
