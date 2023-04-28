package ast.variables;

public class BooleanDeclarationAssignment extends VariableDeclaration{
    String name;
    public BooleanValueClass booleanValueClass;

    public BooleanDeclarationAssignment(String name, BooleanValueClass booleanValueClass, int line, String parent,String type,int childCount) {
        super(line ,parent, type, childCount);
        this.name=name;
        this.booleanValueClass=booleanValueClass;
    }

    @Override
    public String toString() {
        return "Boolean Declaration Assignment: " +name+" line: "+ getLine() + " parent: "+ getParent()
                +" Child Count =  "+getChildCount()+" Type = "+getType()
                + " value: " + booleanValueClass +"\n"
                ;
    }
}
