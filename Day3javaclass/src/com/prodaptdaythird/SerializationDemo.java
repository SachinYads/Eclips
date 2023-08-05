package com.prodaptdaythird;

import java.io.File;

public class SerializationDemo {

	public static <Employee> void main(String[] args) {
           Employee e= new Employee;
           e.setEmpId(11);
           ((Object) e).setEmpName("Sachin");
           System.out.println(e);
           File file = new File("D:\\prodapt\\serializedObject.txt");
           FileOutputStream fos;
           try {
        	   fos= new FileOutputStream(file);
        	   ObjectOutputStream oos= new ObjectOutputStream()
           }
	}

}
