class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //HashMap<Integer, Integer> map = new HashMap<>();

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i<nums.length ; i++){
           //Second Attempt - space complexity =O(k), time O(n)
            if(set.contains(nums[i])){
                return true;
            }

            set.add(nums[i]);

            if(set.size()> k){
                set.remove(nums[i-k]);
            }


            /*Second Attempt - space complexity =O(n), time O(n)
            if(map.containsKey(nums[i]) && Math.abs(i-map.get(nums[i]))<= k){
                    return true;
            }
              map.put(nums[i], i);*/
            
            /*First Attempt -
            for(int j= i+1 ; j< nums.length ; j++){
                if(nums[i]==nums[j] && Math.abs(i-j)<= k){
                    return true;            
                }
            }*/
        }
        return false;
    }
}