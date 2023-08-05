package sachinworld;
import java.util.Scanner;
public class AbstractSearchMain {

	public static void main(String[] args) {
         
		
		//for input a any number ,string
		Scanner sc=new Scanner(System.in);
		ObjList[] obj_list = new ObjList[5];

		for(int index=0; index< objListArr.length;index++)
		
		System.out.println("Enter number to search-: ");
		int searchInt = sc.nextInt();
		ObjList objSearch = new ObjList();
		objSearch.name = searchname;
		
		StringSearch stringsearchfn = new StringSearch();
		
		System.out.println(stringsearchfn.search(obj_list, objSearch));
	
		}

}
