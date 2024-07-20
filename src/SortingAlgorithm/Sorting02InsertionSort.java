package SortingAlgorithm;
/*
    Time Complexity
    case            Time Complexity
    Best case           -o(n)
    Average case        -o(n*n)
    Worst case          -o(n*n)

   Note - It's stable sorting algorithm
          Efficient for sort data set
 */
public class Sorting02InsertionSort {
    public static void swap(int arr[],int first,int second)
    {
        int tmp=arr[first];
        arr[first]=arr[second];
        arr[second]=tmp;
    }

    public static void InsetionSort (int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }

        }
    }

    public static void main(String[] args) {
        int arr[]={6,8,3,9,12,30};
        InsetionSort(arr);
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
