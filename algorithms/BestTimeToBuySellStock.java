package algorithms;

public class BestTimeToBuySellStock {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE, maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice)
                minPrice = price;
            else if (price - minPrice > maxProfit)
                maxProfit = price - minPrice;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println("Max Profit: " + maxProfit(prices));
        System.out.println("Max Profit: " + maxProfit1(prices));
        // output: Max Profit: 5

        // Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit =
        // 6-1 = 5.
        // Note that buying on day 2 and selling on day 1 is not allowed because you
        // must buy before you sell.
    }

    public static int maxProfit1(int[] prices) {
        return 0;
    }
}