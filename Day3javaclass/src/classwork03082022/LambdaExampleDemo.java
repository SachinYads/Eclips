package classwork03082022;

public class LambdaExampleDemo {

	public static void main(String[] args) {
           LambdaExample lambdaExample=()-> "Hello please dont talk";
           System.out.println(lambdaExample.fun());
           LambdaExample lambdaExampleImpl = new LambdaExampleImpl();
           System.out.println(lambdaExampleImpl.fun());
	}

}
