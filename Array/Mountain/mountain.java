import java.util.Scanner;


/**
 * mountain
 */
public class mountain {

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
     //  System.out.println("Enter the value to be searched");
      // int num = sc.nextInt();
       int s = search(arr);
       System.out.println(s);
    }
    static int search(int[] ar)
    {
        int s = 0;
        int e = ar.length - 1;
        
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            if(ar[mid-1]<ar[mid] && ar[mid]>ar[mid+1])
            {
                return ar[mid];
            }
            else if(ar[mid-1]>ar[mid])
            {
                e = mid;
            }
            else 
            {
            s = mid;
            }
        }
        return -1;
    }
}