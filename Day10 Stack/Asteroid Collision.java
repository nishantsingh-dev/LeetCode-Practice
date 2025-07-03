Asteroid Collision



Input: asteroids = [5,10,-5]
Output: [5,10]
Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.


class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int ast : asteroids){

            if(ast>0){
                st.push(ast);
            }else{
                while(!st.isEmpty() && st.peek()>0 && st.peek() < -ast){
                   st.pop();
                }

                if(st.isEmpty() || st.peek()<0){
                    st.push(ast);
                }

                if(st.peek()== -ast){
                    st.pop();
                }
            }
        }

        int[] res = new int[st.size()];
        int i = res.length-1;
        while(!st.isEmpty()){
          res[i--] = st.pop();
        }

        return res;
        
    }
}