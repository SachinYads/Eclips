package springcollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext ap= new ClassPathXmlApplicationContext("beans.xml");
		 FilmDirectors F1= (FilmDirectors)ap.getBean("filmDirectors");
		 F1.getDirecotrMap();
		 
		 F1.getDirecorList();
		 System.out.println(F1);
	}

}
