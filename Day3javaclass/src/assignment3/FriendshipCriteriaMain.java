package assignment3;
import java.util.Scanner;

public class FriendshipCriteriaMain {


	public static void main(String[] args) {
		
		Friend fr = new Friend("Shady", "Doon", 69);
//		Friend fr1 = new Friend("Eminem", "Dehradun", 92);
//		Friend fr2 = new Friend("Marshal", "Delhi", 46);
//		Friend fr3 = new Friend("Russ", "Mussourie", 39);
//		Friend fr4 = new Friend("Kendrick", "Kodaikanal", 62);
//		
		
		FriendshipCriteria<String, Integer> ob = new FriendshipCriteria<String, Integer>(null, null);
		ob.setT(fr.getName());
		ob.setS(fr.getAge());
		
//		System.out.println(ob.compareTo(ob));
//		FriendshipCriteria<String, Integer> ob1 = new FriendshipCriteria<String, Integer>(null, null);
//		ob1.setT("lkasjdl");
//		ob1.setS(88);
//		System.out.println(ob1.compareTo(ob));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter location : ");
		String st = sc.next();
		
		FriendshipCriteria<String, String> ob2 = new FriendshipCriteria<String, String>(null, null);
		ob2.setS(st);
		FriendshipCriteria<String, String> ob3 = new FriendshipCriteria<String, String>(null, null);
		ob3.setS(fr.getLocation());
		System.out.println(ob2.compareTo(ob3));

		System.out.println("Enter Age : ");
		Integer i = sc.nextInt();
		FriendshipCriteria<String, Integer> ob1 = new FriendshipCriteria<String, Integer>(null, null);
		ob1.setS(i);
		System.out.println(ob1.compareTo(ob));
		
		sc.close();
	}

}