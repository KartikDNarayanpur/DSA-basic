import java.util.Scanner;

public class buy_sell_stocks {
    public static int buy_sell_s( int prices[]){
        int buy_price= Integer.MAX_VALUE;
        int max_profit=0;
        for (int i=0;i<prices.length;i++){
            if(buy_price<prices[i]){
                int profit= prices[i]-buy_price;
                max_profit= Math.max(max_profit, profit);
            }else{
                buy_price=prices[i];
            }
        }
        return max_profit;

    }
    public static void main(String []args ){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the nuber of prices");
        int n= sc.nextInt();
        int []prices= new int [n];
        System.out.println("enter the  prices");
         for(int i=0;i<n;i++){
           prices[i] =sc.nextInt();
         }
         System.out.println(buy_sell_s( prices));
    }
    
}
