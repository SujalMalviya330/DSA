class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;

        if (n <= 2) {
            return true;
        }

        int i = 0;
        int j = 1;

        // Find the direction
        while (j < n && nums[i] == nums[j]) {
            i++;
            j++;
        }

        if (j == n) {
            return true; // All elements are equal
        }

        boolean increasing = nums[i] < nums[j];

        // Check the rest
        while (j < n) {
            if (increasing && nums[i] > nums[j]) {
                return false;
            }

            if (!increasing && nums[i] < nums[j]) {
                return false;
            }

            i++;
            j++;
        }

        return true;
    }
}
