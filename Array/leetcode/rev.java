//import java.util.*;
class rev {
    public static void main(String[] args) {
        int ar[] = {1, 2, 3, 4};
         System.out.println(reverseArray(ar));
    }
    public static int[] reverseArray(int arr[]) {
        // code here
        int l = arr.length;
        int arev[] = new int[l];
        int i,j;
        for(i = l-1,j = 0; i>=0; i--,j++)
    {
        arev[j] = arr[i];
    }
        return arev;
    }
}
