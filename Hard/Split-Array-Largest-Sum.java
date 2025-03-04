class Solution {
    public int splitArray(int[] nums, int k) {
        int low = getMax(nums);  // Minimum possible max sum (largest single element)
        int high = getSum(nums); // Maximum possible max sum (sum of all elements)

        while (low < high) {
            int mid = low + (high - low) / 2;
            int partitions = countSubarrays(nums, mid);

            if (partitions > k) {
                // If we need more partitions, increase min sum bound
                low = mid + 1;
            } else {
                // Try to minimize the largest sum
                high = mid;
            }
        }
        return low;
    }

    private int countSubarrays(int[] nums, int maxSum) {
        int partitions = 1;
        int sum = 0;

        for (int num : nums) {
            if (sum + num > maxSum) {
                partitions++;  // Start a new subarray
                sum = num;
            } else {
                sum += num;
            }
        }
        return partitions;
    }

    private int getMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }

    private int getSum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}
