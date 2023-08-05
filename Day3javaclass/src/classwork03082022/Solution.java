package classwork03082022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Solution {

	 public static void main(String[] args) throws IOException implement OddPrime {
	  MyMath ob = new MyMath();
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  int T = Integer.parseInt(br.readLine());
	  PerformOperation op;
	  boolean ret = false;
	  String ans = null;
	  while (T--> 0) {
	   String s = br.readLine().trim();
	   StringTokenizer st = new StringTokenizer(s);
	   int ch = Integer.parseInt(st.nextToken());
	   int num = Integer.parseInt(st.nextToken());
	   if (ch == 1) {
	    op = ob.isOdd();
	    ret = ob.checker(op, num);
	    ans = (ret) ? "ODD" : "EVEN";
	   } else if (ch == 2) {
	    op = ob.isPrime();
	    ret = ob.checker(op, num);
	    ans = (ret) ? "PRIME" : "COMPOSITE";
	   } 
	   System.out.println(ans);
	  }
	 }
	}