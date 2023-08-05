package ecommapp.app;


import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import ecommapp.entities.Customer;
import ecommapp.entities.Order;
import ecommapp.entities.Product;
import ecommapp.utility.HibernateUtility;

public class EcommApp {
	public static void main(String[] args) {

 Session  session=HibernateUtility.getSessionFactory().openSession();
 Customer cust=new Customer();
 cust.setName("Stefen Walker");
 cust.setTier(1);
 Order ord=new Order();
 ord.setDelieveryDate(LocalDate.of(2021, 02, 28));
 ord.setOrderDate(LocalDate.of(2021, 02, 23));
 ord.setStatus("New");
 
 Product pro=new Product();
 pro.setName("Omins and order");
 pro.setCategory("Games");
 pro.setPrice(184.83);
 Set<Product >productSet=new HashSet<Product>();
 productSet.add(pro);
 ord.setProducts(productSet);
 ord.setCustomer(cust);
 
	session.beginTransaction();
	session.persist(ord);
	session.getTransaction().commit();
		
	   }
}
