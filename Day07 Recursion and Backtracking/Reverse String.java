Reverse String

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:






class Solution {
    public void reverseString(char[] s) {
        reverse(s,0,s.length-1);
    }

    public void reverse(char[] s, int left, int right){

        if(left>right){return ; }

        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        reverse(s, left+1, right - 1);

    }
}