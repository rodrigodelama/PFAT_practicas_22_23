package AST;

public class Iteracion implements Sentencia {
    public final Exp e;
    public final Sentencia s;

    public Iteracion(Exp e, Sentencia s)  {
        this.e = e;
        this.s = s;
    }

    public int computeTyp() throws CompilerExc{

        int t1, t2;
        t1 = e.computeTyp();
        t2 = s.computeTyp();
        if((t1==Typ.t_bool) && (t2 == void)){
            return void;
        }
        else{
            throw new TypExc("Error en Condicional");
        } 
    }
}