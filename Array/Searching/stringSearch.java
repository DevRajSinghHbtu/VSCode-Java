import java.util.Scanner;
public class stringSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String str = sc.nextLine();
        System.out.println("Enter the character to be searched");
        char ch = sc.next().charAt(0);
        System.out.println(search(str, ch));
    }
    static boolean search(String s, char c)
    {
        s.trim();
        int l = s.length();
        for(int x=0;x<l;x++)
        {
            char che = s.charAt(x);
            if(che==c)
            {
            return true;
            }
        }
        return false;
    }
}
