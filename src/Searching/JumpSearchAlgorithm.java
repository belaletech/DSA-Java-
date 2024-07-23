package Searching;

public class JumpSearchAlgorithm {
    public static int jumpSearchR(int arr[],int target)
    {
        int n=arr.length;
        int  blockSize=(int)Math.sqrt(n);
        int startIndex=0;
        int endIndex=blockSize;

        //skip or jump to the non=potential jump
        while(endIndex<n && arr[endIndex]<=target)
        {
            startIndex=endIndex;
            endIndex+=blockSize;
            if(endIndex>n)
            {
                endIndex=n;
            }
        }
        for(int i=startIndex;i<endIndex;i++)
        {
            if(target==arr[i])
            {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,12,24,35,45,96,112};
        int target=45;
        int index=jumpSearchR(arr,target);
        if(index==-1)
        {
            System.out.println("Not found");
        }
        else {
            System.out.println("Found element at index "+index);
        }
    }
}
