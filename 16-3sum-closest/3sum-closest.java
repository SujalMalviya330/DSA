class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int closest = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {

            int low = i + 1;
            int high = nums.length - 1;

            while (low < high) {

                int sum = nums[i] + nums[low] + nums[high];

                // Check if current sum is closer
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }

                // Exact answer
                if (sum == target) {
                    return sum;
                }

                if (sum < target) {
                    low++;
                } else {
                    high--;
                }
            }
        }

        return closest;
    }
}
