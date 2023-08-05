package sachinworld;

public class towDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int rows=3;
        int columns=3;
        int array2D[][];
        array2D=new int[rows][columns];
        System.out.println(array2D.length);
        for(int row=0;row<array2D.length;row++) {
        	for(int column=0;column<array2D.length;column++) {
        		array2D[row][column]=row+1;
        	}
        }
        for(int row=0;row<array2D.length;row++) {
        	for(int column=0;column<array2D.length;column++) {
        		System.out.println(array2D[row][column]);
        	}
        }
	}

}
