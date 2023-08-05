package beanlifecycleSelfStudy.forxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Driver {

	public static void main(String[] args) {
		ApplicationContext con1 =new ClassPathXmlApplicationContext("bean.xml");
		Samosa Impl = (Samosa)con1.getBean("life");
		System.out.println(Impl);
	
		


	}

}
