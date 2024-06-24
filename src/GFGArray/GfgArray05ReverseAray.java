package GFGArray;

import java.util.ArrayList;

public class GfgArray05ReverseAray {
    public static void reverseArray(int arr[])
    {
        int n=arr.length;
        int last= arr.length-1;
        ArrayList arrayList=new ArrayList();
        for(int i=last;i>=0;i-- )
        {
            arrayList.add(arr[i]);
        }
        System.out.println(arrayList);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3};
        reverseArray(arr);
    }
}
