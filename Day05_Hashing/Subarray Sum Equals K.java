Example 1:

Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2



class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        Map<Integer, Integer> map= new HashMap<>();
        map.put(0,1);
        int sum=0;

        for(int num: nums){

             sum+= num;
             int diff= sum-k;

             if(map.containsKey(diff)){
                count+= map.get(diff);
             }
             map.put(sum, map.getOrDefault(sum,0)+1);

        }


        return count;
    }
}