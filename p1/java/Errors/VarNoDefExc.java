package Errors;

public class VarNoDefExc extends CompilerExc { //por la cabecera del metodo Exp
    
    private String ident;
    
    public VarNoDefExc(String ident) {
        this.ident = ident;
    }

    public String toString() {
        return "Var not defined -> " + this.ident;
    }
}