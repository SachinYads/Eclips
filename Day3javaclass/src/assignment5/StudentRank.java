package assignment5;

import java.util.ArrayList;
import java.util.List;

import classwork02082022.Student;

public class StudentRank {

	public StudentRank(int i) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
       Object S1=new StudentRank(9);
       Object S2=new StudentRank(1);
       Object S3=new StudentRank(6);
       Object S4=new StudentRank(8);
       Object S5=new StudentRank(2);
       Object S6=new StudentRank(4);
       Object S7=new StudentRank(7);
       Object S8=new StudentRank(3);
       Object S9=new StudentRank(4);
       Object S10=new StudentRank(5);
       List<Student> StudentList = new ArrayList<Student> ();
       StudentList.add((Student) S1);
	   StudentList.add((Student) S2);
	   StudentList.add((Student) S3);
	   StudentList.add((Student) S4);
	   StudentList.add((Student) S5);
	   StudentList.add((Student) S6);
	   StudentList.add((Student) S7);
	   StudentList.add((Student) S8);
	   StudentList.add((Student) S9);
	   StudentList.add((Student) S10);
	   System.out.println(StudentList);

       
       
	}

}
