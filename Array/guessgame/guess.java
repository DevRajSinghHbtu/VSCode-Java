import java.util.Scanner;
class guess
{
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int start = 0;
   int end = 1000;
   int ch = -1;
   int attempts = 0;
   while(ch!=0)
   {
    int ans = (start+end)/2;
    attempts++;
    System.out.println("Is your choosen number is "+ans);
    System.out.println("Enter the correct choice");
    System.out.println("Enter 0 if the guessed number is correct");
    System.out.println("Enter -1 is the guessed number is small");
    System.out.println("Enter 1 if the guessed number is large");
     ch = sc.nextInt();
     
    if(ch == -1)
    {
        start = ans+1;
    }
    else if(ch == 1)
    {
        end = ans-1;
    }
    else if(ch!=0)
    {
        System.out.println("Invalid input enter the correct option i.e. 0, 1, -1");
    }

   }
   System.out.println("I have guessed the correct number in "+attempts+" attempts");
      sc.close();
    }
}