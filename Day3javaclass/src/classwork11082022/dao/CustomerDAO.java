package classwork11082022.dao;

import java.util.List;

import classwork11082022.dto.Customer;
import classwork11082022.exceptions.CustomerNotFoundException;

public interface CustomerDAO {
	//CRUD- Create,Retrieve, Update and Delete operation
	//Create
	public Customer addCustomer(Customer customer);

	//Retrieve
	public Customer getCustomerById(Integer customerId) throws CustomerNotFoundException;

	//Retrieve all customers
	public List<Customer> getCustomers();

	//Update
	public Customer updateCust(Customer customer) throws CustomerNotFoundException;

	//Delete
	public String deleteCustomer(Customer customer);

	public String deleteCustomerById(Integer customerId);

}