package GFGArray;
//You are given an array arr[] of N integers. The task is to find the smallest positive number missing from the array.
//
//        Note: Positive number starts from 1.
//
//        Example 1:
//
//        Input:
//        N = 5
//        arr[] = {1,2,3,4,5}
//        Output: 6
//        Explanation: Smallest positive missing
//        number is 6.
//        Example 2:
//
//        Input:
//        N = 5
//        arr[] = {0,-10,1,3,-20}
//        Output: 2
//        Explanation: Smallest positive missing
//        number is 2.
//        Your Task:
//        The task is to complete the function missingNumber() which returns the smallest positive missing number in the array.
//
//        Expected Time Complexity: O(N).
//        Expected Auxiliary Space: O(1).
//
//        Constraints:
//        1 <= N <= 106
//        -106 <= arr[i] <= 106
public class GFGArray11SmallestPositiveMissing {
    static int missingNumber(int arr[],int size)
    {   //Segregate postive numbers from others
        int shift=segregate(arr,size);

        //Consider the array with only positve numbers
        int newSize=size-shift;
        int [] newArr=new int[newSize];
        for(int i=0;i<newSize;i++)
        {
            newArr[i]=arr[i+shift];
        }
        //Mark the presence of element
        for(int i=0;i<newSize;i++)
        {
            int x=Math.abs(newArr[i]);
            if(x-1<newSize && newArr[x-1]>0)
            {
                newArr[x-1]=-newArr[x-1];
            }
        }
        //find th first positve index
        for(int i=0;i<newSize;i++)
        {
            if(newArr[i]>0)
            {
                return i+1;
            }
        }
        return newSize+1;

    }
    static int segregate(int arr[],int size)
    {
        int j=0;
        for(int i=0;i<size;i++)
        {
            if(arr[i]<=0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int n=5;
        int arr[]={1,2,3,4,5};
        System.out.println(missingNumber(arr,n));

    }
}
