Factorial Trailing Zeroes


Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.

 

Example 1:

Input: n = 3
Output: 0
Explanation: 3! = 6, no trailing zero.
Example 2:

Input: n = 5
Output: 1
Explanation: 5! = 120, one trailing zero.


class Solution {
    //int count =0;
    public int trailingZeroes(int n) {

       if(n<5){
        return 0;
       }

       return n/5 + trailingZeroes(n/5);
        
    }
}