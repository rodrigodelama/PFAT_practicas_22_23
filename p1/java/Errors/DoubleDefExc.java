package Errors;

public class DoubleDefExc extends CompilerExc{
    
    private String ident;
    
    public DoubleDefExc (String ident) {
        this.ident = ident;
    }

    public String toString() {
        return "Var doubly defined -> " + this.ident;
    }

}