class Solution {
    public int maxProfit(int[] prices) {
        int profit=0, curr=0;
        int i, j, n;
        n = prices.length;
        int min=prices[0];
        for(i=1;i<n;i++){
            if(min>prices[i]){
                min = prices[i];
            }
            if(prices[i]!=min){
                curr = prices[i]-min;
            }
            if(profit<curr){
                profit=curr;
            }
        }
        return profit;

    
    }
}