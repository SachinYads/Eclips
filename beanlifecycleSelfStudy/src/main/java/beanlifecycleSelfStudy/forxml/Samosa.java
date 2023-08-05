package beanlifecycleSelfStudy.forxml;

public class Samosa {
private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public Samosa(double price) {
	super();
}

@Override
public String toString() {
	return "Samosa [price=" + price + "]";
}


}
