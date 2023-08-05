package springexamples.reading.config;

public class Customer {
 private Integer customerId;
 private String customerName;
 private Address address;
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
@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", address=" + address + "]";
}
}
