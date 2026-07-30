// Solution for the problem, Search in Rotated Sorted Array in the leetcode.
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int med = (int) Math.floor((left + right)/2);

            if (nums[med] == target) {
                return med;
            }
            
            if (nums[left] <= nums[med]) {
                if (nums[left] <= target && target < nums[med]) {
                    right = med - 1;
                }
                else {
                    left = med + 1;
                }
            }
            else {
                if (nums[med] < target && target <= nums[right]) {
                    left = med + 1;
                }
                else {
                    right = med - 1;
                }
            }
        }

        return -1;
    }
}
