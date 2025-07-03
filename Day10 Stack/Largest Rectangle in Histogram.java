Largest Rectangle in Histogram

Input: heights = [2,1,5,6,2,3]
Output: 10
Explanation: The above is a histogram where width of each bar is 1.
The largest rectangle is shown in the red area, which has an area = 10 units.

class Solution {
    public int largestRectangleArea(int[] h) {
        Stack<Integer> st = new Stack();
        int ans =0;

        for(int i = 0 ; i<h.length ; i++){
            while(!st.isEmpty() && h[st.peek()]> h[i]){
               int height = st.pop();
               int width =  st.isEmpty() ? i : i - st.peek()-1;
               int area = width*h[height];
               ans =Math.max(area ,ans);
            }
            st.push(i);
        }
        int n = h.length;
        if(!st.isEmpty()){
             int height = st.pop();
               int width =  st.isEmpty()? n : n - st.peek()-1;
               int area = width*h[height];
               ans = Math.max(area,ans);
        }

        return ans;


        
    }
}