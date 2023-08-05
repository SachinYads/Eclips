package assignment5;

import java.util.ArrayList;
import java.util.Scanner;

public class Assign2 {

	public static void main(String[] args) {
    ArrayList<String> names=new ArrayList<String>();
    names.add("Sachin");
    names.add("Ravi");
    names.add("Rakesh");
    names.add("Ravikant");
    names.add("Srikant");
    boolean flag = false;
    Scanner sc= new Scanner(System.in);
    System.out.println("enter name:");
    String st=sc.next();
    for(String it:names) {
    	if(it.equals(st)) {
    		System.out.println("Hello"+st);
    		flag=true;
    		break;
    	}
    }
    if(flag==false)
    	System.out.println("sorry name not found");
    sc.close();
	}

}
