package Compiler;

public class VarNoDefExc extends Exception{
    
    public VarNoDefExc (String name){
        super(name);
        //catch DoubleDefExc e{
            //System.err.println("Error in varibale " + e);

        //}
    }

}