/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while(low <= high){

            int mid = (low + high) / 2;

            // target found
            if(nums[mid] == target){
                return mid;
            }

            // left half is sorted
            if(nums[low] <= nums[mid]){

                // target lies in left half
                if(target >= nums[low] && target < nums[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }

            // right half is sorted
            else{

                // target lies in right half
                if(target > nums[mid] && target <= nums[high]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}
// @lc code=end

