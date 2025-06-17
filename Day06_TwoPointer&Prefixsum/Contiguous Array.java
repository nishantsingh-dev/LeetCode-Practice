Contiguous Array

Example 1:

Input: nums = [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.
Example 2:

Input: nums = [0,1,0]
Output: 2
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
Example 3:

Input: nums = [0,1,1,1,1,1,0,0,0]
Output: 6
Explanation: [1,1,1,0,0,0] is the longest contiguous subarray with equal number of 0 and 1.


class Solution {
    public int findMaxLength(int[] nums) {

        for(int i = 0 ; i<nums.length ; i++){
            nums[i]=nums[i]==0?-1:nums[i];
        }

        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0 ;
        int sum =0 ;

        for(int i = 0 ; i<nums.length ; i++){  

            sum += nums[i];
            if(sum ==0){
                ans = i+1;
            }     

            if(map.containsKey(sum)){
                int len = i - map.get(sum);
                ans = Math.max(len, ans);
            }else{
            map.put(sum,i);
            }

        } 

        return ans; 
    }
}