package autowiringxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext con1 =new ClassPathXmlApplicationContext("autowiringxml/autowired.xml");
      Employee emp1=con1.getBean("emp1",Employee.class);
      System.out.println(emp1);
	}

}
