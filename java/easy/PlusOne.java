// Solution for the problem, Plus One in the leetcode.
class Solution {
    public int[] plusOne(int[] digits) {
        int last = digits.length - 1;
        int index = last;

        if (digits[last] == 9) {
            while (index > 0 && digits[index] == 9) {
                digits[index] = 0;
                index --;
            }

            if (index > 0 || digits[index] != 9) {
                digits[index] ++;
            }
            else {
                int[] newDigits = new int[digits.length + 1];
                newDigits[0] = 1;
                for (int i = 1; i < newDigits.length; i ++) {
                    newDigits[i] = 0;
                }
                return newDigits;
            }
        }
        else {
            digits[last] ++;
        }  
        
        return digits;
    }
}
