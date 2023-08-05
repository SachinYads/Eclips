package jdbcapp.dto;

import java.time.LocalDate;

public class Customer {
private Integer customerId;
private String customerName;
private LocalDate birthDate;
private Long mobile;
private String email;

public Customer() {
	
}

public Customer(Integer customerId, String customerName, LocalDate birthDate, Long mobile, String email) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.birthDate = birthDate;
	this.mobile = mobile;
	this.email = email;
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
public  void setCustomerId(Integer customerId) {
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
public  void setCustomerName(String customerName) {
	this.customerName = customerName;
}

/**
 * @return the birthDate
 */
public LocalDate getBirthDate() {
	return birthDate;
}

/**
 * @param birthDate the birthDate to set
 */
public void setBirthDate(LocalDate birthDate) {
	this.birthDate = birthDate;
}

/**
 * @return the mobile
 */
public Long getMobile() {
	return mobile;
}

/**
 * @param mobile the mobile to set
 */
public void setMobile(Long mobile) {
	this.mobile = mobile;
}

/**
 * @return the email
 */
public String getEmail() {
	return email;
}

/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}

@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", birthDate=" + birthDate
			+ ", mobile=" + mobile + ", email=" + email + "]";
}



}
