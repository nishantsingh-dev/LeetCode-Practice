Min Stack

Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]

class MinStack {
    long min;
    Stack<Long> st;

    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {

        if(st.isEmpty()){
            st.push(0L);
            min = val;
        }else{
            st.push(val-min);
            if(val<min){
                min = val;
            }

        }
        
    }
    
    public void pop() {

        long popped =st.pop();
        if(popped< 0){
            min = min - popped;
        }
        
    }
    
    public int top() {

        long peeked =st.peek();
        if(peeked>0){
        return (int) (peeked + min);
        }else {return(int) min;}
    }
    
    public int getMin() {
        return (int) min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */