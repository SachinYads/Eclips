package jdbcapp.service;

import java.util.List;

import jdbcapp.dao.CustomerDao;
import jdbcapp.dao.CustomerDaoImpl;
import jdbcapp.dto.Customer;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDao customerDao = new CustomerDaoImpl();

	public Customer getCustomerById(Integer customerId) {
		return customerDao.getCustomerById(customerId);
	}

	public List<Customer> getAllCustomers() {
		return customerDao.getAllCustomers();
	}

//create
	public Integer addCustomer(Customer customer) {
		return customerDao.addCustomer(customer);
	}

	// Update
	public Integer updateCustomer(Customer customer) {
		return customerDao.updateCustomer(customer);

	}

	// Delete
	public Integer deleteCustomer(Customer customer) {
		return customerDao.deleteCustomer(customer);
	}
	public void addCustomerUsingSP(Customer customer) {
		customerDao.addCustomerUsingSP(customer);

	}

	

}
