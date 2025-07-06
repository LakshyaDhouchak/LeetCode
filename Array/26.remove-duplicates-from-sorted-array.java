package Array;
/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        // define the properties
        int count =0;
        // define the for loop
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[count]){
                count++;
                nums[count] = nums[i];
            }
               
        }
       return count+1 ; 
    }
}
// @lc code=end

