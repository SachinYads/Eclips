package classwork02082022;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
          Hashtable<String,Double> balance = new HashTable<String,Double>();
          Enumeration names;
          String str;
          double bal;
          balance.put("Arun", 3434.45);
          balance.put("Radha", 35.45);
          balance.put("Ram", 93.45);
          System.out.println(balance);
          bal=balance.get("Ram");
          System.out.println(bal);
          
          names=balance.keys();
          while(names.hasMoreElements()) {
        	  str = (String) names.nextElement();
        	  System.out.println(str+":"+balance.get(str));
        	  
          }
          balance.put("Ram", bal+1000);
          System.out.println("Rams new balance :"+ balance.get("Ram"));
	}

}
