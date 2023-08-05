package assignment5;

import java.util.ArrayList;
import java.util.Scanner;

public class Assign3 {

	public static void main(String[] args) {
		 Hashset<String> names=new Hashset<String>();
		    names.add("Sachin");
		    names.add("Ravi");
		    names.add("Rakesh");
		    names.add("Ravikant");
		    names.add("Srikant");
		    Scanner sc= new Scanner(System.in);
		    System.out.println("enter name for search");
		    String name=sc.nextLine();
		    	if(name.contains(name)) 
		    		System.out.println("Hello"+name);
		    	else
		    			System.out.println("name not found");
		    	}
		   

}
