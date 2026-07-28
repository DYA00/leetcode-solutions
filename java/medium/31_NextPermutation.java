// Solution for the problem, Next Permutaion in the leetcode.
class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        clean(nums, i+1, nums.length-1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

    private void clean(int[] nums, int left, int right) {
        while (right > left) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}
