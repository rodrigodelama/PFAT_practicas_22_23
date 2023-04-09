package AST;

import Errors.CompilerExc;

public class Inp1 implements Inp {
    public final LVar lv;

    public Inp1(LVar lv) {
        this.lv = lv;
    }
    //para lambda
    public Inp1() {
        this.lv = null;
    }

    public void computeAH1() throws CompilerExc{
        //200 is for int: see yylex
        lv.computeAH1(200);
    }

}
