package come.prodapthelloworld.main;

public class EmployeeMain {
	
	
	public static void main(String[] args) {
		Employee.employee =new Employee;
		employee.displayEmployeeDetails();
		Employee emp=new Employee(1,"Rathi",null,"Assosiate",null,50000.00);
		emp.displayEmployeeDetails();
		System.out.println("*************");
		emp.setDesignation("Sr Associate");
		emp.displayEmployeeDetails();
		System.out.println("***************");
		System.out.println(emp.getEmpId());
		System.out.println("****************");
		double incrSal= emp.increaseSalary(.5,emp.getSalary());
		System.out.println("****************");
		emp.setSalary(incrSal);
		emp.displayEmployeeDetails();
		System.out.println(emp);
		
	}

	public EmployeeMain() {
		super();
		// TODO Auto-generated constructor stub
	}

}
