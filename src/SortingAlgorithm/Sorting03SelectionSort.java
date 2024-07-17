package SortingAlgorithm;

public class Sorting03SelectionSort {
    public static void SelectionSort(int arr[])
    {
        for(int i=0;i< arr.length;i++)
        {
            //find the max item in the remaining array and swap with the correct index
            int last= arr.length-i-1;
            int maxIndex=getMaxIndex(arr, 0, last);
            swap(arr,maxIndex,last);
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int tmp=arr[first];
        arr[first]=arr[second];
        arr[second]=tmp;
    }

    private static int getMaxIndex(int[] arr, int start, int last) {
        int max=start;
        for(int i=start;i<=last;i++)
        {
            if(arr[max]<arr[i])
            {
                max=i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[]={12,10,18,11,9,4};
        SelectionSort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
