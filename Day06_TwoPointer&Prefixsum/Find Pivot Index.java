Find Pivot Index

Example 1:

Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11


class Solution {
    public int pivotIndex(int[] nums) {

        int totalSum = 0;
        int leftSum = 0 ;

        for(int n : nums){
            totalSum += n;
        }
        
        for(int i = 0 ; i< nums.length ; i++){
            
            if(leftSum*2 == totalSum - nums[i]){
                return i ;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}