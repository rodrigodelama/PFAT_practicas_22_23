package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Errors.CompilerExc;

public class Vars2 implements Vars {
    public void computeAH1() throws CompilerExc {
        // No es necesario hacer nada ya que la producción lambda no tiene efectos sobre el atributo heredado
    }
    public void generateCode(BufferedWriter w, String tabs) throws IOException {
        // No es necesario hacer nada ya que la producción lambda no tiene efectos sobre el atributo heredado
    }
}
