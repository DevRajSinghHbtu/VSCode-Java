import java.util.Scanner;
/**
 * pattern
 */
public class pattern {

    public static void main(String[] args) {
     Scanner sc  = new Scanner(System.in);
     int n = sc.nextInt();
     sc.close();
     pattern1(n);
     pattern2(n);
     pattern3(n);
     pattern4(n);
    }
    
    static void pattern1(int n)
    {
        for (int row = 0; row <n; row++) {
            for (int col = n-row; col >0;--col) {
                System.out.print("* ");
                
            }
            System.out.println();
         }
    }
    static void pattern2(int n)
    {
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=row;col++) {
                System.out.print(col+" ");
                
            }
            System.out.println();
         }
    }
    static void pattern3(int n)
    {
        for (int row = 1; row <2*n; row++) {
            if(row<=n)
            {
            for (int col = 1; col <=row;col++) {
                System.out.print("* ");
                
            }
            System.out.println();
        }
        else
        {
            for(int c = (2*n)-row;c>0;--c)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
         } 
    }
    static void pattern4(int n)
    {
        for (int row = 1; row <2*n; row++) {
            if(row<=n)
            {
                for(int sp = n-row;sp>0;--sp)
                {
                    System.out.print(" ");
                }
            for (int col = 1; col <=row;col++) {
                System.out.print("* ");
                
            }
            System.out.println();
        }
        else
        {
            for(int sp = n-((2*n)-row);sp>0;--sp)
            {
                System.out.print(" ");
            }
            for(int c = (2*n)-row;c>0;--c)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
         } 
    }
}