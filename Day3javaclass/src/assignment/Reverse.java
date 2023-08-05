package assignment;

public class Reverse {

	public static void main(String[] args) {
	        String s1 = "Sachin Yadav";
	        int length = s1.length();
	        StringBuffer rvrsString = new StringBuffer();
	        for (int i = length - 1;i >= 0; i--)
	        {
	            rvrsString.append(s1.charAt(i));
	        }
	        System.out.println(rvrsString);
	    
	}

}
