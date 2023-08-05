package Array;

public class ForEach {

	public static void main(String[] args) {
		//int[]marks= {1,2,3,4,56,7,8,9,4566,7};
		//System.out.println(marks.length);
		//float[]marks= {46f,78f,93f,45f};
		//System.out.println(marks[3]);
		String[]StudentName= {"Sachin","Ravi","Suraj","Shivam","Sagar"};
		System.out.println(StudentName[4]);
		for(int i=0;i<StudentName.length;i++) {
			System.out.println(StudentName[i]);
		}
		System.out.println("Display in revrse order");
		for(int i=StudentName.length-1;i>=0;i--) {
			System.out.println(StudentName[i]);
		}
		System.out.println("For each loop");
		for(String element:StudentName) {
			System.out.println(element);
		}
	}

}
