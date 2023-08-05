package classwork03082022;
import java.io.*;
import java.util.*;
interface PerformOperation {
 boolean check(int a);
}
class OddPrime{
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }

   PerformOperation isOdd()
   {
       PerformOperation po = (int a)-> a%2 == 0 ? false : true;
       return po;
   }
   PerformOperation isPrime()
   {
       PerformOperation po = (int a)->  
       {
           if(a == 1) return true;
           else
           {
               for (int i =  2; i < Math.sqrt(a); i++)
                    if(a%i == 0) return false;
                return true;
           }
       };
       return po;
   }
}

