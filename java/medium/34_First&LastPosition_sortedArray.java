// Solution for the problem, Find First and Last Position of Element in Sorted Array in the leetcode.
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = findStart(nums, target);
        int end = findEnd(nums, target);

        return new int[] {start, end};
    }

    private int findStart(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;

        if (right == -1) return -1;

        while (left <= right) {
            int med = (left + right) / 2;

            if (nums[med] == target) {
                result = med;
                right = med - 1;
            }
            else if (nums[med] < target) {
                left = med + 1;
            }
            else {
                right = med - 1;
            }
        }

        return result;
    }

    private int findEnd(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;

        if (right == -1) return -1;

        while (left <= right) {
            int med = (left + right) / 2;

            if (nums[med] == target) {
                result = med;
                left = med + 1;
            }
            else if (nums[med] < target) {
                left = med + 1;
            }
            else {
                right = med - 1;
            }
        }

        return result;
    }
}
