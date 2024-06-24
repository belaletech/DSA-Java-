package GFGArray;

public class GFGArray03CheckArrayIsSorted {
    public static boolean checkSortedArray(int [] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[]={2,1,3};
        System.out.println(checkSortedArray(arr));
    }
}
