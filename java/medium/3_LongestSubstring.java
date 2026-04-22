//Solution for the problem, Longest Substring Without Reapting Characters in the leetcode.
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int left = 0;
        HashSet<Character> used = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);

            while (used.contains(current)) {
                used.remove(s.charAt(left));
                left++;
            }

            used.add(current);
            result = Math.max(result, right - left + 1);
        }

        return result;
    }
}
