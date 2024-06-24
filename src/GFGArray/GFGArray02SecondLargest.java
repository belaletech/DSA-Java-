package GFGArray;

public class GFGArray02SecondLargest {
    public static void main(String[] args) {
        int arr[]={10,12,1,24,26};
        System.out.println(secondLargest(arr));
    }

    public static int secondLargest(int arr[])
    {
        int largest=getLargest(arr);
        int n=arr.length;
        int res=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=arr[largest])
            {
                if(res==-1)
                {
                    res=i;
                } else if (arr[i]>arr[res]) {
                    res=i;
                }
            }
        }
        return res;
    }

    public  static int getLargest(int arr[])
    {
        int n=arr.length;
        int largest=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>arr[largest])
            {
                largest=i;
            }
        }
        return largest;
    }
}
