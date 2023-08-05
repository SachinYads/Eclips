package com.map;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Questions {
	@Id
	@Column(name="question_id")
	private int questionId;
	private String questions;
	@OneToMany(mappedBy="question" ,fetch=FetchType.EAGER)
	private List< Answer> answers;
	
		public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}

		public int getQuestionId() {
			return questionId;
		}

		public void setQuestionId(int questionId) {
			this.questionId = questionId;
		}

		public String getQuestions() {
			return questions;
		}

		public void setQuestions(String questions) {
			this.questions = questions;
		}

		public List<Answer> getAnswers() {
			return answers;
		}

		public void setAnswers(List<Answer> answers) {
			this.answers = answers;
		}

		public Questions(int questionId, String questions, List<Answer> answers) {
			super();
			this.questionId = questionId;
			this.questions = questions;
			this.answers = answers;
		}
			

}
