package sachinworld;

public class customer {
private int customerId;
private String customerName;
private Order order;

public int getCustomerId() {
	return customerId;
}

public void setCustomerId(int customerId) {
	this.customerId = customerId;
}

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public Order getOrder() {
	return order;
}

public void setOrder(Order order) {
	this.order = order;
}

@Override
public String toString() {
	return "customer [customerId=" + customerId + ", customerName=" + customerName + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
}
