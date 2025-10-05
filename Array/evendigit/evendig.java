import java.util.Scanner;
/**
 * evendigit means to find the freq of digit in a number and then find if it contain even no. of digit or not
 */
public class evendig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); {
            System.out.println("Enter the length of an array");
            int len = sc.nextInt();
            System.out.println("Enter the value of array");
            int[] arr = new int[len];
            for(int a=0;a<len;a++)
            {
                arr[a] = sc.nextInt();
            }
      for(int a=0;a<len;a++)
      {
            System.out.print(arr[a]+" ");
      }
      System.out.println();
      int ans = even(arr, len);
      System.out.println(ans);
        }
    }
    static int even(int[] ar, int l)
    { 
        int c = 0;
        for(int a=0;a<l;a++)
        {
            int n = ar[a];
           if(Integer.toString(n).length()%2==0)
           {
            c++;
           }

        }
       return c;
    }
    
}