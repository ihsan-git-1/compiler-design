package ast.nodes;

import ast.NodeType;
import gen.dart_parse;

import java.util.ArrayList;
import java.util.List;

public class OnPressedPropertyDeclaration extends Node{


    List<Statement> statement;

    public List<Statement> getStatement() {
        return statement;
    }
    public OnPressedPropertyDeclaration(dart_parse.OnPressedPropertyDeclarationContext ctx){
        super(ctx);
        statement = new ArrayList<>();
    }

    @Override
    public String toString() {
        return getLineString()+"  onPressed "+ " parent "+getParent()+
                " Child Count =  "+getChildCount()+" Type = "+ NodeType.PROPERTY+"\n"
                + statement
                ;
    }

    @Override
    public String generate_code() {
        StringBuilder builder = new StringBuilder();
        for(Statement child : statement){
            builder.append(child.generate_code());
        }
        return builder.toString();

    }
}
