package GFGArray;

public class GFGArray01LargetElement {
    static int getLarget(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            boolean flag=true;
            for(int j=0;j<n;j++)
            {
                if(arr[j]>arr[i])
                {
                    flag=false;
                    break;
                }
            }
            if(flag==true)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={15,5,28,12,51,101,2};
        System.out.println(getLarget(arr));
    }
}
