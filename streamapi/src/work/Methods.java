package work;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String[] strings = new String[]{"sachin","ravi","suraj","rishu"} ;
	   List<String> list3 = Arrays.asList(strings);
	   List<String>newName=list3.stream().filter(e->e.startsWith("s")).collect(Collectors.toList());
			   System.out.println(newName);}
	}


