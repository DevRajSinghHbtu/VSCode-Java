import java.util.Scanner;
public class searchinMountain {
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
      // int s = findpeakindex(arr);
      // System.out.println(s);
       int g = asscendingbinarysearch(arr, num);
       if(g!=-1)
       System.out.println(g);
       else
       {
        int k = descendingbinarysearch(arr, num);
        System.out.println(k);
       }
    }
    static int asscendingbinarysearch(int[] ar, int target)
    {
        int tem = findpeakindex(ar);
        int s = 0;
        while(s<=tem)
        {
            int mid = s+(tem-s)/2;
            if(ar[mid]>target)
           {
            tem = mid-1;
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
    static int descendingbinarysearch(int[] ar, int target)
    {
        int tem = findpeakindex(ar);
        int s = tem+1;
        int e = ar.length-1;
        while(s<=e)
        {
            int mid = s+(e-s)/2;
            if(ar[mid]>target)
           {
             s= mid;
           }
           else if(ar[mid]<target)
           {
            e = mid;
           }
           else
           {
            return mid;
           }
        }
        return -1;
    }

    static int findpeakindex(int[] ar)
    {
        int s = 0;
        int e = ar.length - 1;
        
        
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            if(ar[mid-1]<ar[mid] && ar[mid]>ar[mid+1])
            {
               
                return mid;

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
