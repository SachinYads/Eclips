package come.prodapthelloworld.main;
import java.util.Scanner;
public class Percentagecalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a first subject mark");;
		Scanner subject1=new Scanner(System.in);
		int a =subject1.nextInt();
		System.out.println("enter a second subject mark");;
		Scanner subject2=new Scanner(System.in);
		int b =subject2.nextInt();
		System.out.println("enter a third subject mark");;
		Scanner subject3=new Scanner(System.in);
		int c =subject3.nextInt();
		System.out.println("enter a fourth subject mark");;
		Scanner subject4=new Scanner(System.in);
		int d =subject4.nextInt();
		System.out.println("enter a five subject mark");;
		Scanner subject5=new Scanner(System.in);
		int e =subject5.nextInt();
		System.out.println("total five subject marks");
		int percentage=((a+b+c+d+e)/5);
		System.out.println(percentage);

	}

}
