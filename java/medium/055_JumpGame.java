// Solution for the problem, Jump Game in the leetcode
class Solution {
    public boolean canJump(int[] nums) {
        int farthest = 0;

        for(int i = 0; i < nums.length; i++) {
            if (farthest < i) {
                return false;
            }

            farthest = Math.max(farthest, i + nums[i]);

            if (farthest >= nums.length) {
                return true;
            }
        }

        return true;
    }
}
