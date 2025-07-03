Evaluate Reverse Polish Notation

Input: tokens = ["2","1","+","3","*"]
Output: 9
Explanation: ((2 + 1) * 3) = 9

class Solution {
    public int evalRPN(String[] tokens) {
        int a,b;
        Stack<Integer> st = new Stack<>();

        for(String token : tokens){
            if(token.equals("+")){
                st.add(st.pop()+st.pop());
            }
            else if(token.equals("-")){
                 b =st.pop();
                 a =st.pop();
                st.add(a-b);
            }
            else if(token.equals("*")){
                st.add(st.pop()*st.pop());
            }
            else if(token.equals("/")){
                 b =st.pop();
                 a =st.pop();
                st.add(a/b);
            }else{
                st.add(Integer.parseInt(token));
            }

        }

        return st.pop();
        
    }
}