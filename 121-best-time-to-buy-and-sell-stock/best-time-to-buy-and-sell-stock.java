class Solution {
    public int maxProfit(int[] prices) {
        int buy =Integer.MAX_VALUE;
        int maxpro=0;
        for(int price:prices){
            if(price<buy){
                buy=price;
            }
            int profit=price-buy;
            if(profit>maxpro){
                maxpro=profit;
            }
        }
        return maxpro;

    }
}