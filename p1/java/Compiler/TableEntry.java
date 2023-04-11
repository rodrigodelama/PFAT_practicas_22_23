package Compiler;

public class TableEntry {
    private String name;
    private int type;

    public TableEntry(String n, int type) {
        this.name = n;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getType() {
        return type;
    }
}
