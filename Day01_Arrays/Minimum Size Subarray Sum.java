class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i =0 ;
        int j= 0 ;

        int min = Integer.MAX_VALUE;
        int sum = 0;

        while(j<nums.length){
            sum += nums[j];
            while(sum>=target){
                int len = j-i+1;
                min = Math.min(min, len);
                sum-=nums[i++];
            }
            j++;
        }

        return min== Integer.MAX_VALUE? 0 : min;
    }
}