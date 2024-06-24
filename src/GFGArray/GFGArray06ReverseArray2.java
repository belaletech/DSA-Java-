package GFGArray;


import java.util.Arrays;

public class GFGArray06ReverseArray2 {
    public static void swap(int arr[],int left,int right)
    {
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    public static void reverseArray(int arr[]) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[]={1,2,3};
        reverseArray(arr);
    }
}
