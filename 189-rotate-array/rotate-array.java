class Solution {
    public static void reverse(int [] nums , int low , int high){
        while(low<high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int low = 0;
        int high = n-k-1;

        reverse(nums, low , high);
        reverse(nums , high+1 ,n-1);
        reverse(nums ,low ,n-1);
        
    }
}