package Assignment4;
interface Airthmetic{
	int operation(int a,int b);
}

public class Percent {
	public static void main(String[] args)
	{
		Airthmetic addition = new Airthmetic() {
			public int operation(int a,int b) {
				return (a+b);	
			}
		};
		System.out.println("Addition=>"+addition.operation(10,20));
	}

}
