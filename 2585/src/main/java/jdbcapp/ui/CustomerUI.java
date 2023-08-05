package jdbcapp.ui;

import java.time.LocalDate;

import jdbcapp.dto.Customer;
import jdbcapp.service.CustomerService;
import jdbcapp.service.CustomerServiceImpl;

public class CustomerUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       CustomerServiceImpl customerService=(CustomerServiceImpl) new CustomerServiceImpl();
       System.out.println(customerService.getAllCustomers());
       /**Customer customer1=new Customer(1,"Neha Sharma",LocalDate.of(1991, 05,14 ),999921L,"sach@gmail.com");
       Integer numberOfRowAdd=customerService.addCustomer(customer1);
       System.out.println(numberOfRowAdd);**/
       Customer customer1 = new Customer(3,"Anushka Sharma",LocalDate.of(1991, 10, 15),9999113311L,"anushka.sharma@gmail.com");
		customerService.addCustomerUsingSP(customer1);
	}
	}


