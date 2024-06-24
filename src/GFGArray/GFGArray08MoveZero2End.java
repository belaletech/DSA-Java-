package GFGArray;

public class GFGArray08MoveZero2End {
    public static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void moveZero2End(int arr[])
    {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
           if(arr[i]!=0)
           {
               swap(arr,count,i);
               count++;
           }
        }
    }
}
