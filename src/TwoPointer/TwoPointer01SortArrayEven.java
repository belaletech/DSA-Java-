package TwoPointer;
//Given an array of integers 'a' move all the even integer at the beginning of the array followed by all the odd integers. The realtive order of odd or even integers doses not matter.Return any array that satisfies the condition.

public class TwoPointer01SortArrayEven {
    public static void swap(int arr[],int left,int right){
       int temp=arr[left];
       arr[left]=arr[right];
       arr[right]=temp;

    }
    public static void sortArrayEven(int arr[]){
        int n=arr.length;
        int left=0,right=n-1;
        while (left<right){
            if(arr[left]%2==1 && arr[right]%2==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0)
            {
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={1,8,4,6,7,5,2,8,4};
        sortArrayEven(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
