class Solution {
    public int maxProfit(int[] prices) {
        int m=0;
        int buy=prices[0];
        for(int i=0;i<prices.length;i++){
            int n=prices[i]-buy;
            if(n>m){
                m=n;
            }
            if(buy>prices[i]){
                buy=prices[i];
            }
        }
        return m;
    }
}
