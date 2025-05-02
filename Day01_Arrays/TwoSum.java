class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> lMap = new HashMap<>();

        for(int i= 0 ;  i < nums.length ; i++){
            int complement = target - nums[i];
            if(lMap.containsKey(nums[i])){
                return new int[]{lMap.get(nums[i]), i};
            }
            lMap.put(complement, i);
        }

        return new int[]{0,0};
    }
}