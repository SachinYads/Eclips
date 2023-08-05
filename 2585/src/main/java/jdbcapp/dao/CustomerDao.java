package jdbcapp.dao;

import java.util.List;

import jdbcapp.dto.Customer;

public interface CustomerDao {

	public  List<Customer> getAllCustomers();

	public Customer getCustomerById(Integer customerId);

	public Integer updateCustomer(Customer customer);

	public Integer addCustomer(Customer customer);

	public Integer deleteCustomer(Customer customer);
	public void addCustomerUsingSP(Customer customer);


}
