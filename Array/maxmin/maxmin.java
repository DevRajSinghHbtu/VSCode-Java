import java.util.Scanner;
/**
 * maxmin
 */
public class maxmin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
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
       int min = minimum(arr);
       System.out.println("Minimum value in the array is "+min);
       int max = maximum(arr);
       System.out.println("Maximum value in the array is "+max);

    }
    static int minimum(int[] ar)
    {
       int min = ar[0];
       for(int x=1;x<ar.length;x++)
       {
        if(min>ar[x])
        {
            min = ar[x];
        }
       }
       return min;
    }
    static int maximum(int[] ar)
    {
       int max = ar[0];
       for(int x=1;x<ar.length;x++)
       {
        if(max<ar[x])
        {
            max = ar[x];
        }
       }
       return max;
}
}