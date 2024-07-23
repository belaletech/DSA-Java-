package GFGBinarySearch;
/*
int arr[] = {10, 20, 30, 40, 50, 60}, n = 6;

 */
public class BinarySearch01Iterative {
    public static int bSearch(int arr[],int x)
    {
        int n=arr.length;
        int start=0,end=n-1;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==x)
            {
                return mid;
            } else if (arr[mid]>x) {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={2,4,8,12,24,36};
        int x=24;
        int ans=bSearch(arr,x);
        System.out.print(ans);
    }
}
