package GFGArray;
/*
Examples:

Input: a[] = {1, 2, 3, 4, 5, 7, 9}
Output: 5
Explanation:
The subarray {1, 2, 3, 4, 5} has alternating even and odd elements.

Input: a[] = {1, 3, 5}
Output: 1
Explanation:
There are only odd numbers, so we can count any one of them.
 */
public class GFGArray26MaximumEvenOddSubarrayEfficient {
    public static int maximumEvenOddSubArrayEfficient(int arr[],int n)
    {
        int res=1;
        int curr=1;
        for(int i=1;i<n;i++)
        {
            if((arr[i]%2==0&& arr[i-1]%2!=0)||(arr[i]%2!=0&& arr[i-1]%2==0))
            {
                curr++;
                res=Math.max(res,curr);
            }
            else
            {
                curr=1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 7, 9};
        int n=arr.length;
        System.out.println(maximumEvenOddSubArrayEfficient(arr,n));
    }
}
