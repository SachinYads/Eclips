package com.springcore.lifecycle;
//For using xml 
public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
 public void init() {
	 System.out.println("Inside the init method");
 }
 public void destroy() {
	 System.out.println("Inside the destroy method");
 }
}
