package beanlifecycle.BookCustomBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context3 =
				new ClassPathXmlApplicationContext("beanconfig.xml");
				BookCustomBean bookCustomBean = (BookCustomBean) context3.getBean("customLifeCycleBookBean");
				((AbstractApplicationContext) context3).registerShutdownHook();
	}

}
