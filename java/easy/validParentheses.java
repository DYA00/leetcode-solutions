// Solution for Valid Parentheses problem in the leetcode.

class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> matching = new HashMap<>();
        matching.put (')', '(');
        matching.put ('}', '{');
        matching.put (']', '[');

        Stack<Character> stack= new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);

            if (matching.containsValue(bracket)) {
                stack.push(bracket);
            }
            else if (matching.containsKey(bracket)) {
                if (stack.isEmpty()) return false;
                
                char preBracket = stack.pop();
                if (preBracket != matching.get(bracket)) {
                    return false;
                }
            }

        }

        return stack.isEmpty();
    }
}
