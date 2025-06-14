Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49

class Solution {
    public int maxArea(int[] h) {

        int left = 0;
        int right = h.length-1;
        int ans = Integer.MIN_VALUE;

        while(left<right){

            int hi = Math.min(h[left],h[right]);
            int b = right-left;

            ans = Math.max(b*hi, ans);

            if(h[left]<h[right]){
                left++;
            }else if(h[left]>h[right]){
                right--;
            }else{
                left++;
                right--;
            }

            
        }

        return ans;
        
    }
}