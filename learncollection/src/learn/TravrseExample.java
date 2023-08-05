package learn;

import java.util.ArrayList;
import java.util.Iterator;

public class TravrseExample {
	public static void main(String[] args) {
		
		ArrayList<String>names=new ArrayList<>();
		//For add any element
		names.add("Duregesh");
		names.add("Sitara");
		names.add("Sachin");
		names.add("Saurav");
		names.add("Rishu");
		names.add("Sitara");
		System.out.println(names);
   //for each loop
		for(String str:names) {
			System.out.println(str+"\t"+str.length());
		}
		
		//traversing using iterator
		Iterator<String>itr=names.iterator();
		while(itr.hasNext()) {
			String next=itr.next();
			System.out.println(next);
		}
	}
}
