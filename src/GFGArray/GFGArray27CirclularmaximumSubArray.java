package GFGArray;

/*
Given a circular array of size n, find the maximum subarray sum of the non-empty subarray.

Examples:

Input: arr[] = {8, -8, 9, -9, 10, -11, 12}
Output: 22
Explanation: Subarray 12, 8, -8, 9, -9, 10 gives the maximum sum, that is 22.

Input: arr[] = {10, -3, -4, 7, 6, 5, -4, -1}
Output:  23
Explanation: Subarray 7, 6, 5, -4, -1, 10 gives the maximum sum, that is 23.

Input: arr[] = {-1, 40, -14, 7, 6, 5, -4, -1}
Output: 52
Explanation: Subarray 7, 6, 5, -4, -1, -1, 40 gives the maximum sum, that is 52.
 */
public class GFGArray27CirclularmaximumSubArray {
    public static int maxCircularSum(int arr[],int n)
    {
        int res=arr[0];
        for(int i=0;i<n;i++)
        {
            int curr_max=arr[i];
            int curr_sum=arr[i];
            for(int j=1;j<n;j++)
            {
                int index=(i+j)%n;
                curr_sum+=arr[index];
                curr_max=Math.max(curr_sum,curr_max);
            }
            res=Math.max(res,curr_max);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {5, -2, 3, 4}, n = 4;
        System.out.println(maxCircularSum(arr,n));
    }
}
