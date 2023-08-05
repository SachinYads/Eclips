package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
   public static void main(String[]args) {
	   
	   //create a list 
	   //List<Integer>list1=List.of(2,3,4,5,8,10);
	   //System.out.println(list1);
	   List<Integer>list2=new ArrayList<>();
	   list2.add(23);
	   list2.add(24);
	   list2.add(25);
	   list2.add(26);
	   list2.add(27);
	   System.out.println(list2);
	   //without stream
	   List<Integer>listEven=new ArrayList<>();
	   for(Integer i :list2) {
		   if(i%2==0) {
			   listEven.add(i);
		   }
	   }
	   System.out.println(listEven);
	   //using stream
	    Stream<Integer>stream=list2.stream();
	    List<Integer>newList=stream.filter(i->i%2==0).collect(Collectors.toList());
	    System.out.println(newList);
	   int[] ints = new int[] {1,2,3,4,5};
	   List<int[]> list3 = Arrays.asList(ints);

   }
}
