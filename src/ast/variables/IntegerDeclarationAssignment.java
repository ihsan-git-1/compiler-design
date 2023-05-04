package ast.variables;

public class IntegerDeclarationAssignment extends VariableAssignment {
    String name;
    AddExpression expr;

    public IntegerDeclarationAssignment(AddExpression expr, String name, int line, String parent,String type,int childCount) {
        super(line, parent, type, childCount);
        this.expr = expr;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Integer Declaration Assignment: " +name+" line: "+ getLine() + " parent: "+ getParent()
                +" Child Count =  "+getChildCount()+" Type = "+getType()+"\n"
                + expr;
    }
}
