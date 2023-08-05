package Assignment4;
interface Airthmetic{
	int operation(int a,int b);
}

public class FunctionalInterface {
	public static void main(String[] args)
	{
		Airthmetic addition = new Airthmetic() {
			public int operation(int a,int b) {
				return (a+b);	
			}
		};
		System.out.println("Addition=>"+addition.operation(10,20));
	}
	{
		Airthmetic substraction = new Airthmetic() {
			public int operation(int a,int b) {
				return (a-b);	
			}
		};
		System.out.println("Substraction=>"+substraction.operation(10,20));
	}
	{
		Airthmetic multiplication = new Airthmetic() {
			public int operation(int a,int b) {
				return (a*b);	
			}
		};
		System.out.println("Multiplication=>"+multiplication.operation(10,20));
	}
	{
		Airthmetic division = new Airthmetic() {
			public int operation(int a,int b) {
				return (a/b);	
			}
		};
		System.out.println("Division=>"+division.operation(10,20));
	}
	{
		Airthmetic percent = new Airthmetic() {
			public int operation(int a,int b) {
				return (a%b);	
			}
		};
		System.out.println("Percent=>"+percent.operation(10,20));
	}

}

    