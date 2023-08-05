package classwork03082022;

public class Order {
  private String Concurrency;
  private Double amount;
  
  public Order(Double amount) {
		super();
		this.amount = amount;
	}

  
  
  
  
  public Order(String concurrency, Double amount) {
		super();
		Concurrency = concurrency;
		this.amount = amount;
	}
/**
 * @return the concurrency
 */
public String getConcurrency() {
	return Concurrency;
}
/**
 * @param concurrency the concurrency to set
 */
public void setConcurrency(String concurrency) {
	Concurrency = concurrency;
}
/**
 * @return the amount
 */
public Double getAmount() {
	return amount;
}
/**
 * @param amount the amount to set
 */
public void setAmount(Double amount) {
	this.amount = amount;
}
@Override
public String toString() {
	return "Order [Concurrency=" + Concurrency + ", amount=" + amount + "]";
}
public 

}
