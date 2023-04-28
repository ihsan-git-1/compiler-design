package ast.variables;

public class DoubleDeclarationAssignment extends VariableDeclaration {
    String name;
    AddDoubleExpression expr;

    public DoubleDeclarationAssignment(AddDoubleExpression expr, String name, int line, String parent,String type,int childCount) {
        super(line, parent, type, childCount);
        this.expr = expr;
        this.name = name;
    }

    @Override
    public String toString() {
            return "Double Declaration Assignment: "+"name:" +name + " value: "+expr.value.num +" line: "+ getLine() + " Parent: "+ getParent()
                    +" Child Count =  "+getChildCount()+" Type = "+getType()+"\n"
                    +expr;
    }
}
