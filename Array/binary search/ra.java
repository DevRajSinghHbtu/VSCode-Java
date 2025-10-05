
class ra
{
    public static void main(String[] args)
  {
   
      int[] arr = {4, 5, 6, 1, 2, 3};
      int target = 6;
    //  int pivot = main(arr);
      //System.out.println(pivot);
      int find = searchtarget(arr,target);
      System.out.println(find);
      
  }
  static int searchtarget(int[] arr, int target)
  {
    int pivot = findpivot(arr);
    if(pivot==-1)
    {
    return binarysearch(arr, target, 0, arr.length-1);
    }
    else if(arr[0]<target)
    {
        return binarysearch(arr, target, 0, pivot);
    }
    else
    {
        return binarysearch(arr, target, pivot, arr.length-1);
    }
  }
  static int binarysearch(int[] ar, int target, int s, int e)
    {
        
        while(s<=e)
        {
            int mid = s+(e-s)/2;
            if(ar[mid]>target)
           {
            e = mid-1;
           }
           else if(ar[mid]<target)
           {
            s = mid+1;
           }
           else
           {
            return mid;
           }
        }
        return -1;
}
  static int findpivot(int [] arr)
  {
    int s = 0;
    int e = arr.length-1;
    while(s<=e)
    {
        int mid = s + (e-s)/2;
        if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1])
        {
          return mid;
        }
        if(arr[s]>arr[s+1])
        {
            return s;
        }
        if(arr[e]>arr[s])
        {
           return -1;
        }
        
        else if(arr[s]>arr[mid])
        {
          e = mid-1;
        }
        else
        {
          s = mid+1;
        }
    }
    return -1;
  }
}
