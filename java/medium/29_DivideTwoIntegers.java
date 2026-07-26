// Solution for the problem, Divide Two Integers in the leetcode.
class Solution {
    public int divide(int dividend, int divisor) {
        int result = 0;
        boolean negative = (dividend < 0) ^ (divisor < 0);

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        long upper = Math.abs((long) dividend);
        long bottom = Math.abs((long) divisor);

        while (upper >= bottom) {
            long temp = bottom;
            long multiple = 1;

            while ((temp << 1) <= upper) {
                temp <<= 1;
                multiple <<= 1;
            }

            upper -= temp;
            result += multiple;
        }

        if (!negative) {
            return result;
        }
        return result * -1;
    }
}
