//import java.util.Arrays;
import java.util.ArrayList;
class dup {
 public static void main(String[] args) {
    int[] arr = {0,0,1,1,1,2,2,3,3,4};
//    int ar [] = new int[arr.length];
    int ar = removeDuplicates(arr);
    System.out.println(ar);

 }
  static int removeDuplicates(int[] nums) {
      ArrayList<Integer> li = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i<n; i++)
        {
          if (!li.contains(arr[i])) {  // check if element is already in list
                li.add(arr[i]);
            }
        }
        int k = li.size();
        for(int j = 0; j<k;j++)
        {
           arr[j] = li.get(j);
        }

        return k;
       
}
}