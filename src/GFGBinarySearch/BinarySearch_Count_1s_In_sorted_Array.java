package GFGBinarySearch;

public class BinarySearch_Count_1s_In_sorted_Array {
    public static int countOnes(int arr[],int n)
    {
        int first=0;
        int last=arr.length-1;
        while (first<=last)
        {
            int mid=first+(last-first)/2;
            if(arr[mid]==0)
            {
                first=mid+1;
            }
            else {
                if(mid==0 || arr[mid-1]==0)
                {
                    return (n-mid);
                }
                else {
                    last=mid-1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,1,1};
        int n=arr.length;
        int ans=countOnes(arr,n);
        System.out.println(ans);
    }
}
