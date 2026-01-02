// Solution for the problem Length of the Last Word in LeetCode.
class Solution {
    public int lengthOfLastWord(String s) {
        int blank = 0;
        String lastWord = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 1).equals(" ")) {
                blank = i + 1;
            }
            else {
                lastWord = s.substring(blank, i + 1);
            }
        }

        return lastWord.length();
    }
}
