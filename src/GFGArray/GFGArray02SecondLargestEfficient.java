package GFGArray;

public class GFGArray02SecondLargestEfficient {
    public static void main(String[] args) {
        int arr[]={12,2,78,15,25};
        System.out.println(getSecondLargest(arr));
    }
    public static int getSecondLargest(int arr[])
    {
        int n=arr.length;
        int res=-1,largest=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>arr[largest])
            {
                res=largest;
                largest=i;
            }
            else if (arr[i]!=arr[largest])
            {
                if(res==-1 ||arr[i]>arr[res])
                {
                    res=i;
                }
            }
        }
        return res;
    }
}
