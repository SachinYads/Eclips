package claswork10082022;

public class EmployeeClasswork {
	// Management has decided to increase the salary of all the employees of IT
	// department with 10%
	public static void main(String[] args) {
		Employee1 e = new Employee1(11, "Jyotika", 15500.00, "Marketing");
		Employee e1 = new Employee1(12, "Nidhi", 25500.00, "IT");
		Employee e2 = new Employee1(13, "Suman", 11500.00, "Finance");
		Employee e3 = new Employee1(14, "Payas", 12500.00, "IT");
		Employee e4 = new Employee1(15, "Aparna", 5500.00, "Marketing");
		Employee e5 = new Employee1(16, "Anjali", 7500.00, "Operations");
		Employee e6 = new Employee1(17, "Aditya", 19500.00, "Finance");
		Employee e7 = new Employee1(18, "Ayush", 18500.00, "IT");

		List<Employee> listOfEmployee = new ArrayList<Employee>();
		listOfEmployee.add(e);
		listOfEmployee.add(e1);
		listOfEmployee.add(e2);
		listOfEmployee.add(e3);
		listOfEmployee.add(e4);
		listOfEmployee.add(e5);
		listOfEmployee.add(e6);
		listOfEmployee.add(e7);
		System.out.println(listOfEmployee);

		List<Double> listOfITDeptSalaries = listOfEmployee.stream()
				.filter(o -> o.getDepartment().equals("IT"))
				.map(o -> o.getSalary() * 1.10).collect(Collectors.toList());

		listOfITDeptSalaries.forEach(System.out::println);

		double totalSalariesOfIT = listOfITDeptSalaries.stream().reduce(0.0, (x, y) -> x + y);
		System.out.println(totalSalariesOfIT);

		List<Employee> listOfEmployeeWithIncreasedSalary = listOfEmployee.stream()
				.filter(emp -> emp.getDepartment().equals("IT"))
				.map(emp -> {
						emp.setSalary(emp.getSalary() * 1.10);
						return emp;
					})
				.collect(Collectors.toList());

			listOfEmployeeWithIncreasedSalary.forEach(System.out::println);

	}

}