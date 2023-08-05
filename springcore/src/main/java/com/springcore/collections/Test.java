package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/cconfig.xml");
        Emp employees=(Emp)context.getBean("emp1");
        System.out.println(employees.getName());
        System.out.println(employees.getAddresses());
        System.out.println(employees.getPhones());
        System.out.println(employees.getCourses());

	}

}
