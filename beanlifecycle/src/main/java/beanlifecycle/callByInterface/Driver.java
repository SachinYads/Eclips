package beanlifecycle.callByInterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("bean.xml");
				Book book = (Book) context.getBean("bookBean");
				System.out.println(book.getBookName());
				((AbstractApplicationContext) context).registerShutdownHook();
	}

}
