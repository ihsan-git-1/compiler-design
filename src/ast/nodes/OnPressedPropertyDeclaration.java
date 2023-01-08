package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class OnPressedPropertyDeclaration extends Node{


    List<StatementDeclaration> statementDeclaration;

    public List<StatementDeclaration> getStatementDeclaration() {
        return statementDeclaration;
    }
    public OnPressedPropertyDeclaration(int line,String parent,String type,int childCount){
        super(line,parent,type,childCount);
        statementDeclaration = new ArrayList<>();
    };

    @Override
    public String toString() {
        return "\nonPressed "+" line: "+getLine() + " parent "+getParent()+
                " Child Count =  "+getChildCount()+" Type = "+getType()+"\n"
                +statementDeclaration
                ;
    }
}
