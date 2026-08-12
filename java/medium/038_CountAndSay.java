// Solution for the problem, Count and Say in the leetcode.
class Solution {
    public String countAndSay(int n) {
        String result = "1";

        for (int i = 1; i < n; i++) {
            result = RLE(result);
        }

        return result;
    }

    private String RLE(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i ++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                count++;
            }
            else {
                sb.append(count);
                sb.append(s.charAt(i-1));
                count = 1;
            }
        }

        sb.append(count);
        sb.append(s.charAt(s.length() - 1));

        return sb.toString();
    }
}
