public class sorted {
    public static void main(String[] args) {
        int ar[] = {1, 2, 3, 4, 5};
        System.out.println(sorted(ar, 0));
    }
    static boolean sorted(int arr[], int index)
    {
        if(index == arr.length-1)
        {
            return true;
        }
        return arr[index]<arr[index + 1] && sorted(arr, index+1);
    }
}
