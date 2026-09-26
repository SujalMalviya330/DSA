class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        return new int[]{first, last};
    }

    public int findFirst(int[] nums, int target) {
        int l = 0;
        int h = nums.length - 1;
        int ans = -1;

        while (l <= h) {
            int m = l + (h - l) / 2;

            if (nums[m] == target) {
                ans = m;
                h = m - 1;       // left jao
            } 
            else if (nums[m] > target) {
                h = m - 1;
            } 
            else {
                l = m + 1;
            }
        }

        return ans;
    }

    public int findLast(int[] nums, int target) {
        int l = 0;
        int h = nums.length - 1;
        int ans = -1;

        while (l <= h) {
            int m = l + (h - l) / 2;

            if (nums[m] == target) {
                ans = m;
                l = m + 1;       // right jao
            } 
            else if (nums[m] > target) {
                h = m - 1;
            } 
            else {
                l = m + 1;
            }
        }

        return ans;
    }
}
