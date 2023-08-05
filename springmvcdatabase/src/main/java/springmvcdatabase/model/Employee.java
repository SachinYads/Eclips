package springmvcdatabase.model;

public class Employee {
private int id;
private String name;
private String role;
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @return the role
 */
public String getRole() {
	return role;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @param role the role to set
 */
public void setRole(String role) {
	this.role = role;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", role=" + role + "]";
}
}
