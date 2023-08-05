package springmvcdatabase.service;

import java.util.List;

import springmvcdatabase.model.Employee;

public interface EmployeeService {
	//Create
		public void save(Employee employee);
		//Read
		public Employee getById(int id);
		//Update
		public void update(Employee employee);
		//Delete
		public void deleteById(int id);
		//Get All
		public List<Employee> getAll();

}
