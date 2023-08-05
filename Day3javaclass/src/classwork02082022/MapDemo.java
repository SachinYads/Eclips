package classwork02082022;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
      Map<Key,String> cityMap= new HashMap<Key,String>();
      cityMap.put(new Key(1,"NY"),"New York City");
      cityMap.put(new Key(2,"NDLS"),"New Delhi");
      cityMap.put(new Key(3,"LKO"),"mumbai");
      cityMap.put(new Key(4,"CNBE"),"kanpur");
	  System.out.println("size:--"+cityMap.size());
	  Iterator<Key> iter = cityMap.keySet().iterator();
	  while(iter.hasNext()) {
		  System.out.println(cityMap.get(iter.next()));
	  }
	  System.out.println("size after iteration:--"+cityMap.size());
	
	}

}
