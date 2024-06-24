package BinarySearch;

public class BinarySearch01 {
    //if target not found return -1
    public static int BinarySearch(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;
        while (start<=end)
        {
//            it might be (start+end)/2 exceed the size of int
//            int mid=(start+end)/2;
//            for avoid this we try another approch
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            {
                return mid-1;
            }
            else if (target>arr[mid])
            {
                return mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={-12,-10,-2,0,4,6,10,12,14,15,19};
        int target=10;
        int result=BinarySearch(arr,target);
        System.out.println(result);
    }
}
