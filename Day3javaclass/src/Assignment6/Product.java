package Assignment6;

import java.util.Collection;

public class Product {
	private Long id;
    private String name;
	private String category;
	private Double price;
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
	public static Collection<Product> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	public Collection<Product> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
