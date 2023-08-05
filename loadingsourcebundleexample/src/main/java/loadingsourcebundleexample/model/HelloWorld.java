package loadingsourcebundleexample.model;

public class HelloWorld {
   private String message1;
   private String message2;
public HelloWorld() {
}
public HelloWorld(String message1, String message2) {
	super();
	this.message1 = message1;
	this.message2 = message2;
}
/**
 * @return the message1
 */
public String getMessage1() {
	return message1;
}
/**
 * @return the message2
 */
public String getMessage2() {
	return message2;
}
/**
 * @param message1 the message1 to set
 */
public void setMessage1(String message1) {
	this.message1 = message1;
}
/**
 * @param message2 the message2 to set
 */
public void setMessage2(String message2) {
	this.message2 = message2;
}
@Override
public String toString() {
	return "HelloWorld [message1=" + message1 + ", message2=" + message2 + "]";
}
   
}
