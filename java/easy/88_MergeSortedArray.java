// Solution for the problem, Merge Sorted Array, in the leetcode.
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] origin = nums1.clone();
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < m + n; i ++) {
            if (count1 == m) {
                nums1[i] = nums2[count2 ++];
            }
            else if (count2 == n) {
                nums1[i] = origin[count1 ++];
            }
            else {
                if (origin[count1] <= nums2[count2]) {
                    nums1[i] = origin[count1 ++];
                }
                else {
                    nums1[i] = nums2[count2 ++];
                }
            }
        }
    }
}
