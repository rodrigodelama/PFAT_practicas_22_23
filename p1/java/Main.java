import Parser.*;
import Lexer.*;
import java.io.*;

import AST.Prog;

public class Main {
  public static void main(String args[]) throws Exception {
    java.io.BufferedReader in;
    Yylex sc;
    parser p;
    java_cup.runtime.Symbol sroot;
    boolean error = false;
    Prog programa = null;
    // El primer parametro es el nombre del fichero con el programa
    if (args.length < 1) {
      System.out.println("Uso: java Main <nombre_fichero>");
      error = true;
    }

    if (!error) {
      try {
        in = new java.io.BufferedReader(new java.io.FileReader(args[0]));
        sc = new Yylex(in);
        p = new parser(sc);
        sroot = p.parse();

        System.out.println("Analisis lexico y sintactico correctos");
        
        programa = (Prog) sroot.value;
        programa.computeAH1();
        programa.computeTyp();
        System.out.println("Analisis Semantico correcto");
      } catch (IOException e) {
        System.out.println("Error abriendo fichero: " + args[0]);
        error = true;
      }
    }
    //Generación de código
    if (!error) {
      programa.computeInd(); //TODO para 
      try {
          String nombreFicheroJava= args[1] + ".java";//nombre del ejecutable 
          BufferedWriter w= new BufferedWriter(new FileWriter(nombreFicheroJava));
          //TODO   w.write("package GeneratedCodeLib;");
          w.newLine(); 
          w.write("public class " + args[1] + " {");
          w.newLine();
          w.newLine(); 
          programa.generateCode(w, "  "); //
          w.newLine(); 
          w.write("}");
          w.newLine(); 
          w.newLine(); 
          w.close();
          System.out.println("Codigo generado en fichero " + nombreFicheroJava);
      } catch(IOException e) {
          System.out.println("Error abriendo fichero: " + args[1] + ".java");
          error= true;
      } 
    }
  }
}
