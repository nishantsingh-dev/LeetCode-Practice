Next Greater Element I

Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
- 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
- 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.


class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] res = new int[nums1.length];

        for( int num : nums2){

            while(!st.isEmpty() && st.peek()<num){
                map.put(st.pop(), num);
            }
            st.push(num);

        }

        for(int i=0 ; i<nums1.length ; i++){
            res[i] = map.getOrDefault(nums1[i],-1);
        }

        return res;
        
    }
}