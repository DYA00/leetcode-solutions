// Solution for the problem of Combination Sum in the leetcode.
class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                List<Integer> nums = new ArrayList<>();
                nums.add(candidates[i]);
                findSum(candidates, i, candidates[i], target, nums);
            }
        }

        return result;
    }

    private void findSum(int[] candidates, int current, int sum, int target, List<Integer> nums) {
        if (sum == target) {
            result.add(new ArrayList<>(nums));
        }
        else if(sum < target) {
            for (int i = current; i < candidates.length; i ++) {
                nums.add(candidates[i]);
                if (sum + candidates[i] <= target) {
                    findSum(candidates, i, sum + candidates[i], target, nums);
                }
                nums.remove(nums.size() - 1);
            }
        }        
    }
}
