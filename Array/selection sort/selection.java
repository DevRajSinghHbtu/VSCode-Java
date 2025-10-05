import java.util.Arrays;
/**
 * selection
 */
public class selection {

    public static void main(String[] args) {
        int[] arr = {4, 88, 1,5, -5};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int first, int second)
    {
        
       int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int findmax(int [] arr, int start, int last)
    {
        int max = start;
        for(int i = start;i<=last;i++)
        {
            if(arr[i]>arr[max])
            {
                max = i;
            }
        }
        return max;
    }
    static void selectionsort(int[] arr)
    {
        //int start = 0;
        for(int i = 0;i<arr.length;i++)
        {
        int last = arr.length - i - 1;
        int max = findmax(arr, 0, last);
        sort(arr, max, last);
        }
    }
}