package com.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Answer {
  @Id
  @Column(name="answer_id")
  private int answerId;
  private String answer;
  @ManyToOne
  private Questions question;
public int getAnswerId() {
	return answerId;
}
public void setAnswerId(int answerId) {
	this.answerId = answerId;
}
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}
public Questions getQuestion() {
	return question;
}
public void setQuestion(Questions question) {
	this.question = question;
}
public Answer() {
	super();
	// TODO Auto-generated constructor stub
}
public Answer(int answerId, String answer, Questions question) {
	super();
	this.answerId = answerId;
	this.answer = answer;
	this.question = question;
}
}
