import java.util.Arrays;
public class movezero {
    public static void main(String[] args) {
        int[] arr = { 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        move(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void move(int ar[])
    {
        int c = 0;
        int n = ar.length;
        for(int i = 0;i<n;i++)
        {
            if(ar[i]==0)
            {
               c++;
            }
        }
        if(c>0)
        {
            for(int i = 1;i<=c;i++)
            {
                for(int j = 0; j< n-i; j++)
                {
                    if(ar[j]==0)
                    {
                        swap(ar,j,j+1);
                    }
                }
            }
        }
    }
    static void swap(int arr[], int f, int s)
    {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s]= temp;
    }
}
