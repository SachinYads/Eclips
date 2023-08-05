package come.prodapthelloworld.main;
import java.time.LocalDate;
public class Employee {
	private int empId;
	private String empName;
	private LocalDate dateOfJoinig;
	private String designation;
	private LocalDate dateOfJoining;
	public double salary;
  
	public void displayEmployeeDetails() {
		
		System.out.println(empId+empName+dateOfJoining+designation);
	}
	public double increaseSalary(double percentage,double salary) {
		double increasedSal = (1+percentage)*salary;
		return increasedSal;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public LocalDate getDateOfJoinig() {
		return dateOfJoinig;
	}
	public void setDateOfJoinig(LocalDate dateOfJoinig) {
		this.dateOfJoinig = dateOfJoinig;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int empId, String empName, LocalDate dateOfJoinig, String designation, LocalDate dateOfJoining,
			double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dateOfJoinig = dateOfJoinig;
		this.designation = designation;
		this.dateOfJoining = dateOfJoining;
		this.salary = salary;
	}
}
