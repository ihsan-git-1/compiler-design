package ast.variables;

public class DoubleDeclaration extends Identifier implements assignment {
    String name;

    public DoubleDeclaration( String name,int line, String parent, String type, int childCount) {
        super(line, parent, type, childCount);
        this.name = name;
    }
}
