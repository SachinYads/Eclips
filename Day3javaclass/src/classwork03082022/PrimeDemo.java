package classwork03082022;

public class PrimeDemo {

	public static void main(String[] args) {
      
		Primenum p=num->{
			int flag=0;
			if(num==0||num==1)
				flag =1;
			for(int i=2;i<num/2;++i) {
				if(num%i==0) {
					flag=1;
					break;
				}
			}
			if(flag==0)
				return true;
			else 
				return false;
	};
	System.out.println(p.Primenum(9));

}
}
