package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Questions question1=new Questions();
		question1.setQuestionId(326);
		question1.setQuestions("How are you");
		
		/*Answer answer1=new Answer();
		answer1.setAnswer("I am fine");
		answer1.setAnswerId(75);
		answer1.setQuestion(question1);
		
		Answer answer2=new Answer();
		answer2.setAnswer("we all are good");
		answer2.setAnswerId(53);
		answer2.setQuestion(question1);
		
		Answer answer3=new Answer();
		answer3.setAnswer("we have to do something");
		answer3.setAnswerId(364);
		answer3.setQuestion(question1);
		
		Answer answer4=new Answer();
		answer4.setAnswer("we also ignore all one");
		answer4.setAnswerId(913);
		answer4.setQuestion(question1);
		
		List<Answer>list=new ArrayList<Answer>();
		list.add(answer1);
		list.add(answer2);
		list.add(answer3);
		list.add(answer4);
	    question1.setAnswers(list);*/

		Session s=factory.openSession();
		
		//Transaction tx=s.beginTransaction();
		//s.save(question1);
		//s.save(answer1);
		//s.save(answer2);
		//s.save(answer3);
		//s.save(answer4);
		Questions q=(Questions) s.get(Questions.class, 326);
		System.out.println(q.getQuestionId());
		System.out.println(q.getQuestions());
		//tx.commit();
		s.close();

		
		
        factory.close();

	}

}
