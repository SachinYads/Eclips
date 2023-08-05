package com.springcore.constructorinjection;

public class Person {
	private String name;
	private int personId;
	public Person(String name, int personId) {
		this.name = name;
		this.personId = personId;
	}
	@Override
	public String toString() {
		return this.name+":"+this.personId;
	}
	

}
