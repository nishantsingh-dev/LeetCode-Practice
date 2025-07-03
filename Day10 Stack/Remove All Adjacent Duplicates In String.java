Remove All Adjacent Duplicates In String


Input: s = "abbaca"
Output: "ca"


class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){
            if(!st.isEmpty()){
                if(st.peek() != ch){
                    st.push(ch);
                }else{
                    st.pop();
                }
            }
            else{
                st.push(ch);

            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}