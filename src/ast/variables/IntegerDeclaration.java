package ast.variables;

public class IntegerDeclaration extends VariableAssignment {
    String name;
    AddExpression expr;

    public IntegerDeclaration(String name, int line, String parent,String type,int childCount) {
        super(line, parent, type, childCount);
        this.name = name;
    }

    public IntegerDeclaration(AddExpression expr, String name, int line, String parent,String type,int childCount) {
        super(line, parent, type, childCount);
        this.expr = expr;
        this.name = name;
    }

    @Override
    public String toString() {
        if (expr != null) {
            return "Integer Declaration: " +name+" line: "+ getLine() + " parent: "+ getParent()
                    +" Child Count =  "+getChildCount()+" Type = "+getType()+"\n"
                    + expr;
        } else {
            return "\n";
        }
    }
}	
