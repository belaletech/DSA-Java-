package GFGArray;
//Problem #4 : Merge two sorted Arrays
//
//        Description : We are given two sorted arrays arr1[ ] and arr2[ ] of size m and n respectively. We have to merge these arrays and store the numbers in arr3[ ] of size m+n.
//        Input
//        1 3 4 6
//        2 5 7 8
//        Output
//        1 2 3 4 5 6 7 8

public class GFGArray15MargeTwoSortedArray {
    public static void main(String[] args) {
        int arr1[]={1,3,4,6};
        int arr2[]={2,5,7,8};
        int [] mergedArray= mergeSortedArray(arr1,arr2);
        System.out.println("After sorting array");
        for(int i=0;i< mergedArray.length;i++)
        {
            System.out.print(mergedArray[i]+" ");
        }
    }
    public static int[] mergeSortedArray(int arr1[],int arr2[])
    {
        int m=arr1.length;
        int n=arr2.length;
        int arr3[]=new int[m+n];

        int i=0,j=0,k=0;
        while (i<m &&j<n)
        {
            if(arr1[i]<arr2[j])
            {
                arr3[k++]=arr1[i++];
            }
            else {
                arr3[k++]=arr2[j++];
            }
        }
        while (i<m)
        {
            arr3[k++]=arr1[i++];
        }
        while (j<n)
        {
            arr3[k++]=arr2[j++];
        }
        return arr3;
    }
}
