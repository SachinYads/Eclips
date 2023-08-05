package claswork10082022;

public class Employee {
  private int id;
  private String empName;
  private int age;
  private double salary;
  private String jobTitle;
  private String Department;
  public Employee(int id, String empName, int age, double salary, String jobTitle, String department) {
		super();
		this.id = id;
		this.empName = empName;
		this.age = age;
		this.salary = salary;
		this.jobTitle = jobTitle;
		Department = department;
  }
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the empName
 */
public String getEmpName() {
	return empName;
}
/**
 * @param empName the empName to set
 */
public void setEmpName(String empName) {
	this.empName = empName;
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
/**
 * @return the salary
 */
public double getSalary() {
	return salary;
}
/**
 * @param salary the salary to set
 */
public void setSalary(double salary) {
	this.salary = salary;
}
/**
 * @return the jobTitle
 */
public String getJobTitle() {
	return jobTitle;
}
/**
 * @param jobTitle the jobTitle to set
 */
public void setJobTitle(String jobTitle) {
	this.jobTitle = jobTitle;
}
/**
 * @return the department
 */
public String getDepartment() {
	return Department;
}
/**
 * @param department the department to set
 */
public void setDepartment(String department) {
	Department = department;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", empName=" + empName + ", age=" + age + ", salary=" + salary + ", jobTitle="
			+ jobTitle + ", Department=" + Department + "]";
}

  
}
