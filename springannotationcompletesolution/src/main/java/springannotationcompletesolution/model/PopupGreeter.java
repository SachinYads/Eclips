package springannotationcompletesolution.model;

public class PopupGreeter implements Greeter {
private Visitor visitor;

public Visitor getVisitor() {
	return visitor;
}

@Override
public void setVisitor(Visitor v) {
	System.out.println("visitor set to"+visitor);
	this.visitor=v;
}

	public void greet() {
    JOptionPane.showMessageDialog(null,visitor.getGreeting());
	}


}
