package GFGArray;

import static java.lang.Integer.MIN_VALUE;

//Description : We are given an array of positive and negative integers. We have to find the subarray having maximum sum.
//        Input
//        [-3, 4, -1, -2, 1, 5]
//        Output
//        7
//        (4+(-1)+(-2)+1+5)
public class GFGArray14LargestSumSubArray {
    public static int largestSum(int arr[])
    {
        int n=arr.length;
        int max_so_far=MIN_VALUE;
        int max_ending_here=0;
        for(int i=0;i<n;i++)
        {
            max_ending_here+=arr[i];
            if(max_ending_here>max_so_far)
            {
                max_so_far=max_ending_here;
            }
            if(max_ending_here<0)
            {
                max_ending_here=0;
            }
        }
        return max_so_far;
    }
    public static void main(String [] args)
    {
        int arr[]={-3, 4, -1, -2, 1, 5};
        System.out.println(largestSum(arr));
    }
}
