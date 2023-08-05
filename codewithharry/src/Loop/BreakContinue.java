package Loop;

public class BreakContinue {

	public static void main(String[] args) {
    for(int i=0;i<=11;i++) {
    	System.out.println(i);
    	System.out.println("Java is great");
    	if(i==4) {
    		System.out.println("Ending the loop");
    		break;
    	}
    }
	}

}
