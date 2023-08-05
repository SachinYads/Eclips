package construtorInjection;

public class Person {
private String name;
private String personId;
public Person(String name, String personId) {
	super();
	this.name = name;
	this.personId = personId;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @return the personId
 */
public String getPersonId() {
	return personId;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @param personId the personId to set
 */
public void setPersonId(String personId) {
	this.personId = personId;
}
@Override
public String toString() {
	return "Person [name=" + name + ", personId=" + personId + "]";
}
}
