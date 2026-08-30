// Solution for the problem, Permutations in the leetcode.
class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> permute(int[] nums) {
        result = new ArrayList<>();
        Arrays.sort(nums);
        findOrder(nums, new ArrayList<>(), new int[nums.length]);
        return result;
    }

    private void findOrder(int[] nums, List<Integer> order, int[] road) {
        if (order.size() == nums.length) {
            result.add(new ArrayList<>(order));
            return;
        }
        
        for (int i = 0; i < nums.length; i ++) {
            if(road[i] == 0) {
                road[i] = 1;
                order.add(nums[i]);

                findOrder(nums, order, road);

                order.remove(order.size() - 1);
                road[i] = 0;
            }
        }
    }
}
