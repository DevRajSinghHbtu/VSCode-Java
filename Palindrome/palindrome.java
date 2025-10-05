import java.util.Scanner;
/**
 * palindrome
 */
public class palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int c = n; int d=0, s=0;
        while(n>0)
        {
          d = n%10;
          s = s*10;
          s = s+d;
          n = n/10;
        }
        if(s==c)
        System.out.println("Number "+c+" is Palindrome");
        else
        System.out.println("Not a palindrome number");
    }
}