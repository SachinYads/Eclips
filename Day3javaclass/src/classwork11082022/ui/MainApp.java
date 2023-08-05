package classwork11082022.ui;

import classwork11082022.dto.Customer;
import classwork11082022.exceptions.CustomerNotFoundException;
import classwork11082022.service.CustomerService;
import classwork11082022.service.CustomerServiceImpl;

public class MainApp {

	public static void main(String[] args) throws CustomerNotFoundException {
		Customer cust = new Customer(1, "Sparsh", "Cawnpore");
		Customer cust1 = new Customer(2, "Suraj", "Aligarh");
		Customer cust2 = new Customer(3, "Rehan", "Dehradun");

		CustomerService customerService = new CustomerServiceImpl();
		customerService.addCustomer(cust);
		customerService.addCustomer(cust1);
		customerService.addCustomer(cust2);
		System.out.println(customerService.getCustomers());
		try {
			System.out.println(customerService.getCustomerById(4));
		} catch (CustomerNotFoundException e) {

			System.out.println("No customer with given id is found");
		}
		
		cust2.setCity("New Delhi");
		CustomerService.updateCustomer(cust2);
		System.out.println(customerService.getCustomers());
		System.out.println(customerService.getCustomers());
		
	}

}
