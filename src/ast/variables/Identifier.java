package ast.variables;

import org.antlr.v4.runtime.ParserRuleContext;

public abstract class Identifier extends NumericTermAbstractChild<Double>{
    public double value;

    @Override
    public Double getValue() {
        return super.getValue();
    }

    @Override
    public void setValue(Double value) {
        super.setValue(value);
    }

    public Identifier(ParserRuleContext parserRuleContext) {
        super(parserRuleContext);
        setValue(value);
    }

}
