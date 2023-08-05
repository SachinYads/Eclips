package autowireByName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		Employee emp = context.getBean("emp", Employee.class);
		System.out.println(emp.getName());

	}
}
