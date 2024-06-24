package ArrayQuestion;

public class ArrayLargestViaTwoPointer {
    public static int FindlargestElement(int arr[]){
        int max=0;
        int n=arr.length;
        int left=0,right=n-1;
        while (left<right){
            if(arr[left]>arr[right]){
                left++;
            }

        }
        return 0;
    }
}
