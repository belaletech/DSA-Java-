package Searching;

public class TernarySearchAlgo {
    public static int ternarySearch(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;

        int index=-1;
        while (start<=end)
        {
            int mid1=start+(end-start)/3;
            int mid2=end-(end-start)/3;
            if(target<=arr[mid1])
            {
                if(target==arr[mid1])
                {
                    index=mid1;
                    break;
                }
                end=mid1-1;
            } else if (target>=arr[mid2]) {
                if(target==arr[mid2])
                {
                    index=mid2;
                    break;
                }
                start=mid2+1;
            }
            else {
                start=mid1+1;
                end=mid2-1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[]={1,3,5,7,9,11,14,24,78,99};
        int target=78;
        int index=ternarySearch(arr,target);
        if(index==-1)
        {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at index "+index);
        }
    }
}
