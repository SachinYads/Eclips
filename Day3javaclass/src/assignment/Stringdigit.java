package assignment;

public class Stringdigit {
	public static void main(String[] args){
        String str = "sach39736302773";


        String str1="Sachin";

       boolean result = str.matches("[0-9]+");
        boolean result1 = str1.matches("[A-Z]+");
        System.currentTimeMillis();       

        System.out.println("First String : " + str);
        System.out.println("Second String : " + str1);

        System.out.println("Does string contain only Digits? : " + result);
        System.out.println("Does string contain only string? : " + result1);

    }
}
