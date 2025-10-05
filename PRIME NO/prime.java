import java.util.Scanner;
/**
 * to check a no. prime or not with function method
 */
public class prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }
    static boolean isPrime(int x)
    {
       int a; int c=0;
       if(x<=1)
       return false;
       else
       {
       for(a=2;a<=x-1;a++)
       {
        if(x%a==0)
        {
            c++;
        }

       }
       if(c==0)
      return true;
       else
       return false;
    }
    }
}