package ecommapp.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="customer_info")

public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
		private String name;
	private Integer tier;
	
	
	public Customer() {
		super();
	}
	public Customer(Long id, String name, Integer tier) {
		super();
		this.id = id;
		this.name = name;
		this.tier = tier;
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
	 * @param i 
	 * @param name the name to set
	 * @param j 
	 */
	public void setName( String name) {
		this.name = name;
	}
	/**
	 * @return the tier
	 */
	public Integer getTier() {
		return tier;
	}
	/**
	 * @param tier the tier to set
	 */
	public void setTier(Integer tier) {
		this.tier = tier;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", tier=" + tier + "]";
	}
	public void setcustomer(Set<Product> custset) {
		// TODO Auto-generated method stub
		
	}
	

}
