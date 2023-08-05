package springexamples.reading.config;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//configuration metadata
		String springConfigurationFile="springconfig.xml";
		//Instantiating a Spring IoC container
		AbstractApplicationContext context=new ClassPathXmlApplicationContext(springConfigurationFile);
		//Here using context.getBean method we are trying to get an 
		Customer cust=context.getBean("customer",Customer.class);
		System.out.println(cust.getCustomerId());
		System.out.println(cust.getCustomerName());
		System.out.println(cust.getAddress().getCity());
		Address addrs=context.getBean("addrBean1",Address.class);
		System.out.println(addrs);
		Person person=context.getBean("personBean",Person.class);
		System.out.println(person.getResidentialAddress());
		System.out.println(person.getPermanentAddress());

		context.close();

	}

}
