package GFGBinarySearch;

public class BinarySearch02Recursive {
    public static int bSearchRecursive(int arr[],int start,int end,int x)
    {
        if(start>end) return -1;
        int mid=start+(end-start)/2;
        if(arr[mid]==x)return mid;
        if(arr[mid]>x)
        {
            return bSearchRecursive(arr,start,mid-1,x);
        }
        else return bSearchRecursive(arr,mid+1,end,x);
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70}, n = 7;

        int x = 20;
        System.out.print(bSearchRecursive(arr,0,n-1,x));
    }
}
