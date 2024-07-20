package BinarySearch;

public class binarySearch001 {
    public static void main(String[] args) {
        int arr[]={2,4,6,22,27};
        int target=22;
        int ans=binarySearchNew(arr,target);
        System.out.println(ans);
    }
    public static int binarySearchNew(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            {
                return mid-1;
            } else if (target>arr[mid]) {
                return mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
