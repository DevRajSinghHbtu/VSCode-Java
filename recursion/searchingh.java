public class searchingh {
    public static void main(String[] args) {
        int a[] = {1, 4, 7, 9};
        int t = 6;
        System.out.println(search(a, t, 0));
    }
    static boolean search(int arr[], int target, int index)
    {
       if(index>arr.length-1)
       return false;
    
     return arr[index]==target || search(arr, target, index+1);
   }}
   

