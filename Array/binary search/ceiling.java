import java.util.Scanner;
public class ceiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array");
        int len = sc.nextInt();
        System.out.println("Enter the value of array");
        int[] arr = new int[len];
        for(int a=0;a<len;a++)
        {
            arr[a] = sc.nextInt();
        }
       for(int a=0;a<len;a++)
       {
        System.out.print(arr[a]+" ");
       }
       System.out.println();
       System.out.println("Enter the value to be searched");
       int num = sc.nextInt();
       int s = csearch(arr, num);
       System.out.println(s);
    }
    static int csearch(int[] ar, int target)
    {
        int s = 0;
        int e = ar.length - 1;
        
        while(s<=e)
        {
            int m = (s+e)/2;
            if(target<ar[m])
            {
                e = m-1;
            }
            else if(target>ar[m])
            {
                s = m+1;
            }
            else 
            {
            return m;
            }
        }
        
        return ar[s];
    }
}