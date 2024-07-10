package GFGArray;

/*
2) Efficient Approach (Valley Peak Approach):
In this approach, we just need to find the next greater element and subtract it from the current element so that the difference keeps increasing until we reach a minimum. If the sequence is a decreasing sequence, so the maximum profit possible is 0.

Follow the steps below to solve the problem:

maxProfit = 0
if price[i] > price[i – 1]
maxProfit = maxProfit + price[i] – price[i – 1]
Below is the implementation of the above approach:
 */

public class GFGArray21StockBuy03 {
    public static int maxProfit(int price[],int n)
    {
        int profit=0;
        for(int i=1;i<n;i++)
        {
            if(price[i]>price[i-1])
            {
                profit+=price[i]-price[i-1];
            }
        }
        return profit;
    }
    public static void main(String args[])
    {
        int arr[]={1,5,3,8,12};
        int n=arr.length;
        System.out.println(maxProfit(arr,n));
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==1) return 0;
        int profit=0;
        int left=0;
        for(int right=1;right<prices.length;right++)
        {
            if(prices[right]>prices[left])
            {
                profit=Math.max(profit,prices[right]-prices[left]);
            }
            else
            {
                left=right;
            }
        }
        return profit;

    }
}
