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

    public static void InsetionSort (int arr[])
    {
        int i,j,tmp;
        int n=arr.length;
        for(i=1;i<n;i++)
        {
            tmp=arr[i];
            j=i-1;
            while (j>=0 && tmp<=arr[j])
            {
                arr[j+1]=arr[i];
                j=j-1;
            }
            arr[j+1]=tmp;
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
