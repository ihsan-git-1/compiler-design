package ast.variables;

public class IntegerDeclaration extends VariableDeclaration {
    String name;
    AddExpression expr;

    public IntegerDeclaration(String name, int line, String parent) {
        super(line, parent);
        this.name = name;
    }

    public IntegerDeclaration(AddExpression expr, String name, int line, String parent) {
        super(line, parent);
        this.expr = expr;
        this.name = name;
    }

    @Override
    public String toString() {
        if (expr != null) {
            return "\nint " + name + " = " + expr;
        } else {
            return "Integer Declaration "+expr.value +" line: "+ getLine() + "parent: "+ getParent()+"\n"
                    ;
        }
    }
}	
