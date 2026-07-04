package Arrays;
//121 leetcode best time to buy and sell stock
public class BuyAndSell {
    public static int Profit(int prices[]){
        int profit=0;
        int buy=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }else{
                profit=Math.max(profit,prices[i]-buy);
            }
        }


        return profit;
    }
    public static void main(String[]args){
        int prices[]={7,1,5,3,6,4};
        System.out.println(Profit(prices));

    }
}
