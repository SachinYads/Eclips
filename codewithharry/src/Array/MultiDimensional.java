package Array;

public class MultiDimensional {

	public static void main(String[] args) {
		int[][]flats;
      flats=new int[3][3];
      flats[0][0]=100;
      flats[0][1]=101;
      flats[0][2]=103;
      flats[1][0]=201;
      flats[2][0]=202;
      flats[2][1]=203;
      for(int i=0;i<flats.length;i++) {
    	  for(int j=0;j<flats[i].length;j++) {
    		  System.out.println(flats[i][j]);
    	  }
    	  System.out.print("");
      }
      System.out.print("");
      
    
	}

}
