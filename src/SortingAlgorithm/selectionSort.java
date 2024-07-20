package SortingAlgorithm;

public class selectionSort {
    public static void selectionSort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int end= arr.length-i-1;
            int maxIndex=getMaxIndex(arr,0,end);
            swap(arr,maxIndex,end);
        }
    }
    public static int getMaxIndex(int arr[],int start,int end)
    {
       int max=start;
       for(int i=start;i<=end;i++)
       {
           if(arr[max]<arr[i])
           {
               max=i;
           }
       }
       return max;
    }
    public static void swap(int arr[],int first,int second)
    {
        int tmp=arr[first];
        arr[first]=arr[second];
        arr[second]=tmp;
    }

    public static void main(String[] args) {
        int arr[]={25,10,11,36,2,23};
        selectionSort(arr);
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
