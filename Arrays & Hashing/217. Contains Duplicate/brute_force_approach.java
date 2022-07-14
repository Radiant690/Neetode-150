/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // ? Brute approach -> We will use two loops to compare one item with the other.
        // ! Edge case is that, if we were to compare the items we have current then it
        // would consider as an duplicate automatically.
        // ! To avoid this we write j= i+1;

        int i, j;
        int n = nums.length;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
// @lc code=end
