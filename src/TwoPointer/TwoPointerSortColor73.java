package TwoPointer;
//Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
//
//        We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
//
//        You must solve this problem without using the library's sort function.
//
//
//
//        Example 1:
//
//        Input: nums = [2,0,2,1,1,0]
//        Output: [0,0,1,1,2,2]
public class TwoPointerSortColor73 {
    public void swap(int nums[],int left,int right){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
    public void sortColors(int nums[])
    {
        int n=nums.length;
        int index=0,left=0,right=n-1;
        while (index<=right){
            if(nums[index]==0){
                swap(nums,index,left);
                index++;
                left++;
            }
        }
    }
}
