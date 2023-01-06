package ast.nodes;

public class WidgetsDeclaration {
	WidgetAbstractChild widgetAbstractChild;
	public WidgetsDeclaration(WidgetAbstractChild widgetAbstractChild) {

		this.widgetAbstractChild = widgetAbstractChild;

	}

	@Override
	public String toString() {
		return "WidgetsDeclaration |"+widgetAbstractChild;
	}
}
