package GFGArray;

import java.util.Arrays;

public class GFGArray09LeftRotation {
    public static void leftRotation(int arr[])
    {
        int  n=arr.length;
        int last=n-1;
        for(int i=0;i<n;i++)
        {
            int temp=arr[i];
            arr[i]=arr[last];
            arr[last]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int []arr={1,2,3,4};
        leftRotation(arr);
    }
}
