import java.util.Arrays;
/**
 * insertion
 */
public class insertion {

    
    public static void main(String[] args) {
        int[] arr = {4, 88, 1, 5, 7};
        insertionrec(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int first, int second)
    {
        
       int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static void insertionsort(int[] arr)
    {
        for(int i = 0;i<arr.length-1;i++)
        {
            for(int j = i+1;j>0; j--)
            {
                if(arr[j-1]>arr[j])
                {
                    sort(arr, j-1, j);
                }
                else{
                    break;
                }
            }
        }
    }
       static void insertionrec(int arr[], int i, int n)
       {
        if(i==n)
        {
            return;
        }
        int j = i;
        while(j>0 && arr[j-1]>arr[j])
        {
            sort(arr, j-1, j);
            j--;

        }
        insertionrec(arr, i+1, n);
       }
    
}