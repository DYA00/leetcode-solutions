// Solution for the problem, Regular Expression Matching in the leetcode.
class Solution {
    public boolean isMatch(String s, String p) {
        return backTrack(s, p, 0, 0);
    }

    private boolean backTrack(String s, String p, int sIndex, int pIndex) {
        if (pIndex == p.length()) {
            return sIndex == s.length();
        }

        boolean firstMatch =
                sIndex < s.length() &&
                (s.charAt(sIndex) == p.charAt(pIndex)
                || p.charAt(pIndex) == '.');

        // Next pattern character is '*'
        if (pIndex + 1 < p.length()
                && p.charAt(pIndex + 1) == '*') {

            return backTrack(s, p, sIndex, pIndex + 2) 
                || (firstMatch && backTrack(s, p, sIndex + 1, pIndex));
        }

        if (firstMatch) {
            return backTrack(s, p, sIndex + 1, pIndex + 1);
        }

        return false;
    }
}
