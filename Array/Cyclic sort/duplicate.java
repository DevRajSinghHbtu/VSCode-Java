public class duplicate {
    public static void main(String[] args) {
        int [] arr = {1,3,4,2,2};
        cyclicsort(arr);
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]!=i+1)
            System.out.println(arr[i]);
        }
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
            if(arr[arr[i]-1]!=arr[i])
            {
            if(arr[i]!=i+1)
            {
                sort(arr, i, arr[i]-1);
            }
            else{
                i++;
            }
        }
        else{
            i++;
        }
    }
    }
}
