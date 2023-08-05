package com.spring.jdbc.com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Spring jdbc code is started" );
        // when we are use configuration.xml file then
      //  ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/com/spring/jdbc/configuration.xml");
       // StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
                //For insert
       // Student student1=new Student();
        //student1.setId(226);
        //student1.setName("sachin");
        //student1.setCity("jaunpur");
        
       // int result=studentDao.insert(student1);
       // System.out.println("Student details"+result);
        //For update the data
       // Student student1=new Student();
       // student1.setId(226);
       // student1.setName("rishu");
        //student1.setCity("kanpur");
        
        //int result=studentDao.change(student1);
        //System.out.println("Student details"+result);
        
        //For delete the data
       // int result=studentDao.delete(226);
       // System.out.println("Student details"+result);
       // Student student=studentDao.getStudent(123);
       // System.out.println(student);
       // List<Student>students=studentDao.getAllStudent();
      //  for(Student s:students) {
       // 	System.out.println(s);
       // }
        
        // Without using xml file
        ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
        //For insert
         Student student1=new Student();
         student1.setId(388);
          student1.setName("Raju");
         student1.setCity("rajakpur");

          int result=studentDao.insert(student1);
           System.out.println("Student details"+result);
        
    }
}
