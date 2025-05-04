class Solution {
    public void sortColors(int[] nums) {
        int l= 0 , mid = 0 , h = nums.length-1;

        while(mid<=h){
            if(nums[mid]== 0){
                swap(nums, mid, l);
                l++;
                mid++;

            }else if(nums[mid] == 1){
                mid++;

            }else{
                swap(nums, mid,h);
                h--;
            }
        }
        
    }

    public void swap( int[] nums, int l, int h){
         int temp = nums[l];
         nums[l]= nums[h];
         nums[h] = temp;
    }
}