package Array;
/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // define the for loop
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                // define the base condition
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
        
    }
}
// @lc code=end

