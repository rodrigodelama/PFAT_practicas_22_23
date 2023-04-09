package Compiler;

public class Typ {
    public static final int t_int = 200;
    public static final int t_bool = 300;
    public static final int t_real = 400;
    //TODO: pendiente de type Colors;

    public static String typToString(int typ){
        if(typ==t_int){
            return "int";
        }
        if(typ==t_bool){
            return "boolean";
        }
        return "real";
    }
}

