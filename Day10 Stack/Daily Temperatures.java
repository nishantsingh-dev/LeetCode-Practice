Daily Temperatures

Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]



class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> st = new Stack();

        int[] ans = new int[temp.length];

        for(int i = temp.length -1 ; i>=0 ; i--){

            while(!st.isEmpty() && temp[st.peek()]<= temp[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i]= st.peek()-i;
            }
            st.push(i);
        }

        return ans;
    }
}