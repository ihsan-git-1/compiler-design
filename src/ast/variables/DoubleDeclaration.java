package ast.variables;

public class DoubleDeclaration extends VariableDeclaration {
    String name;
    AddDoubleExpression expr;

    public DoubleDeclaration(String name, int line, String parent) {
        super(line, parent);
        this.name = name;
    }

    public DoubleDeclaration(AddDoubleExpression expr, String name, int line, String parent) {
        super(line, parent);
        this.expr = expr;
        this.name = name;
    }

    @Override
    public String toString() {
        if (expr != null) {
            return "Double Declaration: "+"name:" +name + " value: "+expr.value.num +" line: "+ getLine() + " parent: "+ getParent()+"\n"+expr;
        }
        return "\n";
    }
}
