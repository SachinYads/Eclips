package springexamples.reading.config;

public class Address {
private Integer addressId;
private String city;
private String state;
private String country;
/**
 * @return the addressId
 */
public Integer getAddressId() {
	return addressId;
}
/**
 * @param addressId the addressId to set
 */
public void setAddressId(Integer addressId) {
	this.addressId = addressId;
}
/**
 * @return the city
 */
public String getCity() {
	return city;
}
/**
 * @param city the city to set
 */
public void setCity(String city) {
	this.city = city;
}
/**
 * @return the state
 */
public String getState() {
	return state;
}
/**
 * @param state the state to set
 */
public void setState(String state) {
	this.state = state;
}
/**
 * @return the country
 */
public String getCountry() {
	return country;
}
/**
 * @param country the country to set
 */
public void setCountry(String country) {
	this.country = country;
}
@Override
public String toString() {
	return "Address [addressId=" + addressId + ", city=" + city + ", state=" + state + ", country=" + country + "]";
}
}
