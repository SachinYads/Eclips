package autowireByName;

public class Employee {
String name;
Address address;
Address address1;
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the address
 */
public Address getAddress() {
	return address;
}
/**
 * @param address the address to set
 */
public void setAddress(Address address) {
	this.address = address;
}
/**
 * @return the address1
 */
public Address getAddress1() {
	return address1;
}
/**
 * @param address1 the address1 to set
 */
public void setAddress1(Address address1) {
	this.address1 = address1;
}

}
