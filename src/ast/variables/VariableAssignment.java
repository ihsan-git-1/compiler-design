package ast.variables;

public abstract class VariableAssignment extends VariableDeclaration {

    public VariableAssignment(int line, String parent, String type, int childCount) {
        super(line, parent, type, childCount);
    }
}
