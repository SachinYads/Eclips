package com.tut;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Address;
import com.entity.Student;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "ProjectStarted" );
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        System.out.println(factory);
        System.out.println(factory.isClosed());
        //create student
        Student stud=new Student();
        stud.setId(100);
        stud.setName("sachin");
        stud.setCity("bengluru");
        System.out.println(stud);
        //Create object of Address
        Address add=new Address();
        add.setStreet("luckwl");
        add.setCity("Jaunpur");
        add.setOpen(true);
        add.setAddDate(new Date());
        add.setX(0.23444);
        //These are give current session
        Session session=factory.openSession();
      //for change in physical database we use transaction and save the data
       Transaction tx= session.beginTransaction();
        session.save(stud);
        session.save(add);
        tx.commit();
        
 
        
        session.close();
        System.out.println("Done");
        
    }
}
