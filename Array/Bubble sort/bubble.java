import java.util.Arrays;
/**
 * bubble
 */
public class bubble {

    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        bubblerec(arr, arr.length);
        System.out.println(Arrays.toString(arr));
        }
    static void bubblesort(int[] arr)
    {
        boolean sorted = false;
        for(int i =0; i<arr.length; i++)
        {
            for(int j =1;j<arr.length-i;j++)
            {
              if(arr[j-1]<arr[j])
              {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                sorted = true;
              }
            }
            if(!sorted)
            break;
        }
    }
    static void bubblerec(int [] arr, int n)
    {
       if(n == 1)
       return;

       int count  = 0;
       for(int i = 0; i< n-1;i++)
    {
      if(arr[i]>arr[i+1])
      {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                count++;
      }

    }
    if(count == 0)
    return;
    bubblerec(arr, n-1);
    }
}