package GFGArray;
//A[0] + A[1] + ... A[i-1] = A[i+1] + A[i+2] ... A[n-1]
//
//
//        Input
//        [-7, 1, 5, 2, -4, 3, 0]
//        Output
//        3
//        A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
//
//
//        Naive Solution : We can iterate for each index i and calculate the leftsum and rightsum and check whether they are equal.
public class GFGArray12EquiliberiumNaive {
    public static int equileberiumIndex(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int leftSum=0;
            for(int j=0;j<i;j++)
            {
                leftSum+=arr[i];
            }
            int rightSum=0;
            for(int j=i+1;j<n;j++)
            {
                rightSum+=arr[i];
            }
            if(leftSum==rightSum)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String [] args)
    {
        int arr[]={-7, 1, 5, 2, -4, 3, 0};
        int index=equileberiumIndex(arr);
        System.out.println("Equilibrium "+index);
    }
}
