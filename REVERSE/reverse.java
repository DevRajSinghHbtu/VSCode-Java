import java.util.Scanner;
/**
 * reverse the number given by user
 */
public class reverse {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number to be reversed");
        int num = sc.nextInt();
        int d = num, rev=0;
        while(d!=0)
        {
         rev = rev*10;
       rev =rev+d%10;
       d=d/10;
        }
      System.out.println("Reverse of "+num+" is "+rev);
    }
}