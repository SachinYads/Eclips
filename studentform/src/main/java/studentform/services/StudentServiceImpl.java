package studentform.services;

import java.util.List;

import studentform.dao.StudentDao;
import studentform.dao.StudentDaoImpl;
import studentform.entity.Student;

public class StudentServiceImpl implements StudentService {
	StudentDao studDao = new StudentDaoImpl();

	public void addStudent(Student stud) {
		// TODO Auto-generated method stub
		studDao.addStudent(stud);

	}

	public void updateStudent(Student stud) {
		// TODO Auto-generated method stub
		studDao.updateStudent(stud);

	}

	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		studDao.deleteStudent(id);

	}

	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return studDao.getStudentById(id);

	}

	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studDao.getAllStudent();
	}


	

}
