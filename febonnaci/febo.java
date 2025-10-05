/**
 * febo
 */import java.util.Scanner;
public class febo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 1;
        System.out.println("Enter the value of n till where series is carried out");
        int n = sc.nextInt();
        System.out.print(a+" , "+b);
       for(int x=1;x<=n-2;x++)
       {
        int c=a+b;
        System.out.print(" , "+c);
         a=b;
         b=c;
       }
    }
}