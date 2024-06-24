package BinarySearch;

public class BinarySearch02OrderAgnostic {
    static int orderAgnosticBS(int [] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        boolean isAC=arr[start]<arr[end];
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;

            }
            if(isAC)
            {
                if(target<arr[mid])
                {
                    end= mid-1;
                }
                else if(target>arr[mid])
                {
                    start=mid+1;
                }
            }
            else
            {
                if(target>arr[mid])
                {
                    end=mid-1;
                }
                else if(target<arr[mid])
                {
                    start=mid=1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={-12,-10,-2,0,4,6,10,12,14,15,19};
        int target=10;
        int ans=orderAgnosticBS(arr,target);
        System.out.println(ans);
    }
}
