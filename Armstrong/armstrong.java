//import java.util.Scanner;
/**
 * armstrong
 */

public class armstrong {

  public static void main(String[] args) {
      for (int i = 100; i < 1000; i++) {
          boolean k = isArmstrong(i);
          if(k==true)
          System.out.print(i+" ");
          
      }
  }
      static boolean isArmstrong(int x)
      {
      int d=0, sum=0, y=x;
      while(x>0)
     { 
     
       
       d=x%10;
       x=x/10;
       sum = sum + (d*d*d);
     }
       if(sum==y)
     return true;
     else
      return false;
    }}