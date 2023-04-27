package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Errors.CompilerExc;

public class VDef2 implements VDef {
    public final Decl d;// int identificador;
    public final VDef v;

    public VDef2(Decl d, VDef v) {
        this.d = d;
        this.v = v;
    }

    public void computeAH1() throws CompilerExc {
        d.computeAH1();
        v.computeAH1();
    }
    public void generateCode(BufferedWriter w ,String tabs) throws IOException{
        d.generateCode(w,tabs);
        v.generateCode(w,tabs);

    }

}