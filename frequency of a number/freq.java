import java.util.Scanner;
/**
 * freq
 */
public class freq {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("Enter the digit to be count");
        int n = sc.nextInt();
       int x = num; int d = 0,c=0;
        while(x!=0)
        {
          d = x%10;
          {
          if(d==n)
          {
          c++;
          }
          x = x/10;
          }
          
    }
    System.out.println("The freq of "+n+" in number "+num+" is "+c);
}
}