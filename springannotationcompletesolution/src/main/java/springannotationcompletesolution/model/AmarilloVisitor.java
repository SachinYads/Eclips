package springannotationcompletesolution.model;

public class AmarilloVisitor {
private String name;
private String greeting;

public AmarilloVisitor() {
	this.name="haudy";
	this.greeting="holy Day";
}
public String getName() {
	// TODO Auto-generated method stub
	return name;
}

public String getGreeting() {
	// TODO Auto-generated method stub
	return greeting;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @param greeting the greeting to set
 */
public void setGreeting(String greeting) {
	this.greeting = greeting;
}

}
