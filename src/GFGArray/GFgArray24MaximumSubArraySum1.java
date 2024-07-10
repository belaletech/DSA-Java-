package GFGArray;

import java.util.Vector;

/*
Given an array arr[], the task is to find the elements of a contiguous subarray of numbers that has the largest sum.

Examples:

Input: arr = [-2, -3, 4, -1, -2, 1, 5, -3]
Output: [4, -1, -2, 1, 5]
Explanation:
In the above input the maximum contiguous subarray sum is 7 and the elements of the subarray are [4, -1, -2, 1, 5]

Input: arr = [-2, -5, 6, -2, -3, 1, 5, -6]
Output: [6, -2, -3, 1, 5]
Explanation:
In the above input the maximum contiguous subarray sum is 7 and the elements
of the subarray are [6, -2, -3, 1, 5]
 */
public class GFgArray24MaximumSubArraySum1 {
    public static void main(String[] args)
    {
        // Given array arr[]
        Vector<Integer> arr = new Vector<Integer>();
        arr.add(-2);
        arr.add(-5);
        arr.add(6);
        arr.add(-2);
        arr.add(-3);
        arr.add(1);
        arr.add(5);
        arr.add(-6);

        // Function call
        subArrayWithMaxSum(arr);
    }
    public static void subArrayWithMaxSum(Vector<Integer>nums)
    {
        //initialize currMax and globalMax with the first value of nums
        int endIndex=0,currMax=nums.get(0);
        int globalMax=nums.get(0);

        //Iterate for all the elements of the array
        for(int i=1;i<nums.size();i++)
        {
            //update currMax
            currMax=Math.max(nums.get(i),nums.get(i)+currMax);
            //check if currMax is greater than globalMax
            if(currMax>globalMax)
            {
                globalMax=currMax;
                endIndex=i;
            }
        }
        int startIndex=endIndex;
        //Traverse in left direction to find start index of subarray to find index of subarray
        while (startIndex>=0)
        {
            globalMax-=nums.get(startIndex);
            if(globalMax==0)
            {
                break;
            }
            startIndex--;
        }
        //printing the element of subarray with max sum
        for (int i=startIndex;i<=endIndex;++i)
        {
            System.out.print(nums.get(i)+" ");
        }
    }
}
