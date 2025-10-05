public class countz {
static int c = 0;
    public static void main(String[] args) {
        int ch = count(30004);
        System.out.println(ch);
    }
    static int count(int n)
    { 
        if(n!=0)
        {
            int rev = n%10;
            if(rev == 0)
            {
                c++;
            }
            return count(n/10);
        }
        return c;
    }
}
