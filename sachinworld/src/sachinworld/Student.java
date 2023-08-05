package sachinworld;
import java.time.LocalDate;
public class Student {
           private int studentID;
           protected String studentName;
           LocalDate  dateOfBirth;
           
		public int getStudentID() {
			return studentID;
		}

		public void setStudentID(int studentID) {
			this.studentID = studentID;
		}

		protected String getStudentName() {
			return studentName;
		}

		protected void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		public LocalDate getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(LocalDate dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}

		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
}
