package Errors;
//import Errors.CompilerExc;
public class LexerException extends CompilerExc {

  //El programa deberá de levantar una excepción que no deberá de ser capturada en el caso de que el programa fuente tenga algún error de sintaxis. Los mensajes 
    //emitidos por excepciones producidas por errores en la fase de análisis sintáctico deberán indicar una línea del programa orientativa del lugar en el que se ha producido el error.
    private String msg;
    
    public LexerException(String s) {
        msg = s;
    }

    public String toString() {
        return msg;
    }
}
