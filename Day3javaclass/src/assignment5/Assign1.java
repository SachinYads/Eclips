package assignment5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class Assign1 {

	public static void main(String[] args) {

		 ArrayList<String> names=new ArrayList<String>();
		    names.add("Sachin");
		    names.add("Ravi");
		    names.add("Rakesh");
		    names.add("Ravikant");
		    names.add("Srikant");
		    boolean flag = false;
		    for(String it:names) {
		    	Object[] arg = null;
				if(it.equals(arg[0])) {
		    		System.out.println("Hello"+arg[0]);
		    		flag=true;
		    		break;
		    	}
		    }
		    if(flag==false)
		    	System.out.println("sorry name not found");
	}


}
