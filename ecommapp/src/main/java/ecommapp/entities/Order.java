package ecommapp.entities;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
@Entity
@Table(name="order_info")

public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long id;
 private String status;
 private LocalDate orderDate;
 private LocalDate delieveryDate;
 @ManyToMany(cascade = CascadeType.ALL)  
	@JoinColumn(name="customer_id")  
 private Customer customer;

	@ManyToMany(cascade=CascadeType.ALL) 
	@JoinTable(name="order_product_relationship", joinColumns= {
			@JoinColumn(name="order_id")},inverseJoinColumns= {@JoinColumn(name="product_id")
	})
	private Set<Product>products;
public Order() {
	
}
public Order(Long id, String status, LocalDate orderDate, LocalDate delieveryDate, Set<Product> products,
		Customer customer) {
	super();
	this.id = id;
	this.status = status;
	this.orderDate = orderDate;
	this.delieveryDate = delieveryDate;
	this.products = products;
	this.customer = customer;
}
/**
 * @return the id
 */
public Long getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(Long id) {
	this.id = id;
}
/**
 * @return the status
 */
public String getStatus() {
	return status;
}
/**
 * @param status the status to set
 */
public void setStatus(String status) {
	this.status = status;
}
/**
 * @return the orderDate
 */
public LocalDate getOrderDate() {
	return orderDate;
}
/**
 * @param orderDate the orderDate to set
 */
public void setOrderDate(LocalDate orderDate) {
	this.orderDate = orderDate;
}
/**
 * @return the delieveryDate
 */
public LocalDate getDelieveryDate() {
	return delieveryDate;
}
/**
 * @param delieveryDate the delieveryDate to set
 */
public void setDelieveryDate(LocalDate delieveryDate) {
	this.delieveryDate = delieveryDate;
}
/**
 * @return the products
 */
public Set<Product> getProducts() {
	return products;
}
/**
 * @param products the products to set
 */
public void setProducts(Set<Product> products) {
	this.products = products;
}
/**
 * @return the customer
 */
public Customer getCustomer() {
	return customer;
}
/**
 * @param customer the customer to set
 */
public void setCustomer(Customer customer) {
	this.customer = customer;
}
@Override
public String toString() {
	return "Order [id=" + id + ", status=" + status + ", orderDate=" + orderDate + ", delieveryDate=" + delieveryDate
			+ ", products=" + products + ", customer=" + customer + "]";
}

}
