package classwork03082022;

import java.util.ArrayList;
import java.util.List;

public class MaxFinderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxFinder finder=new MaxFinderImpl();
		int result = finder.maximum(10,20);
		System.out.println(result);
		
		
		MaxFinder maxFinder=(num1,num2)->num1>num2 ?num1:num2;
		int max= maxFinder. maximum(10,20);
		System.out.println(max);
		
		List<String>  currencies = new ArrayList<String>();
		currencies.add("USD");
		currencies.add("INR");
		currencies.add("YEN");
		currencies.add("YUAN");
		currencies.add("EURO");
		currencies.forEach(c-> System.out.println(c));

	}

}
