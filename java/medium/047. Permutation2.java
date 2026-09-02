// Solution for the problem, Permutation II in the leetcode.
class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> permuteUnique(int[] nums) {
        result = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backTrack(nums, new ArrayList<>(), used);
        return result;
    }

    private void backTrack(int[] nums, List<Integer> permutation, boolean[] used) {
        if (permutation.size() == nums.length) {
            result.add(new ArrayList<>(permutation));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i] == true) {
                continue;
            }

            if (i > 0 && nums[i] == nums[i-1] && !used[i-1]) {
                continue;
            }

            permutation.add(nums[i]);
            used[i] = true;

            backTrack(nums, permutation, used);

            permutation.remove(permutation.size()-1);
            used[i] = false;
        }
    }
}
