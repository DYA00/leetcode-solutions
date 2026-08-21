//Solution for the problem, Multiply Strings in the leetcode.
class Solution {
    public String multiply(String num1, String num2) {
        int length1 = num1.length();
        int length2 = num2.length();
        int[] nums = new int[length1 + length2];

        for (int i = length1 - 1; i >= 0; i--) {
            for (int j = length2 - 1; j >= 0; j--) {
                int a = num1.charAt(i) - '0';
                int b = num2.charAt(j) - '0';

                int product = a * b;
                nums[i+j+1] += product;
                nums[i+j] += nums[i+j+1] / 10;
                nums[i+j+1] %= 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num : nums) {
            if (sb.length() == 0 && num == 0) {
                continue;
            }
            sb.append(num);
        }
        
        if (sb.length() > 0) {
            return sb.toString();
        }
        return "0";
    }
}
