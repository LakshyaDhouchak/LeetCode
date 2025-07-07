package Array;

/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        // define the properties
        int[] arr = new int[digits.length+1];
        for(int i=0;i<digits.length;i++){
            arr[i+1] = digits[i];
        }
    
            //define the for loop
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]+1==10){
                arr[i]=0;

            }
            else{
                arr[i]= arr[i]+1;
                break;
            }
        }    
        
        if(arr[0]==0){
            for(int i=0;i<arr.length-1;i++){
                digits[i]= arr[i+1];
            }
            return digits;

        }
        return arr;
    }
}
// @lc code=end

