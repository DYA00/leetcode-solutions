// Solution for the Remove Duplicates from Sorted Array problem in the leetcode.
class Solution {
    public int removeDuplicates(int[] nums) {
        int current = nums[0];
        int prev;
        int k = 1;
        
        for (int i = 1; i < nums.length; i++) {
            prev = current;
            current = nums[i];
            if (current > prev) {
                nums[k] = current;
                k ++;
            }
        }

        return k;
    }
}
