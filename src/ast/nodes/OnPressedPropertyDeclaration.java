package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class OnPressedPropertyDeclaration extends Node{


    List<Statement> statement;

    public List<Statement> getStatement() {
        return statement;
    }
    public OnPressedPropertyDeclaration(int line,String parent,String type,int childCount){
        super(line,parent,type,childCount);
        statement = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "\nonPressed "+" line: "+getLine() + " parent "+getParent()+
                " Child Count =  "+getChildCount()+" Type = "+getType()+"\n"
                + statement
                ;
    }
}
