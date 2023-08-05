package classwork04082022;

public interface PrintInformation {
// If one single abstract method is present in an interface then this interface will be known as functional interface
	public void printMessage(String message);
	
	
    public void visualInfo();

	
	
	public default void printInfo() {
	    System.out.println("if you hava a any class representive");	
	}
	public static void printInformation() {
	    System.out.println("if you hava a any class representive");	

	}
}
