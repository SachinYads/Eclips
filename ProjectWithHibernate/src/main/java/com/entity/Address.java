package com.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
@Entity
@Table(name="student_address")
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="address_id")
   private int AddressId;
	@Column(length=50,name="Street")
   private String street;
   @Column(length=100,name="City")
   private String city;
   private boolean isOpen;
   @Transient
   private double x;
   @Column(name="added_date")
   @Temporal(TemporalType.DATE)
   private Date addDate;
   @Lob
   private byte[] image;
   public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
public Address(int addressId, String street, String city, boolean isOpen, double x, Date addDate, byte[] image) {
	super();
	AddressId = addressId;
	this.street = street;
	this.city = city;
	this.isOpen = isOpen;
	this.x = x;
	this.addDate = addDate;
	this.image = image;
}
public int getAddressId() {
	return AddressId;
}
public void setAddressId(int addressId) {
	AddressId = addressId;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public boolean isOpen() {
	return isOpen;
}
public void setOpen(boolean isOpen) {
	this.isOpen = isOpen;
}
public double getX() {
	return x;
}
public void setX(double x) {
	this.x = x;
}
public Date getAddDate() {
	return addDate;
}
public void setAddDate(Date addDate) {
	this.addDate = addDate;
}
public byte[] getImage() {
	return image;
}
public void setImage(byte[] image) {
	this.image = image;
}

}
