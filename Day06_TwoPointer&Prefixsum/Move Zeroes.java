Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 

class Solution {
    public void moveZeroes(int[] nums) {

        int temp =-1;

        for(int i= 0 ; i< nums.length ; i++){
            if(temp==-1 && nums[i]==0){
                temp = i;
            }else if(temp!=-1 && nums[i]!= 0){
                nums[temp] = nums[i];
                nums[i]=0;
                i= temp;
                temp =-1;
            }
        }
        
    }
}