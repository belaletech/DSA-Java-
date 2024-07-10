package GFGArray;
// Answer should be in n time complexity
/*
    The function assumes that there are at least two
	elements in array.
	The function returns a negative value if the array is
	sorted in decreasing order.
	Returns 0 if elements are equal
 */
public class GFGArray18MaximumDifference02 {
    public static int MaximumDifference2(int arr[],int n)
    {
        int maxDiff=arr[1]-arr[0];
        int minElement=arr[0];
        int i;
        for(i=1;i<n;i++)
        {
            if(arr[i]-minElement>maxDiff)
            {
                maxDiff=arr[i]-minElement;
            }
            if(arr[i]<minElement)
            {
                minElement=arr[i];
            }
        }

        return maxDiff;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 90, 10, 110};
        int n=arr.length;
        System.out.println("maximum difference is "+MaximumDifference2(arr,n));
    }
}
