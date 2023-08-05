package come.prodapthelloworld.main;

public class Student {
	private String StudentName;
	private int StudentRollno;
public void displayStudentDetails() {
		
		System.out.println(StudentName+StudentRollno);
	}

	public String getStudentName() {
	return StudentName;
}

public void setStudentName(String studentName) {
	StudentName = studentName;
}

public int getStudentRollno() {
	return StudentRollno;
}

public void setStudentRollno(int studentRollno) {
	StudentRollno = studentRollno;
}

	@Override
	public String toString() {
		return "Student [StudentName=" + StudentName + ", StudentRollno=" + StudentRollno + "]";
	}

}
