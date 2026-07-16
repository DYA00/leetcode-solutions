// Solution for the problem, Generate Parentheses in the leetcode.

class Solution {
    List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        cases(result, new StringBuilder(), n*2, n, n);

        return result;
    }

    private void cases(List<String> result, StringBuilder sb, int max, int open, int close) {
        if (sb.length() == max) {
            result.add(sb.toString());
        }
        else {
            if (open == close) {
                sb.append("(");
                cases(result, sb, max, open-1, close);
                sb.setLength(sb.length() - 1);
            }
            else {
                if (open > 0) {
                    sb.append("(");
                    cases(result, sb, max, open-1, close);
                    sb.setLength(sb.length() - 1);
                }

                if (close > 0) {
                    sb.append(")");
                    cases(result, sb, max, open, close-1);
                    sb.setLength(sb.length() - 1);
                }
            }
        }
    }
}
