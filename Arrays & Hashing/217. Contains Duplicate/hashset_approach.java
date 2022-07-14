import java.util.HashSet;

/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start
class Solution {
    // ? Hashset approach - we will be creating a hashset and use the contains
    // function to check for the item or else i will add it to the hashset.

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for (var i = 0; i < nums.length; i++) {
            if (hash.contains(nums[i]))
                return true;
            hash.add(nums[i]);
        }
        return false;
        // HashSet<Integer> hash = new HashSet<>();
        // for(int num: nums){
        // if(hash.contains(num))
        // return true;
        // hash.add(num);
        // }
    }
}
// @lc code=end
