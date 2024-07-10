package GFGArray;
/*
Given an array of N non-negative integers arr[] representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

Examples:

Input: arr[] = {2, 0, 2}
Output: 2
Explanation: The structure is like below.
We can trap 2 units of water in the middle gap
 */

/*
Approach 1 (Brute Approach): This approach is the brute approach. The idea is to:

Traverse every array element and find the highest bars on the left and right sides. Take the smaller of two heights. The difference between the smaller height and the height of the current element is the amount of water that can be stored in this array element.

Follow the steps mentioned below to implement the idea:

Traverse the array from start to end:
For every element:
Traverse the array from start to that index and find the maximum height (a) and
Traverse the array from the current index to the end, and find the maximum height (b).
The amount of water that will be stored in this column is min(a,b) – array[i], add this value to the total amount of water stored
Print the total amount of water stored.

 */
public class GFGArray22TrappingWater {
    public static int maxWater(int []arr,int n)
    {
        //To Store the maximum water that can be stored
        int res=0;

        //For every element of the array except first and last element
        for(int i=1;i<n-1;i++)
        {
            //find the maximum element on its left
            int left=arr[i];
            for(int j=0;j<i;j++)
            {
                left=Math.max(left,arr[j]);
            }
            //find maximum element on it's right
            int right=arr[i];
            for(int j=i+1;j<n;j++)
            {
                right=Math.max(right,arr[j]);
            }
            //update the maximum water value
            res+=Math.min(left,right)-arr[i];
        }
        return res;
    }
    // Driver code
    public static void main(String[] args)
    {
        int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int n = arr.length;

        System.out.print(maxWater(arr, n));
    }
}
