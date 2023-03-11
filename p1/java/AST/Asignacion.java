package AST;

public class Asignacion implements Sentencias {
    public final String id;
    public final Exp e;

    public Asignacion(String id, Exp e) {
        this.id = id;
        this.e = e;
    }
}