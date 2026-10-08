// Solution for the problem, Pow(x, n) in the leetcode.
class Solution {
    public double myPow(double x, int n) {
        long N = n;

        if (N < 0) {
            N = -N;
        }

        double result = 1.0;
        double current = x;

        while (N > 0) {
            if (N % 2 == 1) {
                result *= current;
            }

            current *= current;
            N /= 2;
        }

        if (n < 0) {
            return 1.0 / result;
        }

        return result;
    }
}
