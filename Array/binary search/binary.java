import java.util.Scanner;
/**
 * binary search when known that array is arranged in asscending order
 * 
 */
public class binary {

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
       int s = search(arr, num);
       System.out.println(s);
    }
    static int search(int[] ar, int target)
    {
        int e = ar.length-1;
        int s = 0;
        while(s<=e)
        {
            int mid = s+(e-s)/2;
            if(ar[mid]>target)
           {
            e = mid-1;
           }
           else if(ar[mid]<target)
           {
            s = mid+1;
           }
           else
           {
            return mid;
           }
        }
        return -1;
}
}