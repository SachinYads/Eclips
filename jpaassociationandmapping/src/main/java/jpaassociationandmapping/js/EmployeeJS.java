package jpaassociationandmapping.js;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.InheritanceType;

@Entity
@Table(name="employee_js")
//Following annotation must be written only in parent class
@Inheritance(strategy= InheritanceType.JOINED)
public class EmployeeJS {
	private Integer empId;
	private String name;
	private Double salary;
	public EmployeeJS() {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	/**
	 * @return the empId
	 */
	public Integer getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
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
	 * @return the salary
	 */
	public Double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeJS [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
