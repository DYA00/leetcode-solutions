// Solution for the problem, Ugly Number in the leetcode.
class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) return false;
        boolean isUgly = false;

        while (n != 1 && !isUgly) {
            if (n % 2 == 0) {
                n /= 2;
            }
            else if (n % 3 == 0) {
                n /= 3;
            }
            else if (n % 5 == 0) {
                n /= 5;
            }
            else {
                isUgly = true;
            }
        }

        return (n == 1 ? true : false);
    }
}
