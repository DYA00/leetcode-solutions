//Solution for Two Sum in leetcode problem

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int first = 0;
        int second = 0;
        boolean found = false;

        for (int i = 0; i < nums.length & !found; i++) {
            for (int j = i + 1; j < nums.length & !found; j++) {
                if (nums[i] + nums[j] == target) {
                    first = i;
                    second = j;
                    found = true;
                }
            }
        }

        int[] answer = { first, second };
        return answer;
    }
}
