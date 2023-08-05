package assignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDemo {
			public static void main(String[] args) {
				
				Employee e1= new Employee("sachin",21,50000.00);
				Employee e2= new Employee("ravi",25,40000.00);
				List<Employee> EmployeeList = new ArrayList<Employee> ();
				EmployeeList.add(e1);
				EmployeeList.add(e2);
				System.out.println("Sort basis of  Name");
				Collections.sort(EmployeeList,new EmployeeNameComparator());
				System.out.println(EmployeeList);
				System.out.println("Sort basis of Age");
				Collections.sort(EmployeeList,new EmpoloyeeAgeComperator());
				System.out.println(EmployeeList);
				System.out.println("Sort basis of salary");
				Collections.sort(EmployeeList,new EmployeeSalaryComperator());
				System.out.println(EmployeeList);
				
			}
		
	}


