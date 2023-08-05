package Assignment6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Finalmain {

	public static void main(String[] args) {
		List<Customer> Customerlist = new ArrayList<Customer>();
		Customerlist.add(new Customer((long) 1, "sachin", 3));
		Customerlist.add(new Customer((long) 2, "Daija Von", 1));

		Customerlist.add(new Customer((long)3, "Ariane Rodriguez", 1 ));

		Customerlist.add(new Customer((long) 4, "Marques Nikolaus", 2));

		Customerlist.add(new Customer((long)5, "Larques Nikolaus", 22));
		Customerlist.add(new Customer((long)6, "Larissa White", 2 ));

		Customerlist.add(new Customer((long) 7, "Fae Heidenreich", 1));
		Customerlist.add(new Customer((long)8, "Dino Will", 2 ));

		Customerlist.add(new Customer((long) 9, "Eloy Stroman", 1));

		Customerlist.add(new Customer((long) 10, "Brisa O Connell", 1));
		
		
		List<Product> Productlist = new ArrayList<Product>();
		Productlist.add(new Product((long)2,"vel libero suscript","Toys",12.66));
		Productlist.add(new Product((long)3, "non nemo iure", "Grocery", 498.02));

		Productlist.add(new Product((long)4, "voluptatem voluptas aspernatur", "Toys", 536.80));

		Productlist.add(new Product((long)5, "animi cum rem", "Games", 458.20));

		
		List<Order> Orderlist = new ArrayList<Order>();

		Orderlist.add(new Order((long)1, "2021-02-28", "2021-03-08", "NEW", 5));
		Orderlist.add(new Order((long)4, "2021-03-22", "2021-03-27", "PENDING", 3));

		Orderlist.add(new Order((long)6, "2021-03-30", "2021-04-07", "DELIVERED", 9));

		Orderlist.add(new Order((long)8, "2021-03-27", "2021-04-05", "NEW", 4));

		Orderlist.add(new Order((long)10, "2021-03-10", "2021-03-19", "NEW", 8));
		
		System.out.println(Customerlist);
		
		
		
		
	}	 
	
}

	