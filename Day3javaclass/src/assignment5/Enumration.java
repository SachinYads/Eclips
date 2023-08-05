package assignment5;

enum Subjectmarks{
	
	Math(40),
	physics(70),
	chemistry(60);
	private int value;
	private Subjectmarks(int value) {
		this.value=value;
	}
	public int getValue() {
		return(value);
	}
	
}

public class Enumration  
{  
public static void main(String args[])   
{  
int sum=0; 
for(Subjectmarks o:Subjectmarks.values()) {
  sum+=o.getValue();
}
System.out.println("sum ="+sum);
}
}  