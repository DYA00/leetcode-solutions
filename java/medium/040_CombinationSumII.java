// Solution for the problem, Combination Sum II in the leetcode.
class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        findCombination(candidates, new ArrayList<>(), 0, target);
        return result;
    }

    private void findCombination(int[] candidates, List<Integer> temp, int position, int target) {        
        if (target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }
        if (position >= candidates.length) {
            return;
        }
        for (int i = position; i < candidates.length; i++) {
            if (i > position && candidates[i] == candidates[i-1]) {
                continue;
            }
            if (candidates[i] > target) {
                break;
            }
            temp.add(candidates[i]);
            findCombination(candidates, temp, i + 1, target - candidates[i]);
            temp.remove(temp.size()-1);
        }
    }
}
