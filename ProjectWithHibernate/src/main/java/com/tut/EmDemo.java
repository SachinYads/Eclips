package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Certificate;
import com.entity.Student;

public class EmDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
        Student student1=new Student();
        student1.setId(14213);
        student1.setName("Sachin");
        student1.setCity("jaunpur");
        Certificate certificate=new Certificate();
        certificate.setCourse("javacourse");
        certificate.setDuration("2 month");
        student1.setCerti(certificate);
        
        Student student2=new Student();
        student2.setId(23213);
        student2.setName("Rishu");
        student2.setCity("Kanpur");
        Certificate certificate1=new Certificate();
        certificate.setCourse("pythoncourse");
        certificate.setDuration("3 month");
        student2.setCerti(certificate1);
        
        Session s=factory.openSession();
        Transaction tx=s.beginTransaction();
        s.save(student1);
        s.save(student2);
        tx.commit();
        s.close();
        factory.close();

        


	}

}
