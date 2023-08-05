/**
 * 
 */
package jdbcapp.service;

import java.util.List;

import jdbcapp.dto.Customer;

public interface CustomerService {
				//Create
	//Retrieve

	public Customer getCustomerById(Integer customerId);
	public List<Customer> getAllCustomers();
//create
		public Integer addCustomer(Customer customer);



		//Update
		public Integer updateCustomer(Customer customer) ;
		//Delete
		public Integer deleteCustomer(Customer customer);
		public void addCustomerUsingSP(Customer customer);


}
