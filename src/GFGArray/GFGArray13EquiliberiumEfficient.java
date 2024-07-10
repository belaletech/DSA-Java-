package GFGArray;

public class GFGArray13EquiliberiumEfficient {
    public static int EquiliberiumIndex(int arr[])
    {
        int sum=0,n=arr.length;
        int leftSum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            sum-=arr[i];
            if(sum==leftSum)
            {
                return i;
            }
            leftSum+=arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {-7, 1, 5, 2, -4, 3, 0};
        int index = EquiliberiumIndex(arr);
        System.out.println("Equilibrium Index: " + index);
    }
}
