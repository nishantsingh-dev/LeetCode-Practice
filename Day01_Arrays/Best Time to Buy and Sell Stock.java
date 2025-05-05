class Solution {
    public int maxProfit(int[] prices) {

        int max =  Integer.MIN_VALUE; 
        int lsf = Integer.MAX_VALUE;

        for(int i= 0 ; i< prices.length ; i++){
          if(prices[i]<lsf){
            lsf= prices[i];
          }
          int curr= prices[i] - lsf;
          max = Math.max(max, curr);
        }
        return max;
        
    }
}