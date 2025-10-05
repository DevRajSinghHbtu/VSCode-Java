//import java.util.Scanner;
/**
 * linear searching
 */
public class linear {

    public static void main(String[] args) {
      
      
      int[] arr = {1, 23, 9, 45, 46};
     int n = 46;
     int s = search(arr, n);
     System.out.println(s);
    }
    static int search(int[] ar, int x)
     { 
        
        if(ar.length==0)
        {
            return -1;
        }
        
         for(int a=0;a<ar.length;a++)
         { 
            int element = ar[a];
            if(element==x)
            {
            return a;
            }
         }
        return -1;
         
     }
}