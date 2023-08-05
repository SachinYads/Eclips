package springexample.dependencyinjection;

public class Customer {
  private Integer customerId;
  private String customerName;
  private IAddress iaddress;
  //Constructor based dependency injection
  //Here address dependency is injected
  public Customer(IAddress iaddress) {
	  this.iaddress=iaddress;
  }
/**
 * @return the customerId
 */
public Integer getCustomerId() {
	return customerId;
}
/**
 * @param customerId the customerId to set
 */
public void setCustomerId(Integer customerId) {
	this.customerId = customerId;
}
/**
 * @return the customerName
 */
public String getCustomerName() {
	return customerName;
}
/**
 * @param customerName the customerName to set
 */
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
/**
 * @return the iaddress
 */
public IAddress getIaddress() {
	return iaddress;
}
/**
 * @param iaddress the iaddress to set
 */
//Setter
public void setIaddress(IAddress iaddress) {
	this.iaddress = iaddress;
}
}
