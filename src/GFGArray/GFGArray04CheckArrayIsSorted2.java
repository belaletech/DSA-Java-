package GFGArray;

public class GFGArray04CheckArrayIsSorted2 {
    public static boolean isSorted(int arr[])
    {
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={1,2,0};
        System.out.println(isSorted(arr));
    }
}
