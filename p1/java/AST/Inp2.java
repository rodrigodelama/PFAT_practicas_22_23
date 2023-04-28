package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Errors.CompilerExc;

public class Inp2 implements Inp {
    public void computeAH1() throws CompilerExc {
        // No es necesario hacer nada ya que la producción lambda no tiene efectos sobre el atributo heredado
    }
    public void computeInd() throws CompilerExc {
        // No es necesario hacer nada ya que la producción lambda no tiene efectos sobre el atributo heredado
    }
    public int getArgsLength() {
        // No es necesario hacer nada ya que la producción lambda no tiene efectos sobre el atributo heredado
        return -1; //para el caso de no argumentos
    }
    public void generateCode(BufferedWriter w, String indent) throws IOException {
        // No es necesario hacer nada ya que la producción lambda no tiene efectos sobre el atributo heredado
    }
}
