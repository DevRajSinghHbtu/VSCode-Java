import java.util.Arrays;
import java.util.Scanner;
public class sorted2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row of an array");
        int row = sc.nextInt();
        System.out.println("Enter the column of an array");
        int col = sc.nextInt();
        System.out.println("Enter the value of array");
        int[][] arr = new int[row][col];
        for(int a=0;a<row;a++)
        {
           for(int b=0;b<col;b++)
       {
           arr[a][b] = sc.nextInt();
       }
    }
       System.out.println();
       System.out.println("Enter the value to be searched");
       int num = sc.nextInt();
       sc.close();
       int s[] = searchin2d(arr, num, row, col);
       System.out.println("Ans is "+Arrays.toString(s));
    }
    static int[] search(int[][] ar, int target, int row, int cstart, int cend)
    {
        
        while(cstart<=cend)
        {
            int mid = cstart+(cend-cstart)/2;
            if(ar[row][mid]>target)
           {
            cend = mid-1;
           }
           else if(ar[row][mid]<target)
           {
            cstart = mid+1;
           }
           else
           {
            return new int[]{row, mid};
           }
        }
        return new int[]{-1, -1};
}
 static int[] searchin2d(int[][] arr,int target, int row, int col)
 {
    int r=0; int[] ans = {-1, -1};
    while(r<row)
    {
        ans = search(arr, target, r, 0, col-1);
        if(ans[0]!=-1)
        {
       break;
        }
        
        r++;
    }
    return ans;
 }
    
}

