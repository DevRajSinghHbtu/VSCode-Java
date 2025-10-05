import java.util.Arrays;
/**
 * missing number
 */
public class missing{

    public static void main(String[] args) {
        int[] arr = {0,1};
        cyclicsort(arr);
        int n = missingnum(arr);
        System.out.println(Arrays.toString(arr));
       System.out.println(n);
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
           if(arr[i]==arr.length)
           {
              i++;
           }
           
            else if(arr[i]!=i)
            {
                sort(arr, i, arr[i]);
            }
            else{
                i++;
            }
            
        }
    }
    static int missingnum(int [] arr)
    {
        int i =0;
        while(i<arr.length)
        {
            if(arr[i]!=i)
            return i;
            else
            i++;
        }
        return arr.length;
    }
}
