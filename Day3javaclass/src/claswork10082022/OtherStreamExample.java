package claswork10082022;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class OtherStreamExample {

	public static void main(String[] args) {
     IntStream is;
     DoubleStream ds;
     List<Integer> listOfNumbers = Arrays.asList(15,11,10,9,12,13,2,5,8,1,7,6,4,14,16);
     System.out.println("******************************");
     IntStream.range(5,10).forEach(System.out::println);
     DoubleStream.of(55.00).forEach(System.out::println);
     
	}

}
