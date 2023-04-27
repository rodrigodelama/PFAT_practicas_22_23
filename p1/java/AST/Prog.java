package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Errors.CompilerExc;

public class Prog {
    public final String identifier;
    public final Inp input;
    public final Vars variables;
    public final Size size;
    public final Sentencia sentence;
    private int args_length;

    public Prog(String identifier, Inp input, Vars variables, Size size, Sentencia sentence) {
        this.identifier = identifier;
        this.input = input;
        this.variables = variables;
        this.size = size;
        this.sentence = sentence;
    }

    public void computeAH1() throws CompilerExc { //Heredados
        input.computeAH1();
        variables.computeAH1();
    }

    public void computeTyp() throws CompilerExc {
        size.computeStTyp();
        sentence.computeStTyp();
    }

    public void computeInd() throws CompilerExc {
        input.computeInd();
    }

    public int getArgsLength() {
        args_length = input.getArgsLength();
        return args_length;
    }

	public void generateCode(BufferedWriter w, String indent) throws IOException {
        w.write(indent+"public static void main(String args[]) {");
        w.newLine();
        w.write(indent+"    "+"if(args.length != " + (args_length+2) + ") {");// +2 porque empieza en 0 y el nombre del archivo bmp
        w.newLine();
        w.write(indent+"        "+"System.err.println(\"Error: invalid number of arguments\");");
        w.newLine();
        w.write(indent+"        "+"return;");
        w.newLine();
        w.write(indent+"    "+"}");
        w.newLine();    
        input.generateCode(w, indent+ " ");
        size.generateCode(w, indent+"   ");
        variables.generateCode(w, indent+"   ");
        sentence.generateCode(w, indent+"   ");
        w.newLine();
   
        w.write(indent+"int[] flatArray = Flatt_Array.flatten2DArray(array);");
        w.newLine();
        w.write(indent+"BMP_Gen.map2BMP(alto_size, ancho_size, flatArray, args[");
        w.write(args_length+1 + "]);");
        w.newLine();
        w.write("  }");
        w.newLine();
    }

}
