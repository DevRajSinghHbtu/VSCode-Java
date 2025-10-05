//import java.util.*;
public class pal {
    public static void main(String arg[])
    {
        String a = "My/? -$ Name is Khan";
        String b = isPalindrome(a);
        System.out.println(b);
    }
   static String isPalindrome(String s) {
      String changenew = "";   
    int l = s.length()-1;
       String snew = s.toLowerCase();
       snew.trim();
       //System.out.println(snew);
      // return snew;
      changenew = snew.replaceAll("[^a-zA-Z0-9]", "");
      // return changenew;
      String Unchangedold = changenew;
      String rev = "";
      for(int i = l; i>=0; i--)
      {
         rev = rev + changenew.charAt(i);
      }
      if(rev == Unchangedold)
      return true;
      else
      return false;
    }
}

