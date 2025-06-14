Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.



class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        int start = 0 ;
        int end = s.length()-1;

        while(start <= end){

            char first = s.charAt(start);
            char last = s.charAt(end);

            if(!Character.isLetterOrDigit(first)){
                start++;

            }
            else if(!Character.isLetterOrDigit(last)){
                end--;
            }

            else{
                if(Character.toLowerCase(first)!=Character.toLowerCase(last)){
                    return false;
                }
                start++;
                end--;
            }
        }

        return true;
        
    }
}




====================================================================

class Solution {
    public boolean isPalindrome(String s) {
        s= s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int n= s.length();

        return check(s,0,n);


    }

    public boolean check(String s,int i, int n){
        if(i>=n/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(n-i-1)){
            return false;
        }
        return check(s,i+1,n);
    }
}