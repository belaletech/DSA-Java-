package GFGArray;

public class GFGArray01LargetElement2 {
    static int getLargest(int arr[])
    {
        int res=0;
        for(int i=1;i< arr.length;i++)
        {
            if(arr[i]>arr[res])
            {
                res=i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={10,101,25};
        System.out.println(getLargest(arr));
    }
}
