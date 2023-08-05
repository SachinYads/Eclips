package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collections.Emp;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/standalone/collections/standalone.xml");
        Person person2=(Person)context.getBean("person1",Person.class);
        System.out.println(person2);
       System.out.println(person2.getFriends().getClass().getName());

	}

}
