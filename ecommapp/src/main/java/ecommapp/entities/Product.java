package ecommapp.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="product_info")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String name;
private String category;
private Double price;

@ManyToMany(mappedBy="products")
private Set<Order>orders;
public Product() {
}
public Product(Long id, String name, String category, Double price) {
	super();
	this.id = id;
	this.name = name;
	this.category = category;
	this.price = price;
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
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the category
 */
public String getCategory() {
	return category;
}
/**
 * @param category the category to set
 */
public void setCategory(String category) {
	this.category = category;
}
/**
 * @return the price
 */
public Double getPrice() {
	return price;
}
/**
 * @param price the price to set
 */
public void setPrice(Double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
}
	


	
}

