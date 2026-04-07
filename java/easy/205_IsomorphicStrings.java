//Solution for the prolblem, Isomorphic Strings in the leetcode.
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> used = new HashSet<>();

        for (int i = 0; i < s.length(); i ++) {
            char sub1 = s.charAt(i);
            char sub2 = t.charAt(i);

            if (map.containsKey(sub1)) {
                if (map.get(sub1) != sub2) {
                    return false;
                }
            }
            else {
                if (used.contains(sub2)) {
                    return false;
                }
            }

            map.put(sub1, sub2);
            used.add(sub2);
        }

        return true;
    }
}
