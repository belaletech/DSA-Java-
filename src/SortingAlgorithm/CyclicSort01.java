package SortingAlgorithm;

public class CyclicSort01 {
    public static void main(String[] args) {
        int arr[]={3,1,2,5,4};
        sortArray(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" b");
        }
    }

    public static int[] sortArray(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct])
            {
                swap(nums,i,correct);
            }
            else
            {
                i++;
            }
        }
        return nums;
    }

    public static void swap(int arr[],int start,int second)
    {
        int tmp=arr[start];
        arr[start]=arr[second];
        arr[second]=tmp;
    }
}
