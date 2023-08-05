package Methods;

public class Method1 {
	  int logic(int x,int y) { 
	    	int z = 0;
	    	if(x>y) {
	    		z=x-y;
	    	}
	    	else if(x<y) {
	    		z=x*y;
	    	}
	    	return z;
	    		
	    	
	    
		}
	public static void main(String[] args) {
       int a=10;
       int b=12;
       int c;
       Method1 obj=new Method1();
       
       c=obj.logic(a,b);
       System.out.println(c);
       int a1=12;
       int b1=120;
       int c1;
       Method1 obj1=new Method1();

       c1=obj1.logic(a1,b1);
       System.out.print(c1);

}
}
