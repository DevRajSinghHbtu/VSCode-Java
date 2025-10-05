public class rev {
    public static void main(String[] args) {
       int ans = reve(98);
       System.out.println(ans);
    }
    static int reve(int n)
    {
       
       String str = Integer.toString(n);
       int len = str.length()-1;
      if(n!=0)
       {
       return (int)((n%10)*Math.pow(10, len--) + reve(n/10));
       }
       
       return 0;
    }

}