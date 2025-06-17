Running Sum of 1d Array

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].



class Solution {
    public int[] runningSum(int[] nums) {

        for(int i =1 ; i<nums.length ; i++){
            nums[i]+=nums[i-1];
        }

        return nums;
        
    }
}