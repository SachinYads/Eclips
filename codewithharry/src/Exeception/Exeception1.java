package Exeception;

public class Exeception1 {

	public static void main(String[] args) {
   
    System.out.println("Started the code");
    try {
    	 int n1 = 23;
         int n2 = 34;
         System.out.println("We have got two number");
    	  int result=n1/n2;
    	System.out.println("Divident number"+result);
    }catch(ArithmeticException e) {
    	System.out.println("please enter valid no.");
    }
	}

}
