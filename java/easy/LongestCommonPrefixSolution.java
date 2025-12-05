// Solution for Longest Common Prefix problem in leetcode

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            String current = strs[i];

            while (current.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
