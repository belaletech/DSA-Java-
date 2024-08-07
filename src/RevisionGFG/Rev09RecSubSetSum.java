package RevisionGFG;

public class Rev09RecSubSetSum {
    static int CountSumSubSet(int arr[],int n,int sum)
    {
        if(n==0)
        {
            return (sum==0)?1:0;
        }
        return CountSumSubSet(arr,n-1,sum)+CountSumSubSet(arr,n-1,sum-arr[n-1]);
    }

    public static void main(String[] args) {
        int arr[]={10,20,15};
        int n= arr.length;
        int sum=25;
        System.out.println(CountSumSubSet(arr,n,sum));
    }
}
