Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

class Solution {
    public boolean isPalindrome(int x) {
        int reversedNum = 0, remainder;
    
    
    int originalNum = x;
    if (x<0 || (x != 0 && x % 10 == 0)){
        return false;
    }
    
    while (x != 0) {
      remainder = x % 10;
      reversedNum = reversedNum * 10 + remainder;
      x /= 10;
    }
        
        if(originalNum==reversedNum){
            return true;
        }
        else
            return false;
    }
}