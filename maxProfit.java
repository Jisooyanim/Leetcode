public class maxProfit {
    public static void main(String[] args) {
        int[] prices = {2,4,1};
        System.out.println(Solution(prices));
    }

    public static int Solution(int[] prices) {
        int maxProfit = 0;
        int small = prices[0];

        for(int i=1; i<prices.length;i++) {
            if (small > prices[i]) {
                small = prices[i];
            }

            int profit = prices[i] - small;
            if(maxProfit < profit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
