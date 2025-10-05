import java.util.Arrays;
/**
 * cyclic
 */
public class cyclic {

    public static void main(String[] args) {
        int[] arr = {1,4,3,2,2};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int first, int second)
    {
        
       int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static void cyclicsort(int [] arr)
    {
        int i = 0;
        while (i<arr.length) {
            if(arr[i]!=i+1)
            {
                sort(arr, i, arr[i]-1);
            }
            else{
                i++;
            }
            
        }
    }
}