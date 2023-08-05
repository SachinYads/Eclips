package classwork11082022.service;

import java.util.List;

import classwork11082022.dao.CustomerDAO;
import classwork11082022.dao.CustomerDAOImpl;
import classwork11082022.dto.Customer;
import classwork11082022.exceptions.CustomerNotFoundException;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDAO customerDao = new CustomerDAOImpl();
	@Override
	public Customer addCustomer(Customer customer) {
		return customerDao.addCustomer(customer);
	}

	@Override
	public Customer getCustomerById(Integer customerId) throws CustomerNotFoundException {

		return customerDao.getCustomerById(customerId);
	}

	@Override
	public List<Customer> getCustomers() {

		return customerDao.getCustomers();
	}

	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCustomer(Customer customer) {
		return null;
	}

	@Override
	public String deleteCustomerById(Integer customerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
 