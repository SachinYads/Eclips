package springannotationcompletesolution.model;

public class JersyVisitor implements Visitor {
    private String name;
    private String greeting;
    
    public JerseyVisitor(){
    	this.name="Bruece Springsteen";
    	this.greeting="Gloary Day";
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
