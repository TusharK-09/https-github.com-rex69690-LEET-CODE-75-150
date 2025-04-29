class Solution {
    public int buyChoco(int[] prices, int money) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < first){
                second = first;
                first =  prices[i];
            }
            else if(prices[i] < second){
                second = prices[i];
            }
        }
        sum = first + second;
        if(sum <= money){
             return money - sum;

        }
        else {
            return money;
        }
        
    }
}