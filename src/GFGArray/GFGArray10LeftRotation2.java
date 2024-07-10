package GFGArray;

import java.util.Arrays;

public class GFGArray10LeftRotation2 {
    public static void leftRotateOne(int arr[])
    {
        int n= arr.length;
        int last=n-1;
        int temp=arr[0];
        for(int i=0;i<n-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[last]=temp;
    }
    public static void leftRotation(int arr[],int d){
        for(int i=0;i<d;i++)
        {
            leftRotateOne(arr);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int d=2;
        leftRotation(arr,2);
    }
}
