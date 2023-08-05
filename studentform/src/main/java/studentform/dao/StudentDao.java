package studentform.dao;

import java.util.List;

import studentform.entity.Student;
public interface StudentDao {
	//add
		public void addStudent(Student stud);
		//update
	    public void updateStudent(Student stud);
	    //delete
	    public void deleteStudent(int id);
	    //get by Id
	    public Student getStudentById(int id);
	    //get all student
	    public  List<Student> getAllStudent();
	    

}

