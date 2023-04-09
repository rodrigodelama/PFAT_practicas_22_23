package AST;

public class Sent1 implements Sentencia {
    public final Sentencia ss;
    public final Sentencia s;

    public Sent1(Sentencia ss, Sentencia s) {
        this.ss = ss;
        this.s = s;
    }
    public int computeTyp() throws CompilerExc{

        int t1, t2;
        t1 = ss.computeTyp();
        t2 = s.computeTyp();
        if((t1==void) && (t2 == void)){
            return void;
        }
        else{
            throw new TypExc("Error en Sent");
        } 
    }
}
