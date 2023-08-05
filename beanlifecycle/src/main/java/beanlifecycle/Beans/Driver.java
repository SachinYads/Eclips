package beanlifecycle.Beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context1 =new ClassPathXmlApplicationContext("beans.xml");
				AwareBean awareBeanImpl = (AwareBean) context1.getBean("awareBean");
				((AbstractApplicationContext) context1).registerShutdownHook();
	}

}
