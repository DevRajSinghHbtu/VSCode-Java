import java.util.Scanner;
public class firstlast {
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
       int s = first(arr, num);
       int t = last(arr, num);
       System.out.println("[ "+s+" , "+t+" ]");
    }
    static int first(int[] ar, int target)
    {
        int s = 0;
        int e = ar.length - 1;
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            if(target<ar[mid])
            {
                e = mid-1;
            }
            else if(target>ar[mid])
            {
                s = mid+1;
            }
            else if(target == ar[mid])
            {
            if(ar[mid-1]==target)
            {
                e = mid-1;
            }
            else
            {
                return mid;
            }
            }
        }
        return -1;
    }
    static int last(int[] ar, int target)
    {
        int s = 0;
        int e = ar.length - 1;
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            if(target<ar[mid])
            {
                e = mid-1;
            }
            else if(target>ar[mid])
            {
                s = mid+1;
            }
            else if(target == ar[mid])
            {
            if(ar[mid+1]==target)
            {
                s = mid+1;
            }
            else
            {
                return mid;
            }
            }
        }
        return -1;
    }
}
