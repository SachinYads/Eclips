package classwork03082022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order1= new Order("Aud",1500000.00);
		Order order2= new Order("INR",5500000.00);

		Order order3= new Order("USD",4500000.00);

		Order order4= new Order("EUR",3500000.00);

		Order order5= new Order("AUD",2500000.00);

		Order order6= new Order("EUR",500000.00);
		List<Order> orderList=new ArrayList<Order>();
		orderList.add(order1);
		orderList.add(order2);
		orderList.add(order3);
		orderList.add(order4);
		orderList.add(order5);
		orderList.add(order6);
		System.out.println(orderList);
		Collections.sort(orderList,new AmountComperator());
		System.out.println(orderList);
		
		
		
		Collections.sort(orderList,Comparator.comparingDouble(Order::getAmount));
		orderList.forEach(System.out::println);
		
		Collections.sort(orderList,Comparator.comparingDouble(Order::getConcurrency));
		orderList.forEach(System.out::println);

		


	}

}
