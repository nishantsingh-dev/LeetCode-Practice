Isomorphic Strings

Example 1:

Input: s = "egg", t = "add"

Output: true


class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> charIndexS = new HashMap<>();
        HashMap<Character, Integer> charIndexT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!charIndexS.containsKey(s.charAt(i))) {
                charIndexS.put(s.charAt(i), i);
            }

            if (!charIndexT.containsKey(t.charAt(i))) {
                charIndexT.put(t.charAt(i), i);
            }

            if (!charIndexS.get(s.charAt(i)).equals(charIndexT.get(t.charAt(i)))) {
                return false;
            }
        }

        return true;        
    }
}


=======================================================================================


class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        int[] arr1= new int[256];
        int[] arr2= new int[256];

        for(int i=0 ; i<s.length() ; i++){
            if(arr1[s.charAt(i)]!= arr2[t.charAt(i)]){
                return false;
            }
            arr1[s.charAt(i)]=i+1;
            arr2[t.charAt(i)]=i+1;
        }

        return true;

    }
}