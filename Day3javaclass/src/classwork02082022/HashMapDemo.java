package classwork02082022;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
     HashMap<String,Double> hm= new HashMap<String,Double>();
     hm.put("john",3434.34);
     hm.put("TOm Smith",3435.34);
     hm.put("TOd Hall",1334.34);
     hm.put("Ralph Smith",34.34);
     hm.put("john",3434.34);
     hm.put(null,3434.34);
     hm.put("Prabhat",99.92);
     hm.put("Ralph Smith",434.34);
   System.out.println(hm) ;
   
   
   Set set=hm.entrySet();
   System.out.println(set);
   System.out.println(hm.keySet());
   System.out.println(hm.get("Prabhat"));
   
   
   
   Iterator itr=set.iterator();
   while(itr.hasNext()) {
	   Map.Entry<String,Double> me=(Map.Entry<String,Double>)itr.next();
	   System.out.println(me.getKey()+":"+me.getValue());
   }
   
     
     
     
     System.out.println(hm.keySet());
     System.out.println(hm.values());
     System.out.println("***************************************");
         	 Set<String> keys=hm.keySet();
    	 for(String key:keys) {
    		 System.out.println(key + ":"+hm.get(key));
    	 }
     
     System.out.println("*********************");
     System.out.println(hm);
     
     
     
     
     
     
	}

}
