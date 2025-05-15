Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false


class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count= new int[26];

        for(char ch : s.toCharArray()){
            count[ch-'a']++;
        }

        for(char ch : t.toCharArray()){
            count[ch-'a']--;
        }


        for(int c : count){
            if(c!=0){
                return false;
            }
            
        }
        return true;
    }
}