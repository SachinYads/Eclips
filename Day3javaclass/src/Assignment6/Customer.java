package Assignment6;

public class Customer {
	 private Long id;
	  private String name;
	  private Integer tier;
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
	 * @param name the name to set
	 */
	public void setName(String name) {
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
	
}
