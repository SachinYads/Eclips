package assignment3;

public class Friend {
public Friend(String name, String location, int age) {
		super();
		this.name = name;
		Location = location;
		this.age = age;
	}
private String name;
   private String Location;
   private int age;
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
 * @return the location
 */
public String getLocation() {
	return Location;
}
/**
 * @param location the location to set
 */
public void setLocation(String location) {
	Location = location;
}
/**
 * @return the age
 */
public int getAge() {
	return age;
}
/**
 * @param age the age to set
 */
public void setAge(int age) {
	this.age = age;
}
}
