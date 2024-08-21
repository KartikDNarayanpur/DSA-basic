public class stocksbuySell {
    public static int stock_f (int [] prices){
        int max_profit=0;
        int buy_price= Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if (buy_price<prices[i]){//profit
            int profit = prices[i]-buy_price;//total profit

            max_profit= Math.max(profit,max_profit);

            }else{
                buy_price=prices[i];
            }
        }
        return max_profit;

    }
    public static void main(String[]ags){
        int prices[]={7,1,5,3,6,4};
        System.out.println(stock_f (prices));


    }
    
}
