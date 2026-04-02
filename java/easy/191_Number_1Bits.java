//Solution for the problem, Number of 1 Bits in the leetcode.
class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        
        while (n > 0) {
            count += (n & 1);
            n >>>= 1;
        }

        return count;
    }
}
