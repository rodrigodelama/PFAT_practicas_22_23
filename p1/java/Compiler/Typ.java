package Compiler;

public class Typ {
    public static final int t_int = 200;
    public static final int t_bool = 300;
    public static final int t_real = 400;
    public static final int t_color = 500; //stage 3
    public static final int t_void = 600;

    public static String typToString(int typ) {
        if(typ == t_int) {
            return "int";
        }
        if(typ == t_bool) {
            return "bool";
        }
        if(typ == t_real) {
            return "real";
        }
        if(typ == t_color) { //stage 3
            return "color";
        }
        return "void";
    }
}
