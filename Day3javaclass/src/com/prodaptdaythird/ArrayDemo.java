package com.prodaptdaythird;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] intArr;
		String[] StringArr;
		double[] doubleArr;
		intArr=new int[5];
		double num=1.0;
        doubleArr=new double[5];
        StringArr=new String[5];
		intArr[0]=1;
		intArr[1]=2;
		intArr[2]=3;
		intArr[3]=4;
		intArr[4]=5;
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
		System.out.println(intArr[3]);
		System.out.println(intArr[4]);
		
		for(int i=0; i< intArr.length;i++) {
			System.out.println(intArr[i]);
		}
		for(int j=0;j<doubleArr.length;j++) {
			doubleArr[j]=num;
			num++;
		}
		for(int i=0; i< doubleArr.length;i++) {
			System.out.println(doubleArr[i]);
		}
		Person person = new person();
		
		person.setPersonId(3);
		person.setPersonName("Trivade");
		Person[] personArr=new Person[5];
		personArr[0]=new Person(1,"Sachin Yadav");
		personArr[1]=new Person(2,"Sac Yadav");
		personArr[2]=person;
		personArr[3]=new Person(3,"Sachi Yadav");
		personArr[4]=new Person(4,"Sa Yadav");
		for(Person persn:personArr) {
			System.out.println(persn);
		}
		
		
	}
}
