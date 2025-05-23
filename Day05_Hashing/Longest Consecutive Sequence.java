Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9


class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }
        int longest = 0;
        for(int num : set){

            if(!set.contains(num-1)){

                int length = 1;

                while(set.contains(num+length)){

                    length++;
                }
                longest = Math.max(length, longest);
            }

        }
        return longest;
        
    }
}