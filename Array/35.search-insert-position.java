package Array;

/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        // define the properties
        int l = 0;
        int h = nums.length-1;
        int value = search(nums,l,h,target);
        
        return value;
    }
    public int search(int[] arr,int l,int h,int target){
        int mid = 0;
        if(l<=h){
            mid = (l+h)/2;
            if(arr[mid] == target|| l == h){
                return mid;
            }
            else if(arr[mid]<target){
                return search(arr,mid+1,h,target);
            }
            else{
                return search(arr,l,mid-1,target);
            }
        }
        return l;
    }
}
// @lc code=end

