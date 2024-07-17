package SortingAlgorithm;
/*Time complexity
    Best case         - o(n)
    Average case      - o(n*n)
    Worst case         -o(n*n)

    Note- It's stable sort
 */
public class Sorting01BubbleSort01 {
    public static void bubbleSort(int arr[])
    {
        int n=arr.length;
        int i,j,tmp;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[j]<arr[i])
                {
                    tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={35,10,31,11,26};
        int n= arr.length;
        bubbleSort(arr);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
