//Solution for the problem, Contains Duplicate II in the leetcode.
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i ++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            }
            else {
                int apart = Math.abs(map.get(nums[i]) - i);
                if (apart <= k) return true;
                map.put(nums[i], i);
            }
        }

        return false;
    }
}
