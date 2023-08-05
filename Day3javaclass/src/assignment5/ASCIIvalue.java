package assignment5;

public class ASCIIvalue {
	
	public static void main(String[] args) {
		String asciistr;
		int i = 0;
			

		asciistr = "Javaisthebest!";
			
		while(i < asciistr.length())
		{
			System.out.println("The ASCII Value of " + asciistr.charAt(i) +
					" Character = " + asciistr.codePointAt(i));
			i++;
		}
	}
}