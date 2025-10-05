class add
{
    public static void main(String[] args) {
        int s = sum(-123);
        System.out.println(s);
    }
    static int sum(int n)
{
    while(n!=0)
    {
    int rev = n%10;
    
    return rev + sum(n/10);
    }
    return 0;
}
}