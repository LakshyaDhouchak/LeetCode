package Array;
/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int count =0;
        int i=0;
        int j= nums.length-1;
        // define the for loop
        while(i<=j){
            // define the condition
            while(i<=j&&nums[i] != val){
                count++;
                i++;
            }
            while(j>=i&&nums[j]== val){
                j--;
            }
            if(i<=j&&nums[i] == val && nums[j]!= val){
                int pointer = nums[i];
                nums[i]= nums[j];
                nums[j] = pointer;
                i++;
                j--;
                count++;
            }
        }
        return count;
    }
}
// @lc code=end

