package springannotationcompletesolution.ui;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {


public static void main(String[] args) {
	// TODO Auto-generated method stub
	//configuration metadata
	String springConfigurationFile="springconfig-annotation.xml";
	//Instantiating a Spring IoC container
	AbstractApplicationContext context=new ClassPathXmlApplicationContext(springConfigurationFile);
	//Here using context.getBean method we are trying to get an
}
}