// Solution for the Roman to Integer problem in leetcode.

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        int val = 0;

        Map<Character, Integer> romanVal = new HashMap<>();
        romanVal.put('I', 1);
        romanVal.put('V', 5);
        romanVal.put('X', 10);
        romanVal.put('L', 50);
        romanVal.put('C', 100);
        romanVal.put('D', 500);
        romanVal.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            int currentVal = romanVal.get(s.charAt(i));

            if (i+1 < s.length()) {
                int nextVal = romanVal.get(s.charAt(i+1));

                if (currentVal >= nextVal) {
                    val += currentVal;
                }
                else {
                    val -= currentVal;
                }
            }
            else {
                val += currentVal;
            }
        }
        
        return val;
    }
}
