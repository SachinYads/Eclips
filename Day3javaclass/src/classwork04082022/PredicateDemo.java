package classwork04082022;

import java.lang.reflect.Array;
import java.util.List;

public class PredicateDemo {

	public static void main(String[] args) {
          List<Integer> listOfInteger =Array.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14);
          evaluate(listOfInteger,(c)->{c%2==0;});
	}

}
