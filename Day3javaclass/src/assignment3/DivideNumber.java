package assignment3;

import java.util.List; 
import java.util.Vector; 
public class DivideNumber {

public static <T extends Number> Number divide(T t1, T t2) 
 { return (t1.doubleValue() / t2.doubleValue()); } 
public static <T extends Number> Number divide(List<? extends Number> list) 
 { 
 double d = 0;; 
 for (int i = 0; i < list.size(); i++) 
 d += list.get(i).doubleValue(); 
 
 return new Double(d); 
 } 
 
public static void dumpList(List<?> list) 
 { 
 System.out.println("List dump with unbounded wildcard:"); 
 for (int i = 0; i < list.size(); i++) 
 System.out.println(list.get(i)); 
 } 
public static void main(String[] args) 
 { 
 Integer i1 = new Integer(34), i2 = new Integer(43); 
 System.out.println("divide with generic method: " + 
DivideNumber.divide(i1, i2)); 
 Float f1 = new Float(12.56), f2 = new Float(3.6778); 
 System.out.println("DivideNumber with generic method: " + 
DivideNumber.divide(f1, f2)); 
 Vector<Number> l = new Vector<Number>(); 
 l.add(new Integer(34)); 
 l.add(new Integer(43)); 
 System.out.println("DivideNumber with upper bounded wildcard: " + 
DivideNumber.divide(l)); 
  DivideNumber.dumpList(l); 
 }
private static String divide(Vector<Number> l) {
	// TODO Auto-generated method stub
	return null;
} 
} 

