package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Errors.CompilerExc;

public class Vars1 implements Vars {
    public final VDef vd;

    public Vars1(VDef vd) {
        this.vd = vd;
    }

    public void computeAH1() throws CompilerExc {
        vd.computeAH1();
    }

    public void generateCode(BufferedWriter w, String tabs) throws IOException {
        vd.generateCode(w, tabs);
    }
}
