package GFGArray;
/*
Given an array arr[] of integers, find out the maximum difference between any two elements such that larger element appears after the smaller number.

        Examples :

        Input : arr = {2, 3, 10, 6, 4, 8, 1}
        Output : 8
        Explanation : The maximum difference is between 10 and 2.

        Input : arr = {7, 9, 5, 6, 3, 2}
        Output : 2
        Explanation : The maximum difference is between 9 and 7.
*/
public class GFGArray17MaximumDifference01 {
    /* The function assumes that there are at least two
	elements in array.
	The function returns a negative value if the array is
	sorted in decreasing order.
	Returns 0 if elements are equal */
    public static int maxDiff(int arr[],int n)
    {
        int max_diff=arr[1]-arr[0];
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[j]-arr[i]>max_diff)
                {
                    max_diff=arr[j]-arr[i];
                }
            }
        }
        return max_diff;
    }
    /*Driver program to test above function*/
    public static void main(String[] args) {
        int []arr = {2, 3, 10, 6, 4, 8, 1};
        System.out.println("Maximum difference is "+maxDiff(arr,7));
    }
}
