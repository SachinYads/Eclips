package loadingsourcebundleexample.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		 ApplicationContext ap= new ClassPathXmlApplicationContext("spring-hello.xml");
		 HelloWorld helloworld= (HelloWorld)ap.getBean("helloBean");
         System.out.println(helloworld.getMessage1());
         System.out.println(helloworld.getMessage2());

         
	}
}
