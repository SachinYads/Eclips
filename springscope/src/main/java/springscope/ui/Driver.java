package springscope.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springscope.bean.CustomerService;

public class Driver {

	public static void main(String[] args) {
		 ApplicationContext ap= new ClassPathXmlApplicationContext("springconfig.xml");
		 CustomerService cust1= (CustomerService)ap.getBean("springscope");

     // Set the name
     cust1.setCustomerName("Sachin Yadav");

     System.out.println("Hello world (hello1)" + " Your name is: " + cust1.getCustomerName());
     CustomerService cust2= (CustomerService)ap.getBean("springscope");

     // Set the name
     cust2.setCustomerName("Ravi Mishra");

     System.out.println("Hello world (hello1)" + " Your name is: " + cust2.getCustomerName());
     
     
     System.out.println(
             "'cust1' and 'cust2'"+ "are referring "+ "to the same object: "+ (cust1 == cust2));
     
     System.out.println( "Address of object cust1: " + cust1);
      System.out.println("Address of object cust2: "+ cust2);
	}

}
