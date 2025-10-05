import java.util.Scanner;
/**
 * leet
 */
public class leet {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of rows in array");
    int r = sc.nextInt();
    System.out.println("Enter the value of column in array");
    int c = sc.nextInt();
    int[][] arr = new int[r][c];
    System.out.println("Enter the value of array");
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            arr[i][j] = sc.nextInt();
        }
    }
    System.out.println();
    int ans = sum(arr, r, c);
    System.out.println(ans);
}
static int sum(int[][] ar, int r, int c)
{
    int max=0;
    for(int i=0;i<r;i++)
    {
        int rowsum=0;
        for(int j=0;j<c;j++)
        {
            rowsum = rowsum + ar[i][j];
            
        }
        if(rowsum>=max)
        {
        max=rowsum;
        }
    }
    return max;
}
    

}