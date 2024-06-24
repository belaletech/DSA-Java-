package PwSkills;

public class pw01ArrayReverseInplace {
    public static void reverseArray(int arr[])
    {
        int i=0,j= arr.length-1;
        while (i<j)
        {
            swapInArray(arr,i,j);
            i++;
            j--;
        }
    }
    static void swapInArray(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        reverseArray(arr);
//        System.out.println(reverseArray(arr));
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
