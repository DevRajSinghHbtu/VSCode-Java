import java.util.Scanner;
public class linearnew {
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
       int s = search(len, arr, num);
       System.out.println(s);
    }
    static int search(int l, int[] ar, int n)
    {
        if(l==0)
        {
            return -1;
        }
        for(int i=0;i<l;i++)
        {
            int element = ar[i];
            if(element==n)
            {
               return i;
            }
        }
        return -1;
    }
}
