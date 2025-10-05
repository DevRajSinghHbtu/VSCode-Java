import java.util.ArrayList;
import java.util.List;

class googleMissings {
     public List<Integer> findDiseaperared(int[] arr){
          cyclicsort(arr);
          List<Integer> ans = new ArrayList<>();
          for(int i = 0;i<arr.length;i++)
          {
            if(arr[i]!=i+1)
            ans.add(i+1);
          }
        return ans;
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
