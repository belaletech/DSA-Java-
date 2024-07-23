package Searching;

/*
Jump Search ->

Jump Search is a searching algorithm which works on sorted data.
Jump Search works on blocks. It first searches for the potential block,
once the potential block is found, the algorithm applies Linear search on the bloc,
if element is found return the index, otherwise return -1.

User can decide the block size, usually a block size of sqRoot(N) is choosen where N is the length of array.
Time complexity -> O(BlockSize) // BlockSize is usually sqroot(N)
 */
public class JumpSearchAlgo {
    public static int jumpSearch(int arr[],int target)
    {
        int n=arr.length;
        int blockSize=(int)Math.sqrt(n);
        int startIndex=0;
        int ednIndex=blockSize;

        //skip /jump the non-potential block..
        while (ednIndex<n && arr[ednIndex]<=target)
        {
            startIndex=ednIndex;
            ednIndex+=blockSize;
            if(ednIndex>n)
            {
                ednIndex=n;
            }
        }
        int res=-1;
        //apply linear search
        for(int i=startIndex;i<ednIndex;i++)
        {
            if(target==arr[i])
            {
                return i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={2,3,5,8,19,90};
        int target=90;
        int index=jumpSearch(arr,target);
        if(index==-1)
        {
            System.out.println("Element not found");
        }
        else{
            System.out.println("Found element at index "+index);
        }
    }

}
