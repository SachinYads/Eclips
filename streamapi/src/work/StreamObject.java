package work;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      //1.Blank
               Stream<Object>emptyStream=Stream.empty();
               emptyStream.forEach(e->{
            	   System.out.println(e);
               });
               
              //2.array,object,collection
        String name[]= {"Sachin","Durgesh","Aroshi"};
        
        Stream<String>stream1=Stream.of(name);
        stream1.forEach(e->{
        	System.out.println(e);
        });
        //3.Builder
        Stream<Object>streambuilder=Stream.builder().build();
        
       //4.Array
        IntStream stream=Arrays.stream(new int[] {4,5,6,7,8,9});
        stream.forEach(e->{
        	System.out.println(e);
        });
	}

}
