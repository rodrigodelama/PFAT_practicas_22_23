package AST;

public class Prog {
    public final String identifier;
    public final Inp input;
    public final Vars variables;
    public final Size size;
    public final Sent sentence;

    public Prog(String identifier, Inp input, Vars variables, Size size, Sent sentence) {
        this.identifier = identifier;
        this.input = input;
        this.variables = variables;
        this.size = size;
        this.sentence = sentence;
    }
}
