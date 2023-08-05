package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Certificate;
import com.entity.Student;

public class StateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Solve the object state problem");
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Student students=new Student();
        students.setId(123);
        students.setName("New Name");
        students.setCity("Agara");
        students.setCerti(new Certificate("new java project","2 month"));
        Session s=factory.openSession();
        Transaction tx=s.beginTransaction();

        s.save(students);
        tx.commit();
        factory.close();

	}

}
