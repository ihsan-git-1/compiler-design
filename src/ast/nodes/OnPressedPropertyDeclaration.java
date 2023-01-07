package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class OnPressedPropertyDeclaration {


    List<StatementDeclaration> statementDeclaration;

    public List<StatementDeclaration> getStatementDeclaration() {
        return statementDeclaration;
    }
    public OnPressedPropertyDeclaration(){
        statementDeclaration = new ArrayList<>();
    };

    @Override
    public String toString() {
        return "\nonPressed("
                +statementDeclaration
                +")"
                ;
    }
}
