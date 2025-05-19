Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

class Solution {
    public String reverseWords(String s) {

        String temp = "";
        String ans ="";

        int i = 0 ; 
        int j = s.length()-1;

        while(j>=i){
            char ch = s.charAt(j);

            if(ch != ' '){

                temp+= ch;

            }else if(ch == ' '){
                if(ans!=""){
                    ans = temp + " " + ans;
                }else{
                    ans = temp ;
                }
                temp ="";
            }
            j--;

        }

        if(temp!= ""){
            if(ans!=""){
                    ans = temp + " " + ans;
                }else{
                    ans = temp ;
                }
        }

        return ans;
        
    }
}