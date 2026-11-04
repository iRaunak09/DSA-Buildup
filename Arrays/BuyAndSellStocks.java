public class BuyAndSellStocks {
    
    public static int buyAndSell(int prices[]){
        int maxProfit = 0;
        int buy = Integer.MAX_VALUE;
        int sell = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] > buy){
                int profit = prices[i] - buy;
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }else {
                buy = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {1,9,0,3,6,4};
        System.out.println(buyAndSell(prices));
    }
}
