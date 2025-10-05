public class test
 {
   

    public static void main()
{
        int i;int y=0;
       int d=0, sum=0;
        for(i=100;i<=999;i++)
       { 
         y=i;
         d=i%10;
         i=i/10;
         sum = sum + (d*d*d);
       }
         if(sum==y)
         {
         System.out.print(y+" ");
         }
     
         
     
}
}