package GFGArray;
/*
Java program to find maximum amount of water that can
be trapped within given set of bars.
 */
public class GFGArray23TrappingWater02 {
    public static int findWater(int height[]){
        int n=height.length;

        //left[i] contains height of tallest bar to the left of ith bar including itself
        int left[]=new int[n];

        //right[i] contains height of tallest bar to the right of ith bar including itself
        int right[]=new int[n];

        //initialize result
        int res=0;

        //fill the left array
        left[0]=height[0];
        for(int i=1;i<n;i++)
        {
            left[i]=Math.max(left[i-1],height[i]);
        }

        //fill the right array
        right[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            right[i]=Math.max(right[i+1],height[i]);
        }

        /*
        // Calculate the accumulated water element by
		// element consider the amount of water on i'th bar,
		// the amount of water accumulated on this
		// particular bar will be equal to min(left[i],
		// right[i]) - arr[i] .
         */
        for(int i=0;i<n;i++)
        {
            res+=Math.min(left[i],right[i])-height[i];
        }
        return res;
    }
    public static void main(String[] args)
    {
        int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.print(findWater(arr));
    }
}
