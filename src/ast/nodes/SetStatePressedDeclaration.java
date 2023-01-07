package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class SetStatePressedDeclaration {


    List<StatementDeclaration> statementDeclaration;

    public List<StatementDeclaration> getStatementDeclaration() {
        return statementDeclaration;
    }

    public SetStatePressedDeclaration(){
        statementDeclaration = new ArrayList<>();
    };

    @Override
    public String toString() {
        return "\nsetState"
                +statementDeclaration
                ;
    }

}
