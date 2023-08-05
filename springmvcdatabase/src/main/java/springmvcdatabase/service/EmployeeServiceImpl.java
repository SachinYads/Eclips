package springmvcdatabase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvcdatabase.dao.EmployeeDAO;
import springmvcdatabase.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
@Autowired
EmployeeDAO employeeDao;
	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
    employeeDao.save(employee);
	}

	@Override
	public Employee getById(int id) {
		// TODO Auto-generated method stub
		return employeeDao.getById( id);
	}

	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.update( employee);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		employeeDao.deleteById( id);
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return employeeDao.getAll();
	}

}
