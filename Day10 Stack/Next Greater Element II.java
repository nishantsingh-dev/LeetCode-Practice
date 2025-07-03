Next Greater Element II

Input: nums = [1,2,1]
Output: [2,-1,2]
Explanation: The first 1's next greater number is 2; 
The number 2 can't find next greater number. 
The second 1's next greater number needs to search circularly, which is also 2.


class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int[] res = new int[nums.length];
        int n = nums.length;

        for(int i = 2*n-1 ; i>=0 ; i--){
            int index = i%n;

            while(!st.isEmpty() && st.peek()<= nums[index]){
                st.pop();
            }

            res[index] = st.isEmpty()? -1 : st.peek();

            st.push(nums[index]);
        }

        return res;
    }
}