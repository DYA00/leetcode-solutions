//Solution for the problem, Letter Combinations of a Phone in the leetcode.
class Solution {
    private final String[] map = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return result;
        }

        backTrack(result, digits, 0, new StringBuilder());
        return result;
    }

    private void backTrack (List<String> result, String digits, int index, StringBuilder current) {
        if (digits.length() == index) {
            result.add(current.toString());
            return;
        }

        String letters = map[digits.charAt(index) - '2'];

        for (int i = 0; i < letters.length(); i++) {
            current.append(letters.charAt(i));
            backTrack(result, digits, index+1, current);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
