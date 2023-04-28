package ast.variables;

public class DoubleDeclaration extends VariableAssignment {
    String name;

    public DoubleDeclaration(String name, int line, String parent,String type,int childCount) {
        super(line, parent, type, childCount);
        this.name = name;
    }

    @Override
    public String toString() {
            return "Double Declaration: "+"name:" +name +" line: "+ getLine() + " Parent: "+ getParent()
                    +" Child Count =  "+getChildCount()+" Type = "+getType()+"\n";
    }
}
