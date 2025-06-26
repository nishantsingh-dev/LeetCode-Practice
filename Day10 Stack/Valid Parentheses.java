Valid Parentheses

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{' ){
                st.push(ch);
            }
            else if(!st.isEmpty() && (st.peek()=='(' && ch==')' ||
            st.peek()=='[' && ch==']' ||
            st.peek()=='{' && ch=='}')){
                st.pop();
            }else{
                return false;
            }
        }

        return st.isEmpty();
        
    }
}

===============================================================================

class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top= -1;
        for (char c:s.toCharArray())
        {
            if(c=='(')
            {
                stack[++top]=')';
            }
            else if( c=='{')
            { 
                stack[++top]='}';
             } 
            else if( c=='[')
            {
                stack[++top]=']';
            }   
            else{
             if(top==-1 || stack[top--]!=c)
                {
                    return false;
                }
            }
        }
        return top==-1;
    }
}