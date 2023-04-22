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
        w.write(indent+"public static void main(String _args[]) {");
        w.newLine();
        w.write(indent+indent+"if(args.length < " + (args_length+2) + ") {");// el +2 es por el tamaño del array args (args_lenght + 1) y por
        //el hecho de que el numero a la derecha de la condicion del if deber ser mayor aun que (args_length + 1) -> (args_length + 2).
        w.newLine();
        w.write(indent+indent+indent+"return;");
        w.newLine();
        w.write(indent+indent+"}");
        w.newLine();
        input.generateCode(w, indent+"  ");
        // argumento.generateCode(w);
        // w.newLine();
        // vars.generateCode(w);
        // w.newLine();
        // sent.generateCode(w);
        w.newLine();
        w.write("  }");
        w.newLine();
    }

}
