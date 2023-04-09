package AST;

public class Size {
    public final Exp exp1;
    public final Exp exp2;

    public Size(Exp exp1, Exp exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    //<Size>.st_typ= if (<Exp>.typ== int) 
    //and (<Exp>1.typ== int) then void else typ_err
}
