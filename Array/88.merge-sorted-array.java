package Array;

/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // define the properties
	int[] output = new int[m+n];
	int i=0;
	int j=0;
	int k=0;
	// define the condition
	while(i<m&&j<n){
		// define the condition
		if(nums1[i]<=nums2[j]){
			output[k]= nums1[i];
			k++;
			i++;
		}
		else{
			output[k]=nums2[j];
			j++;
			k++;
		}

	}
	// print the remaining
	while(i<m){
		output[k] = nums1[i];
		i++;
		k++;
	}
	while(j<n){
		output[k] = nums2[j];
		j++;
		k++; 
	}
	for(i=0;i<output.length;i++){
        nums1[i] = output[i];
    }
    }
}
// @lc code=end

