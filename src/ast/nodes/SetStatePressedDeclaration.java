package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class SetStatePressedDeclaration {


    List<Statement> statement;

    public List<Statement> getStatement() {
        return statement;
    }

    public SetStatePressedDeclaration(){
        statement = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "\nsetState"
                + statement
                ;
    }

}
