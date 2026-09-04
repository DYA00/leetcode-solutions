// Solution for the problem, Median of Two sorted Arrays in the leetcode.
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        
        int m = nums1.length;
        int n = nums2.length;

        int left = 0;
        int right = m;

        int half = (m + n + 1) / 2;

        while (left <= right) {
            int part1 = (left + right) / 2;
            int part2 = half - part1;

            int left1 = (part1 == 0) ? Integer.MIN_VALUE : nums1[part1 - 1];
            int right1 = (part1 == m) ? Integer.MAX_VALUE : nums1[part1];
            int left2 = (part2 == 0) ? Integer.MIN_VALUE : nums2[part2 - 1];
            int right2 = (part2 == n) ? Integer.MAX_VALUE : nums2[part2];

            if (left1 <= right2 && left2 <= right1) {
                if ((m+n) % 2 == 1) {
                    return Math.max(left1, left2);
                }

                int maxLeft = Math.max(left1, left2);
                int minRight = Math.min(right1, right2);

                return (maxLeft + minRight) / 2.0;
            }
            else if (left1 > right2) {
                right = part1 - 1;
            }
            else {
                left = part1 + 1;
            }
        }

        return 0.0;
    }
}
