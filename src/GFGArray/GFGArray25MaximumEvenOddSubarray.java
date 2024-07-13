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
public class GFGArray25MaximumEvenOddSubarray {
    public static int maxEvenOdd(int arr[],int n)
    {
        int res=1;
        for(int i=0;i<n;i++)
        {
            int curr=1;
            for(int j=i+1;j<n;j++)
            {
                if((arr[j]%2==0 && arr[j-1]%2!=0)|| (arr[j]%2!=0 &&arr[j-1]%2==0))
                {
                    curr++;
                }
                else {
                    break;
                }
            }
            res=Math.max(res,curr);
        }
        return res;
    }

    public static void main(String[] args) {
       int  a[] = {1, 2, 3, 4, 5, 7, 9};
       int n=a.length;
        System.out.println(maxEvenOdd(a,n));
    }
}
/*
1)Naive Approach
The idea is to consider every subarray and find the length of even and odd subarrays.

Time Complexity: O(n2), Iterating over every subarray therefore N2 are possible
Auxiliary Space: O(1)


2)Efficient Approach
By simply storing the nature of the previous element we encounter( odd or even) and comparing it with the next element.

Time Complexity: O(n), Since we need to iterate over the whole array once
Auxiliary Space: O(1)
 */