import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
      int a[] = {4,4,4,4,4,4,4};
     
      ArrayList<Integer> ans = findIndex(a, 0, 4, new ArrayList<>());
      System.out.println(ans);
    }
    static ArrayList<Integer> findIndex(int arr[], int index, int target, ArrayList<Integer> list)
    {
        if(index == arr.length)
        {
            return list;
        }
        if(arr[index] == target)
        {
            list.add(index);
        }
        return findIndex(arr, index+1, target, list);

    }
}
