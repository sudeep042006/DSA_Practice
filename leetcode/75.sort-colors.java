/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {

                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;

                low++;
                mid++;

            }
            else if (nums[mid] == 1) {

                mid++;

            }
            else {

                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }
}
// @lc code=end

