/*
 * @lc app=leetcode id=80 lang=java
 *
 * [80] Remove Duplicates from Sorted Array II
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 2;
        for( int i = 2; i < nums.length; i++){
            if(nums[i] != nums[j-2]){
                nums[j] = nums[i];
            }
            else{
                continue;
            }
            j++;
        }
        return j;
    }
}
// @lc code=end

