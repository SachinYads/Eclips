package claswork10082022;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class EmployeeDemo {

	public static void main(String[] args) {
		 Employee Employee1= new Employee(123,"Sachin",23,15000000.00,"Finance","Manager");
		 Employee Employee2= new Employee(124,"sagar",24,450000.00,"IT","Assosiate");
         Employee Employee3= new Employee(125,"suraj",25,750000.00,"Marketing","Sr Assosiate");
         Employee Employee4= new Employee(126,"subham",26,850000.00,"Finance","Manager");
		 Employee Employee5= new Employee(127,"saket",27,950000.00,"IT","Assosiate");
		 Employee Employee6= new Employee(128,"samauya",23,150000.00,"Marketing","Manager");
		 Employee Employee7= new Employee(129,"vikash",24,450000.00,"Finance","Sr Assosiate");
		 Employee Employee8= new Employee(130,"ravi",40,250000.00,"Finance","Director");
		 Employee Employee9= new Employee(140,"rishi",45,350000.00,"IT","VP");
		 Employee Employee10= new Employee(143,"sudhakar",21,850000.00,"Market","Director");

	        
	        List<Employee> EmployeeList = new ArrayList<Employee> ();
	        EmployeeList.add(Employee1);
	        EmployeeList.add(Employee2);
	        EmployeeList.add(Employee3);
	        EmployeeList.add(Employee4);
	        EmployeeList.add(Employee5);
	        EmployeeList.add(Employee6);
	        EmployeeList.add(Employee7);
	        EmployeeList.add(Employee8);
	        EmployeeList.add(Employee9);
	        EmployeeList.add(Employee10);
	        
	        System.out.println("on the basis of jobtitle");
	        EmployeeList.stream()
	        .filter(o->o.getJobTitle().equals("Manager"))
	        .map(Employee::getEmpName)
	        .forEach(System.out::println);
	        
	        
	        System.out.println("");
	        System.out.println("on the basis of department");
	        
	        EmployeeList.stream()
	        .filter(o->o.getDepartment().equals("IT"))
	        .map(Employee::getEmpName)
	        .forEach(System.out::println);
	        
	        
	        System.out.println("");
	        
	        
	        System.out.println("max salary");
	        System.out.println(EmployeeList.stream()
	        .filter(o->o.getDepartment().equals("IT"))
	        .max(Comparator.comparing(Employee::getSalary)));
	       System.out.println("");
	       
	       
	       EmployeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(5).forEach(System.out::println);
	     
	       
	       System.out.println("");
	       System.out.println("all Director");
	       EmployeeList.stream()
	        .filter(o->o.getJobTitle().equals("Direcotr"))
	        .map(Employee::getEmpName)
	        .forEach(System.out::println);
	}

	

	

}
