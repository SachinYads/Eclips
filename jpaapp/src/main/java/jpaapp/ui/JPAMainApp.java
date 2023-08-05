package jpaapp.ui;


import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import jpaapp.entities.Department;
import jpaapp.entities.Employee;
import jpaapp.utility.HibernateUtility;

public class JPAMainApp {

	public static void main(String[] args) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		Department dept = session.find(Department.class, 2);
		/**
		Department dept = new Department();	
		dept.setDeptName("Marketing");
		**/
		Employee emp = new Employee();
		emp.setFirstName("Suraj");
		emp.setLastName("Kumar");
		emp.setSalary(9911115.55);
		emp.setDepartment(dept);


		Employee emp1 = new Employee();
		emp1.setFirstName("Mahesh");
		emp1.setLastName("Kumar");
		emp1.setSalary(911444.55);
		emp1.setDepartment(dept);

		Set<Employee> empSet = new HashSet<Employee>();
		empSet.add(emp1);
		empSet.add(emp);

		dept.setEmployees(empSet);
		session.persist(dept);
		/**
		//Find 
		Employee employee = session.find(Employee.class, 4);
		System.out.println(employee);
	**/
		session.getTransaction().commit();
	}

}