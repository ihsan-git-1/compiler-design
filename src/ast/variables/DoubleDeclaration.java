package ast.variables;

public class DoubleDeclaration extends VariableDeclaration {
    String name;
    AddDoubleExpression expr;

    public DoubleDeclaration(String name, int line, String parent,String type,int childCount) {
        super(line, parent, type, childCount);
        this.name = name;
    }

    public DoubleDeclaration(AddDoubleExpression expr, String name, int line, String parent,String type,int childCount) {
        super(line, parent, type, childCount);
        this.expr = expr;
        this.name = name;
    }

    @Override
    public String toString() {
        if (expr != null) {
            return "Double Declaration: "+"name:" +name + " value: "+expr.value.num +" line: "+ getLine() + " Parent: "+ getParent()
                    +" Child Count =  "+getChildCount()+" Type = "+getType()+"\n"
                    +expr;
        }
        return "\n";
    }
}
