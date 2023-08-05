package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Student;
//get and load method
//get -If we use get method and the id will not present in a table so they return null
//Load- When we use load method so they not return null they return  object not found expection
public class FetchDemo {
	 public static void main( String[] args )
	    {
	        System.out.println( "ProjectStarted" );
	        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	        Session session=factory.openSession();
	        //For get the details of student by id 
	        Student student=(Student)session.get(Student.class, 100);
	        System.out.println(student.getName());
	        System.out.println(student);
	          
	       session.close();
	       factory.close();
	       }
}