// Solution for Palindrome Number problem in leetcode.

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int original = x;
        int oneDigit = 0;
        int reverse = 0;

        while (x != 0) {
            reverse *= 10;
            oneDigit = x % 10;
            x /= 10;
            reverse += oneDigit;
        }

        return reverse == original;
    }
}
