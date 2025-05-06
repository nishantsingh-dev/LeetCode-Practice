class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()){
            return 0;
        }
        int charIndex[]= new int[128];
        Arrays.fill(charIndex,-1);
        int ans =Integer.MIN_VALUE;

        int i=0;
        for (int j= 0 ; j< s.length() ;j++){
            if(charIndex[s.charAt(j)]>=i){
                i=charIndex[s.charAt(j)]+1;
            }
            charIndex[s.charAt(j)] = j;

            ans = Math.max(ans, j-i+1);

        }
        return ans;
    }
}